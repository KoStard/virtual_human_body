package org.MedStard.types.NeuralSystem;

import java.util.LinkedList;
import java.util.Vector;

import org.MedStard.types.AbstractTypes.Excitable;
import org.MedStard.types.AbstractTypes.Group;
import org.MedStard.types.AbstractTypes.Initializable;
import org.MedStard.types.AbstractTypes.Named;

/**
 * 
 * NeuralPathGroup can contain either NeuralPath or NeuralPathGroup (recursive)
 * 
 * @author rubenkostandyan
 *
 */

public abstract class NeuralPathGroup implements Excitable, Named, Group<NeuralPathElement>, NeuralPathElement, Initializable {
	private Vector<NeuralPathElement> elements;
	private String name;
	private LinkedList<NeuralPathGroup> owners;

	public NeuralPathGroup(String name) {
		elements = new Vector<>();
		owners = new LinkedList<>();
		setName(name);
	}

	/**
	 * Same NeuralPath can be included in multiple NeuralPathGroups, so we have to
	 * initialize these where we create them!
	 */
//	@Override
//	public void initialize() {
//		for (NeuralPathElement e : elements) {
//			e.initialize();
//		}
//	}

	@Override
	public void stimulate() {
        System.out.println(String.format("The neural path group %s is stimulating.", getName()));
		for (NeuralPathElement n : elements) {
			n.stimulate();
		}
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Boolean hasOwner() {
		return owners.isEmpty();
	}

	@Override
	public void appendOwner(NeuralPathGroup g) {
		owners.add(g);
	}

	@Override
	public void removeOwner(NeuralPathGroup g) {
		owners.remove(g);
	}

	@Override
	public void addElement(NeuralPathElement e) {
		elements.add(e);
	}

	@Override
	public void removeElement(NeuralPathElement e) {
		elements.remove(e);
	}

	@Override
	public LinkedList<NeuralPathGroup> getOwners() {
		return owners;
	}

	@Override
	public Vector<NeuralPathElement> getElements() {
		return elements;
	}

	@Override
	public void bindElement(NeuralPathElement e) {
		addElement(e);
		e.appendOwner(this);
	}

	@Override
	public NeuralPathElement getElementByIndex(int i) {
		return elements.get(i);
	}
}

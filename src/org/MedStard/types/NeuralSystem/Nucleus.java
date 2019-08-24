package org.MedStard.types.NeuralSystem;

import java.util.LinkedList;
import java.util.Vector;

import org.MedStard.types.AbstractTypes.Excitable;
import org.MedStard.types.AbstractTypes.Group;
import org.MedStard.types.AbstractTypes.Named;

/**
 * 
 * Nucleus - can contain
 * 
 * @author rubenkostandyan
 *
 */

public class Nucleus implements Excitable, Named, Group<NucleusElement>, NucleusElement {
	private String name;
	private Vector<NucleusElement> elements;
	private LinkedList<Nucleus> owners;

	public Nucleus(String name) {
		elements = new Vector<>();
		owners = new LinkedList<>();
		setName(name);
	}

	@Override
	public void stimulate() {
        System.out.println(String.format("The nucleus %s is stimulating.", getName()));
		for (NucleusElement element : elements) {
			element.stimulate();
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
	public void appendOwner(Nucleus g) {
		owners.add(g);
	}

	@Override
	public void removeOwner(Nucleus g) {
		owners.remove(g);
	}

	@Override
	public LinkedList<Nucleus> getOwners() {
		return owners;
	}

	@Override
	public Boolean hasOwner() {
		return owners.isEmpty();
	}

	@Override
	public Vector<NucleusElement> getElements() {
		return elements;
	}

	@Override
	public void addElement(NucleusElement e) {
		elements.add(e);
	}

	@Override
	public void removeElement(NucleusElement e) {
		elements.remove(e);
	}

	@Override
	public void bindElement(NucleusElement e) {
		addElement(e);
		e.appendOwner(this);
	}
}

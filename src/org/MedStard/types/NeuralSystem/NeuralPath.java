package org.MedStard.types.NeuralSystem;

import java.util.LinkedList;

import org.MedStard.types.AbstractTypes.Excitable;
import org.MedStard.types.AbstractTypes.Named;

public class NeuralPath implements Excitable, Named, NeuralPathElement {
    private NeuralPathSource source;
    private NeuralPathTarget target;
    private String name;
    private LinkedList<NeuralPathGroup> owners;

    public NeuralPath(String name) {
        setName(name);
        owners = new LinkedList<>();
    }

    public NeuralPath(String name, NeuralPathSource source, NeuralPathTarget target) {
        setSource(source);
        setTarget(target);
        setName(name);
        owners = new LinkedList<>();
    }

    public NeuralPathSource getSource() {
        return source;
    }

    public void setSource(NeuralPathSource newSource) {
        source = newSource;
        source.addToNeuralOutputs(this);
    }

    public NeuralPathTarget getTarget() {
        return target;
    }

    public void setTarget(NeuralPathTarget newTarget) {
        target = newTarget;
        target.addToNeuralInputs(this);
    }

    @Override
    public void stimulate() {
    	System.out.println("Stimulating NeuralPath");
        this.target.stimulate();
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
	public LinkedList<NeuralPathGroup> getOwners() {
		return owners;
	}
}

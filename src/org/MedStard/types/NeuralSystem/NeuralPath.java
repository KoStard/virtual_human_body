package org.MedStard.types.NeuralSystem;

import org.MedStard.types.AbstractTypes.Excitable;
import org.MedStard.types.AbstractTypes.Named;

public class NeuralPath implements Excitable, Named {
    private NeuralPathSource source;
    private NeuralPathTarget target;
    private String name;

    public NeuralPath(String name) {
        setName(name);
    }

    public NeuralPath(String name, NeuralPathSource source, NeuralPathTarget target) {
        setSource(source);
        setTarget(target);
        setName(name);
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
}

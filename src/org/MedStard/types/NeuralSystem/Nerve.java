package org.MedStard.types.NeuralSystem;

import org.MedStard.types.AbstractTypes.Excitable;
import org.MedStard.types.AbstractTypes.Named;

import java.util.Vector;

public class Nerve implements Excitable, Named {
    private Vector<NeuralPath> neuralPaths;
    private String name;

    public Nerve(String name) {
        neuralPaths = new Vector<NeuralPath>();
        setName(name);
    }

    public void addNeuralPath(NeuralPath newNeuralPath) {
        neuralPaths.add(newNeuralPath);
    }

    public void removeNeuralPath(NeuralPath newNeuralPath) {
        neuralPaths.remove(newNeuralPath);
    }

    @Override
    public void stimulate() {
        for (NeuralPath n : neuralPaths) {
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
}

package org.MedStard.types.NeuralSystem;

import org.MedStard.types.AbstractTypes.Excitable;

import java.util.Vector;

public class Nucleus implements Excitable, NeuralPathSource, NeuralPathTarget {
    private Vector<NeuralPath> neuralInputs;
    private Vector<NeuralPath> neuralOutputs;
    private String name;

    public Nucleus(String name, Vector<NeuralPath> neuralInputs, Vector<NeuralPath> neuralOutputs) {
        this.neuralInputs = new Vector<>(neuralInputs);
        this.neuralOutputs = new Vector<>(neuralOutputs);
        setName(name);
    }

    public Nucleus(String name) {
        neuralOutputs = new Vector<>();
        neuralInputs = new Vector<>();
        setName(name);
    }

    @Override
    public void stimulate() {
        for (int i = 0; i < neuralOutputs.size(); i++) {
            neuralOutputs.elementAt(i).stimulate();
        }
    }

    @Override
    public void addToNeuralOutputs(NeuralPath nerve) {
        neuralOutputs.add(nerve);
    }

    @Override
    public void removeFromNeuralOutputs(NeuralPath nerve) {
        neuralOutputs.remove(nerve);
    }

    @Override
    public NeuralPath[] getNeuralOutputs() {
        return neuralOutputs.toArray(new NeuralPath[neuralOutputs.size()]);
    }

    @Override
    public void addToNeuralInputs(NeuralPath nerve) {
        neuralInputs.add(nerve);
    }

    @Override
    public void removeFromNeuralInputs(NeuralPath nerve) {
        neuralInputs.remove(nerve);
    }

	@Override
	public NeuralPath[] getNeuralInputs() {
		return neuralInputs.toArray(new NeuralPath[neuralInputs.size()]);
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

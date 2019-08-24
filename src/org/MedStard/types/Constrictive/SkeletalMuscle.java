package org.MedStard.types.Constrictive;

import org.MedStard.types.AbstractTypes.Constrictive;
import org.MedStard.types.AbstractTypes.Named;
import org.MedStard.types.NeuralSystem.NeuralPath;
import org.MedStard.types.NeuralSystem.NeuralPathTarget;

import java.util.Vector;

public class SkeletalMuscle implements NeuralPathTarget, Constrictive {
    private Vector<NeuralPath> neuralInputs;
    private String name;

    public SkeletalMuscle(String name) {
        neuralInputs = new Vector<>();
        setName(name);
    }

    @Override
    public void stimulate() {
        System.out.println(String.format("The muscle %s is stimulating.", getName()));
        constrict();
    }

    @Override
    public void constrict() {
        System.out.println(String.format("The muscle %s is constricting.", getName()));
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

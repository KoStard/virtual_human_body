package org.MedStard.types.Constrictive;

import java.util.Vector;

import org.MedStard.types.AbstractTypes.Constrictive;
import org.MedStard.types.AbstractTypes.Initializable;
import org.MedStard.types.NeuralSystem.NeuralPath;
import org.MedStard.types.NeuralSystem.NeuralPathTarget;

public abstract class SkeletalMuscle implements NeuralPathTarget, Constrictive, Initializable {
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

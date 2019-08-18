package org.MedStard.types.Constrictive;

import org.MedStard.types.AbstractTypes.Constrictive;
import org.MedStard.types.NeuralSystem.Nerve;
import org.MedStard.types.NeuralSystem.NerveTarget;

import java.util.Vector;

public class SkeletalMuscle implements NerveTarget, Constrictive {
    Vector<Nerve> nerveInputs;

    public SkeletalMuscle() {
        nerveInputs = new Vector<>();
    }

    @Override
    public void stimulate() {
        constrict();
    }

    @Override
    public void constrict() {
        System.out.println("The muscle is constricting");
    }

    @Override
    public void addToInputNerves(Nerve nerve) {
        nerveInputs.add(nerve);
    }

    @Override
    public void removeFromInputNerves(Nerve nerve) {
        nerveInputs.remove(nerve);
    }

	@Override
	public Nerve[] getInputNerves() {
		return nerveInputs.toArray(new Nerve[nerveInputs.size()]);
	}
}

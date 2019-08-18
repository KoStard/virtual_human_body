package org.MedStard.types.NeuralSystem;

import org.MedStard.types.AbstractTypes.Excitable;

import java.util.Vector;

public class Nucleus implements Excitable, NerveSource, NerveTarget {
    private Vector<Nerve> inputNerves;
    private Vector<Nerve> outputNerves;

    public Nucleus(Vector<Nerve> inputNerves, Vector<Nerve> outputNerves) {
        this.inputNerves = new Vector<>(inputNerves);
        this.outputNerves = new Vector<>(outputNerves);
    }

    public Nucleus() {
        outputNerves = new Vector<>();
        inputNerves = new Vector<>();
    }

    @Override
    public void stimulate() {
        for (int i = 0; i < outputNerves.size(); i++) {
            outputNerves.elementAt(i).stimulate();
        }
    }

    @Override
    public void addToOutputNerves(Nerve nerve) {
        outputNerves.add(nerve);
    }

    @Override
    public void removeFromOutputNerves(Nerve nerve) {
        outputNerves.remove(nerve);
    }

    @Override
    public Nerve[] getOutputNerves() {
        return outputNerves.toArray(new Nerve[outputNerves.size()]);
    }

    @Override
    public void addToInputNerves(Nerve nerve) {
        inputNerves.add(nerve);
    }

    @Override
    public void removeFromInputNerves(Nerve nerve) {
        inputNerves.remove(nerve);
    }

	@Override
	public Nerve[] getInputNerves() {
		return inputNerves.toArray(new Nerve[inputNerves.size()]);
	}
}

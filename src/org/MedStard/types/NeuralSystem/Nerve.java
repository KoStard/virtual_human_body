package org.MedStard.types.NeuralSystem;

import java.util.Vector;

import org.MedStard.types.AbstractTypes.Excitable;

public class Nerve implements Excitable {
    private Vector<NerveSource> sources;
    private Vector<NerveTarget> targets;

    public Nerve() {
    	sources = new Vector<NerveSource>();
    	targets = new Vector<NerveTarget>();
    }

    public Vector<NerveSource> getSource() {
        return sources;
    }

    public void addSource(NerveSource newSource) {
    	sources.add(newSource);
    	newSource.addToOutputNerves(this);
    }

    public Vector<NerveTarget> getTarget() {
        return targets;
    }

    public void addTarget(NerveTarget newTarget) {
        targets.add(newTarget);
        newTarget.addToInputNerves(this);
    }

    @Override
    public void stimulate() {
    	for (NerveTarget t : targets) {
    		t.stimulate();
    	}
    }
}

package org.MedStard.types.NeuralSystem;

import org.MedStard.types.AbstractTypes.Excitable;

public class Nerve implements Excitable {
    private NerveSource source;
    private NerveTarget target;

    public Nerve(NerveSource source, NerveTarget target) {
        this.source = source;
        this.target = target;
    }

    public Nerve() {

    }

    public NerveSource getSource() {
        return source;
    }

    public void setSource(NerveSource newSource) {
        source = newSource;
        source.addToOutputNerves(this);
    }

    public NerveTarget getTarget() {
        return target;
    }

    public void setTarget(NerveTarget newTarget) {
        target = newTarget;
        target.addToInputNerves(this);
    }

    @Override
    public void stimulate() {
        target.stimulate();
    }
}

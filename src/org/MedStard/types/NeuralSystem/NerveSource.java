package org.MedStard.types.NeuralSystem;

public interface NerveSource {
    void addToOutputNerves(Nerve nerve);
    void removeFromOutputNerves(Nerve nerve);
    Nerve[] getOutputNerves();
}

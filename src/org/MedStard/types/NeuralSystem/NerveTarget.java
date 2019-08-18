package org.MedStard.types.NeuralSystem;

import org.MedStard.types.AbstractTypes.Excitable;

public interface NerveTarget extends Excitable {
    void addToInputNerves(Nerve nerve);
    void removeFromInputNerves(Nerve nerve);
}

package org.MedStard.types.NeuralSystem;

import org.MedStard.types.AbstractTypes.Excitable;
import org.MedStard.types.AbstractTypes.Named;

public interface NeuralPathTarget extends Excitable, Named {
    void addToNeuralInputs(NeuralPath nerve);
    void removeFromNeuralInputs(NeuralPath nerve);
    NeuralPath[] getNeuralInputs();
}

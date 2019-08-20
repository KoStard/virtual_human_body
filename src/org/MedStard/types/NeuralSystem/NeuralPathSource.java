package org.MedStard.types.NeuralSystem;

import org.MedStard.types.AbstractTypes.Named;

public interface NeuralPathSource extends Named {
    void addToNeuralOutputs(NeuralPath nerve);
    void removeFromNeuralOutputs(NeuralPath nerve);
    NeuralPath[] getNeuralOutputs();
}

package org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalSegment.WhiteMatter;

import org.MedStard.enums.Sides;
import org.MedStard.types.NeuralSystem.NeuralPath;

public class MuscleStretchAndTensionNerveFibers extends NeuralPath {
    public MuscleStretchAndTensionNerveFibers(int index, Sides side) {
        super(String.format("Muscle stretch and tension nerve fibers of %d %s segment", index, side.label));
    }

    @Override
    public void initialize() {

    }
}
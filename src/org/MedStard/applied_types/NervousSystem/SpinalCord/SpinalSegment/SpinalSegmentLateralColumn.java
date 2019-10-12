package org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalSegment;

import org.MedStard.applied_types.NervousSystem.Brain;
import org.MedStard.enums.Sides;
import org.MedStard.types.NeuralSystem.NeuralPathGroup;

public class SpinalSegmentLateralColumn extends NeuralPathGroup {
    public SpinalSegmentLateralColumn(int index, Sides side, Brain brain) {
        super(String.format("spinal segment N%d %s white matter lateral column", index, side.label));
    }
}

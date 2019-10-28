package org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalSegment.WhiteMatter;

import org.MedStard.applied_types.Human.Organism;
import org.MedStard.enums.Sides;
import org.MedStard.types.NeuralSystem.NeuralPathGroup;

public class SpinalSegmentLateralFuniculus extends NeuralPathGroup {
    public SpinalSegmentLateralFuniculus(int index, Sides side, Organism organism) {
        super(String.format("spinal segment N%d %s white matter lateral funiculus", index, side.label));
    }
}

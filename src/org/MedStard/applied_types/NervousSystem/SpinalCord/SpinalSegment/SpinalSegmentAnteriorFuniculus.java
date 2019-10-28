package org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalSegment;

import org.MedStard.applied_types.Human.Organism;
import org.MedStard.enums.Sides;
import org.MedStard.types.NeuralSystem.NeuralPathGroup;

public class SpinalSegmentAnteriorFuniculus extends NeuralPathGroup {
    public SpinalSegmentAnteriorFuniculus(int index, Sides side, Organism organism) {
        super(String.format("spinal segment N%d %s white matter anterior funiculus", index, side.label));
    }
}

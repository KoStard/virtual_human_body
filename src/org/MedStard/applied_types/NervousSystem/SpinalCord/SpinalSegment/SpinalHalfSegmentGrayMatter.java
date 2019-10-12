package org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalSegment;

import org.MedStard.enums.Sides;
import org.MedStard.types.NeuralSystem.Nucleus;

/**
 * Considering that subnuclei are not connected between them -> extends from Nucleus
 * Don't adding subnuclei yet
 */
public class SpinalHalfSegmentGrayMatter extends Nucleus {
    public SpinalHalfSegmentGrayMatter(int index, Sides side) {
        super(String.format("spinal segment N%d %s half gray matter", index, side.label));
    }
}

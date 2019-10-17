package org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalSegment.GrayMatter;

import org.MedStard.applied_types.Human.Organism;
import org.MedStard.enums.Sides;
import org.MedStard.types.NeuralSystem.Nucleus;

/**
 * Considering that subnuclei are not connected between them -> extends from Nucleus
 * Don't adding subnuclei yet
 */
public class SpinalHalfSegmentGrayMatter extends Nucleus {
    public ClarkesNucleus clarkesNucleus;
    public SpinalHalfSegmentGrayMatter(int index, Sides side, Organism organism) {
        super(String.format("spinal segment N%d %s half gray matter", index, side.label));
        clarkesNucleus = new ClarkesNucleus(side, index);
        addElement(clarkesNucleus);
    }
}

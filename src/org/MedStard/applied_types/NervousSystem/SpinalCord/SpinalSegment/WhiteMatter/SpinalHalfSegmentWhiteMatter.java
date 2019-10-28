package org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalSegment.WhiteMatter;

import org.MedStard.applied_types.Human.Organism;
import org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalCord;
import org.MedStard.enums.Sides;
import org.MedStard.types.NeuralSystem.NeuralPathGroup;

public class SpinalHalfSegmentWhiteMatter extends NeuralPathGroup {
    public SpinalSegmentAnteriorFuniculus anteriorFuniculus;
    public SpinalSegmentLateralFuniculus lateralFuniculus;
    public SpinalSegmentPosteriorFuniculus posteriorFuniculus;
    public SpinalCord spinalCord;

    public SpinalHalfSegmentWhiteMatter(int index, Sides side, Organism organism) {
        super(String.format("spinal segment N%d %s white matter", index, side.label));
        anteriorFuniculus = new SpinalSegmentAnteriorFuniculus(index, side, organism);
        lateralFuniculus = new SpinalSegmentLateralFuniculus(index, side, organism);
        posteriorFuniculus = new SpinalSegmentPosteriorFuniculus(index, side, organism);
        addElement(anteriorFuniculus);
        addElement(lateralFuniculus);
        addElement(posteriorFuniculus);
    }
}

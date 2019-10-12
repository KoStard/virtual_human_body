package org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalSegment;

import org.MedStard.applied_types.NervousSystem.Brain;
import org.MedStard.enums.Sides;
import org.MedStard.types.NeuralSystem.NeuralPathGroup;

public class SpinalHalfSegmentWhiteMatter extends NeuralPathGroup {
    public SpinalSegmentAnteriorFuniculus anteriorFuniculus;
    public SpinalSegmentLateralFuniculus lateralFuniculus;
    public SpinalSegmentPosteriorFuniculus posteriorFuniculus;

    public SpinalHalfSegmentWhiteMatter(int index, Sides side, Brain brain) {
        super(String.format("spinal segment N%d %s white matter", index, side.label));
        anteriorFuniculus = new SpinalSegmentAnteriorFuniculus(index, side, brain);
        lateralFuniculus = new SpinalSegmentLateralFuniculus(index, side, brain);
        posteriorFuniculus = new SpinalSegmentPosteriorFuniculus(index, side, brain);
        addElement(anteriorFuniculus);
        addElement(lateralFuniculus);
        addElement(posteriorFuniculus);
    }
}

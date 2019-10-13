package org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalSegment;

import org.MedStard.applied_types.NervousSystem.Brain;
import org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalCord;
import org.MedStard.enums.Sides;
import org.MedStard.types.NeuralSystem.NeuralPathGroup;

public class SpinalHalfSegmentWhiteMatter extends NeuralPathGroup {
    public SpinalSegmentAnteriorFuniculus anteriorFuniculus;
    public SpinalSegmentLateralFuniculus lateralFuniculus;
    public SpinalSegmentPosteriorFuniculus posteriorFuniculus;
    public SpinalCord spinalCord;

    public SpinalHalfSegmentWhiteMatter(int index, Sides side, Brain brain, SpinalCord spinalCord) {
        super(String.format("spinal segment N%d %s white matter", index, side.label));
        this.spinalCord = spinalCord;
        anteriorFuniculus = new SpinalSegmentAnteriorFuniculus(index, side, brain, spinalCord);
        lateralFuniculus = new SpinalSegmentLateralFuniculus(index, side, brain, spinalCord);
        posteriorFuniculus = new SpinalSegmentPosteriorFuniculus(index, side, brain, spinalCord);
        addElement(anteriorFuniculus);
        addElement(lateralFuniculus);
        addElement(posteriorFuniculus);
    }
}

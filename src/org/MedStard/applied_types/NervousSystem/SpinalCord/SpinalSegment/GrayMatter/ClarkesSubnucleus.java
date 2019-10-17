package org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalSegment.GrayMatter;

import org.MedStard.enums.Sides;
import org.MedStard.types.NeuralSystem.SubNucleus;

public class ClarkesSubnucleus extends SubNucleus {
    public MuscleStretchAndTensionNerveFibers muscleStretchAndTensionNerveFibers;
    int targetSegmentIndex;
    int segmentIndex;

    public ClarkesSubnucleus(Sides side, int targetSegmentIndex, int segmentIndex) {
        super(String.format("%s %d Clarke's subnucleus for segment %d", side.label, segmentIndex, targetSegmentIndex));
        this.targetSegmentIndex = targetSegmentIndex;
        this.segmentIndex = segmentIndex;
        muscleStretchAndTensionNerveFibers = new MuscleStretchAndTensionNerveFibers(targetSegmentIndex, side);
        muscleStretchAndTensionNerveFibers.setTarget(this);
    }

    @Override
    public void initialize() {

    }
}

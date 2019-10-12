package org.MedStard.applied_types.NervousSystem;

import org.MedStard.enums.Sides;
import org.MedStard.types.NeuralSystem.NeuralPathGroup;
import org.MedStard.types.NeuralSystem.Nucleus;

class SpinalSegmentHalfWhiteMatter extends NeuralPathGroup {
    public SpinalSegmentHalfWhiteMatter(int index, Sides side) {
        super(String.format("spinal segment N%d %s white matter", index, side.label));
    }
}

/**
 * Considering that subnuclei are not connected between them
 * Don't adding subnuclei yet
 */

class SpinalSegmentHalfGrayMatter extends Nucleus {

    public SpinalSegmentHalfGrayMatter(int index, Sides side) {
        super(String.format("spinal segment N%d %s half gray matter", index, side.label));
    }
}

class SpinalHalfSegment {
    public SpinalSegmentHalfWhiteMatter whiteMatter;
    public SpinalSegmentHalfGrayMatter grayMatter;
    public SpinalNerve spinalNerve;
    public Sides side;
    public SpinalHalfSegment(int index, Sides side) {
        whiteMatter = new SpinalSegmentHalfWhiteMatter(index, side);
        grayMatter = new SpinalSegmentHalfGrayMatter(index, side);
        spinalNerve = new SpinalNerve(index, side);
        this.side = side;

        /**
         * Add spinal nerve content here, set targets
         */
    }
}


public class SpinalSegment {
    public SpinalHalfSegment leftHalf;
    public SpinalHalfSegment rightHalf;
    public SpinalSegment(int index) {
        leftHalf = new SpinalHalfSegment(index, Sides.Left);
        rightHalf = new SpinalHalfSegment(index, Sides.Right);
    }
}

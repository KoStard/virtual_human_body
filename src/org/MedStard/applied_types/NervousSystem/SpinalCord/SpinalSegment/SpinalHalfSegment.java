package org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalSegment;

import org.MedStard.applied_types.NervousSystem.Brain;
import org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalNerve;
import org.MedStard.enums.Sides;


public class SpinalHalfSegment {
    public SpinalHalfSegmentWhiteMatter whiteMatter;
    public SpinalHalfSegmentGrayMatter grayMatter;
    public SpinalNerve spinalNerve;
    public Sides side;

    public SpinalHalfSegment(int index, Sides side, Brain brain) {
        whiteMatter = new SpinalHalfSegmentWhiteMatter(index, side, brain);
        grayMatter = new SpinalHalfSegmentGrayMatter(index, side);
        spinalNerve = new SpinalNerve(index, side);  // Will be initialized later
        this.side = side;
    }
}
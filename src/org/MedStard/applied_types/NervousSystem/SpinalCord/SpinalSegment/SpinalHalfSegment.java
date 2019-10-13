package org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalSegment;

import org.MedStard.applied_types.NervousSystem.Brain;
import org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalCord;
import org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalNerve;
import org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalSegment.GrayMatter.SpinalHalfSegmentGrayMatter;
import org.MedStard.enums.Sides;


public class SpinalHalfSegment {
    public SpinalHalfSegmentWhiteMatter whiteMatter;
    public SpinalHalfSegmentGrayMatter grayMatter;
    public SpinalNerve spinalNerve;
    public SpinalCord spinalCord;
    public Sides side;

    public SpinalHalfSegment(int index, Sides side, Brain brain, SpinalCord spinalCord) {
        this.spinalCord = spinalCord;
        whiteMatter = new SpinalHalfSegmentWhiteMatter(index, side, brain, spinalCord);
        grayMatter = new SpinalHalfSegmentGrayMatter(index, side);
        spinalNerve = new SpinalNerve(index, side); // Will be initialized later
        this.side = side;
    }
}

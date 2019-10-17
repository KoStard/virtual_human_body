package org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalSegment;

import org.MedStard.applied_types.Human.Organism;
import org.MedStard.applied_types.NervousSystem.Brain;
import org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalCord;
import org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalNerve;
import org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalSegment.GrayMatter.SpinalHalfSegmentGrayMatter;
import org.MedStard.enums.Sides;
import org.MedStard.types.AbstractTypes.Initializable;


public class SpinalHalfSegment implements Initializable {
    public SpinalHalfSegmentWhiteMatter whiteMatter;
    public SpinalHalfSegmentGrayMatter grayMatter;
    public SpinalNerve spinalNerve;
    public Organism organism;
    public Sides side;

    public SpinalHalfSegment(int index, Sides side, Organism organism) {
        this.organism = organism;
        whiteMatter = new SpinalHalfSegmentWhiteMatter(index, side, organism);
        grayMatter = new SpinalHalfSegmentGrayMatter(index, side, organism);
        spinalNerve = new SpinalNerve(index, side, organism); // Will be initialized later
        this.side = side;
    }

    @Override
    public void initialize() {
        whiteMatter.initialize();
        grayMatter.initialize();
    }
}

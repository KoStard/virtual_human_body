package org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalSegment;

import org.MedStard.applied_types.NervousSystem.Brain;
import org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalNerve;
import org.MedStard.enums.Sides;


public class SpinalSegment {
    public int index;
    public SpinalHalfSegment leftHalf;
    public SpinalHalfSegment rightHalf;

    public SpinalSegment(int index, Brain brain) {
        this.index = index;
        leftHalf = new SpinalHalfSegment(index, Sides.Left, brain);
        rightHalf = new SpinalHalfSegment(index, Sides.Right, brain);
        initializeSpinalNerves(brain);
    }

    void initializeSpinalNerves(Brain brain) {
        leftHalf.spinalNerve.addElement(leftHalf.whiteMatter.posteriorColumn.getElements().get(0));
        rightHalf.spinalNerve.addElement(rightHalf.whiteMatter.posteriorColumn.getElements().get(0));
    }

    public SpinalNerve getSpinalNerve(Sides side) {
        if (side == Sides.Left) {
            return leftHalf.spinalNerve;
        } else {
            return rightHalf.spinalNerve;
        }
    }
}

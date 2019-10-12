package org.MedStard.applied_types.NervousSystem.MedullaOblongata;

import org.MedStard.enums.Sides;


public class MedullaOblongata {
    public MedullaOblongataHalf leftHalf;
    public MedullaOblongataHalf rightHalf;

    public MedullaOblongata() {
        leftHalf = new MedullaOblongataHalf(Sides.Left);
        rightHalf = new MedullaOblongataHalf(Sides.Right);
    }
}

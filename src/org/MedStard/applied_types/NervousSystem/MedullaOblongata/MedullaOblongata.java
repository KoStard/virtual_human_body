package org.MedStard.applied_types.NervousSystem.MedullaOblongata;

import org.MedStard.enums.Sides;
import org.MedStard.types.AbstractTypes.Initializable;


public class MedullaOblongata implements Initializable {
    public MedullaOblongataHalf leftHalf;
    public MedullaOblongataHalf rightHalf;

    public MedullaOblongata() {
        leftHalf = new MedullaOblongataHalf(Sides.Left);
        rightHalf = new MedullaOblongataHalf(Sides.Right);
    }

    @Override
    public void initialize() {
        leftHalf.initialize();
        rightHalf.initialize();
    }
}

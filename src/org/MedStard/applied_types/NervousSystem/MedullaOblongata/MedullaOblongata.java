package org.MedStard.applied_types.NervousSystem.MedullaOblongata;

import org.MedStard.applied_types.Human.Organism;
import org.MedStard.enums.Sides;
import org.MedStard.types.AbstractTypes.Initializable;


public class MedullaOblongata implements Initializable {
    public MedullaOblongataHalf leftHalf;
    public MedullaOblongataHalf rightHalf;

    public MedullaOblongata(Organism organism) {
        leftHalf = new MedullaOblongataHalf(organism, Sides.Left);
        rightHalf = new MedullaOblongataHalf(organism, Sides.Right);
    }

    @Override
    public void initialize() {
        leftHalf.initialize();
        rightHalf.initialize();
    }
}

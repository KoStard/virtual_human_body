package org.MedStard.applied_types.NervousSystem.MedullaOblongata;

import org.MedStard.applied_types.Human.Organism;
import org.MedStard.enums.Sides;
import org.MedStard.types.AbstractTypes.Initializable;
import org.MedStard.types.AbstractTypes.Symmetric;

import java.security.InvalidKeyException;


public class MedullaOblongata implements Initializable, Symmetric<MedullaOblongataHalf> {
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

    @Override
    public MedullaOblongataHalf getConstituentElement(Sides side) throws InvalidKeyException {
        if (side == Sides.Left) {
            return leftHalf;
        } else if (side == Sides.Right) {
            return rightHalf;
        } else {
            throw new InvalidKeyException(String.format("Invalid side %s", side.label));
        }
    }
}

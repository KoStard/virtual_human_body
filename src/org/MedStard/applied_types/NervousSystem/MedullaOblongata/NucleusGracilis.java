package org.MedStard.applied_types.NervousSystem.MedullaOblongata;

import org.MedStard.constants.NervousSystemConstants;
import org.MedStard.enums.Sides;
import org.MedStard.types.NeuralSystem.Nucleus;

public class NucleusGracilis extends Nucleus {
    public Sides side;
    public NucleusGracilisSubnucleus[] subnuclei;
    public FasciculusGracilis fasciculusGracilis; // Do we need this at all? The content is not stable

    public NucleusGracilis(Sides side) {
        super(String.format("%s nucleus gracilis", side.label));
        this.side = side;
        fasciculusGracilis = new FasciculusGracilis(side);

        subnuclei = new NucleusGracilisSubnucleus[NervousSystemConstants.FasciculusGracilisSegmentsCount];
        for (int i = 0; i < NervousSystemConstants.FasciculusGracilisSegmentsCount; i++) { // Lower 17 segments
            subnuclei[i] = new NucleusGracilisSubnucleus(side, i + 1);
            fasciculusGracilis.addElement(subnuclei[i].inputFasciculusPath);
        }
    }
}

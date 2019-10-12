package org.MedStard.applied_types.NervousSystem;

import org.MedStard.constants.NervousSystemConstants;
import org.MedStard.enums.Sides;
import org.MedStard.types.NeuralSystem.Nucleus;
import org.MedStard.types.NeuralSystem.SubNucleus;

class NucleusGracilisSubnucleus extends SubNucleus {
    public Sides side;
    public int index;
    public FasciculusGracilisPath inputFasciculusPath;

    public NucleusGracilisSubnucleus(Sides side, int index) {
        super(String.format("%s nucleus gracilis %d subnucleus", side.label, index));
        this.side = side;
        this.index = index;
        inputFasciculusPath = new FasciculusGracilisPath(side, index);
        inputFasciculusPath.setTarget(this);
    }
}

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

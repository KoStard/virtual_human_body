package org.MedStard.applied_types.NervousSystem;

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
    }
}

public class NucleusGracilis extends Nucleus {
    public Sides side;
    public NucleusGracilisSubnucleus[] subnuclei;
    public FasciculusGracilis fasciculusGracilis;

    public NucleusGracilis(Sides side) {
        super(String.format("%s nucleus gracilis", side.label));
        this.side = side;
        fasciculusGracilis = new FasciculusGracilis(side);

        subnuclei = new NucleusGracilisSubnucleus[17];
        for (int i = 0; i < 17; i++) { // Lower 17 segments
            subnuclei[i] = new NucleusGracilisSubnucleus(side, i + 1);
        }
    }
}

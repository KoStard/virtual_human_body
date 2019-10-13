package org.MedStard.applied_types.NervousSystem.MedullaOblongata.Gracilis;

import org.MedStard.enums.Sides;
import org.MedStard.types.NeuralSystem.SubNucleus;

public class NucleusGracilisSubnucleus extends SubNucleus {
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

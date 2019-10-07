package org.MedStard.applied_types.NeuralSystem;

import org.MedStard.enums.Sides;

class MedullaOblongataHalf {
    public Sides side;
    public NucleusGracilis nucleusGracilis;
    public NucleusCuneatus nucleusCuneatus;
    public MedullaOblongataHalf (Sides side) {
        this.side = side;
        nucleusGracilis = new NucleusGracilis(side);
        nucleusCuneatus = new NucleusCuneatus(side);
    }
}

public class MedullaOblongata {
    public MedullaOblongataHalf leftHalf;
    public MedullaOblongataHalf rightHalf;
    public MedullaOblongata() {
        leftHalf = new MedullaOblongataHalf(Sides.Left);
        rightHalf = new MedullaOblongataHalf(Sides.Right);
    }
}

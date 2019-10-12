package org.MedStard.applied_types.NervousSystem.MedullaOblongata;

import org.MedStard.enums.Sides;

public class MedullaOblongataHalf {
    public Sides side;
    public NucleusGracilis nucleusGracilis;
    public NucleusCuneatus nucleusCuneatus;

    public MedullaOblongataHalf(Sides side) {
        this.side = side;
        nucleusGracilis = new NucleusGracilis(side);
        nucleusCuneatus = new NucleusCuneatus(side);
    }
}

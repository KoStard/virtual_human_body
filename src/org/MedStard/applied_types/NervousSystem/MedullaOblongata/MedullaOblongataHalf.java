package org.MedStard.applied_types.NervousSystem.MedullaOblongata;

import org.MedStard.applied_types.NervousSystem.MedullaOblongata.Cuneatus.NucleusCuneatus;
import org.MedStard.applied_types.NervousSystem.MedullaOblongata.Gracilis.NucleusGracilis;
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

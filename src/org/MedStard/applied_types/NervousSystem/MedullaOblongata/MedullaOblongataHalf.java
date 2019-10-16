package org.MedStard.applied_types.NervousSystem.MedullaOblongata;

import org.MedStard.applied_types.NervousSystem.MedullaOblongata.Cuneatus.NucleusCuneatus;
import org.MedStard.applied_types.NervousSystem.MedullaOblongata.Gracilis.NucleusGracilis;
import org.MedStard.enums.Sides;
import org.MedStard.types.AbstractTypes.Initializable;

public class MedullaOblongataHalf implements Initializable {
    public Sides side;
    public NucleusGracilis nucleusGracilis;
    public NucleusCuneatus nucleusCuneatus;

    public MedullaOblongataHalf(Sides side) {
        this.side = side;
        nucleusGracilis = new NucleusGracilis(side);
        nucleusCuneatus = new NucleusCuneatus(side);
    }

    @Override
    public void initialize() {
        nucleusGracilis.initialize();
        nucleusCuneatus.initialize();
    }
}

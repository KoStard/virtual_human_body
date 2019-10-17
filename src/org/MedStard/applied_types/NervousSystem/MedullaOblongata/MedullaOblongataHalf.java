package org.MedStard.applied_types.NervousSystem.MedullaOblongata;

import org.MedStard.applied_types.Human.Organism;
import org.MedStard.applied_types.NervousSystem.MedullaOblongata.Cuneatus.NucleusCuneatus;
import org.MedStard.applied_types.NervousSystem.MedullaOblongata.Gracilis.NucleusGracilis;
import org.MedStard.enums.Sides;
import org.MedStard.types.AbstractTypes.Initializable;

public class MedullaOblongataHalf implements Initializable {
    public Sides side;
    public NucleusGracilis nucleusGracilis;
    public NucleusCuneatus nucleusCuneatus;

    public MedullaOblongataHalf(Organism organism, Sides side) {
        this.side = side;
        nucleusGracilis = new NucleusGracilis(organism, side);
        nucleusCuneatus = new NucleusCuneatus(organism, side);
    }

    @Override
    public void initialize() {
        nucleusGracilis.initialize();
        nucleusCuneatus.initialize();
    }
}

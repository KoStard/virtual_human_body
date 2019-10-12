package org.MedStard.applied_types.NervousSystem.MedullaOblongata;

import org.MedStard.constants.NervousSystemConstants;
import org.MedStard.enums.Sides;
import org.MedStard.types.NeuralSystem.Nucleus;


public class NucleusCuneatus extends Nucleus {
    public Sides side;
    public NucleusCuneatusSubnucleus[] subnuclei;
    public FasciculusCuneatus fasciculusCuneatus;

    public NucleusCuneatus(Sides side) {
        super(String.format("%s nucleus cuneatus", side.label));
        this.side = side;
        fasciculusCuneatus = new FasciculusCuneatus(side);

        subnuclei = new NucleusCuneatusSubnucleus[NervousSystemConstants.FasciculusCuneatusSegmentsCount];
        for (int i = 0; i < NervousSystemConstants.FasciculusCuneatusSegmentsCount; i++) { // Upper 14 segments
            subnuclei[i] = new NucleusCuneatusSubnucleus(side, i + 1);
            fasciculusCuneatus.addElement(subnuclei[i].inputFasciculusPath);
        }
    }
}

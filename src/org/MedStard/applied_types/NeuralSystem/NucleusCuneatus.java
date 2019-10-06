package org.MedStard.applied_types.NeuralSystem;

import org.MedStard.enums.Sides;
import org.MedStard.types.NeuralSystem.Nucleus;
import org.MedStard.types.NeuralSystem.SubNucleus;

class NucleusCuneatusSubnucleus extends SubNucleus {
    public Sides side;
    public int index;

    public NucleusCuneatusSubnucleus(Sides side, int index) {
        super(String.format("%s nucleus cuneatus %d subnucleus", side.label, index));
        this.side = side;
        this.index = index;
        // Add neural path here
    }
}

public class NucleusCuneatus extends Nucleus {
    public Sides side;
    public NucleusCuneatusSubnucleus[] subnuclei;
    public FasciculusCuneatus fasciculusCuneatus;

    public NucleusCuneatus(Sides side) {
        super(String.format("%s nucleus cuneatus", side.label));
        this.side = side;
        fasciculusCuneatus = new FasciculusCuneatus(side);

        subnuclei = new NucleusCuneatusSubnucleus[14];
        for (int i = 0; i < 14; i++) { // Upper 14 segments
            subnuclei[i] = new NucleusCuneatusSubnucleus(side, i + 1);
        }
    }
}

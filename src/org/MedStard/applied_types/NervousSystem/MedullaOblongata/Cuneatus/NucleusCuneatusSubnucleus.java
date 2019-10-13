package org.MedStard.applied_types.NervousSystem.MedullaOblongata.Cuneatus;

import org.MedStard.enums.Sides;
import org.MedStard.types.NeuralSystem.SubNucleus;

public class NucleusCuneatusSubnucleus extends SubNucleus {
    public Sides side;
    public int index;
    public FasciculusCuneatusPath inputFasciculusPath;

    public NucleusCuneatusSubnucleus(Sides side, int index) {
        super(String.format("%s nucleus cuneatus %d subnucleus", side.label, index));
        this.side = side;
        this.index = index;
        inputFasciculusPath = new FasciculusCuneatusPath(side, index);
        inputFasciculusPath.setTarget(this);
    }
}

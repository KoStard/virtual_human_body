package org.MedStard.applied_types.NervousSystem.MedullaOblongata.Cuneatus;

import org.MedStard.enums.Sides;
import org.MedStard.types.NeuralSystem.NeuralPathGroup;

public class FasciculusCuneatus extends NeuralPathGroup {
    public Sides side;
    public FasciculusCuneatus(Sides side) {
        super(String.format("%s fasciculus cuneatus", side.label));
        this.side = side;
    }
}

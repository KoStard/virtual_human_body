package org.MedStard.applied_types.NervousSystem.MedullaOblongata;

import org.MedStard.enums.Sides;
import org.MedStard.types.NeuralSystem.NeuralPathGroup;

public class FasciculusGracilis extends NeuralPathGroup {
    public Sides side;
    public FasciculusGracilis(Sides side) {
        super(String.format("%s fasciculus cuneatus", side.label));
        this.side = side;
    }
}

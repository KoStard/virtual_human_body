package org.MedStard.applied_types.NervousSystem.MedullaOblongata;

import org.MedStard.enums.Sides;
import org.MedStard.types.NeuralSystem.NeuralPath;

public class FasciculusCuneatusPath extends NeuralPath {
    public Sides side;
    public int index;

    public FasciculusCuneatusPath(Sides side, int index) {
        super(String.format("%s %d fasciculus cuneatus path", side.label, index));
        this.index = index;
        this.side = side;
    }
}

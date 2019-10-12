package org.MedStard.applied_types.NervousSystem.MedullaOblongata;

import org.MedStard.enums.Sides;
import org.MedStard.types.NeuralSystem.NeuralPath;

public class FasciculusGracilisPath extends NeuralPath {
    public Sides side;
    public int index;

    public FasciculusGracilisPath(Sides side, int index) {
        super(String.format("%s %d fasciculus gracilis path", side.label, index));
        this.index = index;
        this.side = side;
    }
}

package org.MedStard.applied_types.NervousSystem.MedullaOblongata;

import org.MedStard.applied_types.Human.Organism;
import org.MedStard.enums.Sides;
import org.MedStard.types.NeuralSystem.NeuralPathGroup;

public class LowerPeduncle extends NeuralPathGroup {
    private Sides side;
    private Organism organism;
    public LowerPeduncle(Organism organism, Sides side) {
        super(String.format("%s lower peduncle", side.label));
        this.side = side;
        this.organism = organism;
    }

    @Override
    public void initialize() {
        
    }
}

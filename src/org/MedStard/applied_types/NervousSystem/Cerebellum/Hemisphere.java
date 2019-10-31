package org.MedStard.applied_types.NervousSystem.Cerebellum;

import org.MedStard.applied_types.Human.Organism;
import org.MedStard.enums.Sides;
import org.MedStard.types.NeuralSystem.Nucleus;

public class Hemisphere extends Nucleus {
    public Hemisphere(Organism organism, Sides side) {
        super(String.format("%s cerebellum hemisphere", side.label));
    }
}

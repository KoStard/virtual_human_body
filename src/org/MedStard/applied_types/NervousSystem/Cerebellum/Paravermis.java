package org.MedStard.applied_types.NervousSystem.Cerebellum;

import org.MedStard.applied_types.Human.Organism;
import org.MedStard.enums.Sides;
import org.MedStard.types.NeuralSystem.Nucleus;

public class Paravermis extends Nucleus {
    public Paravermis(Organism organism, Sides side) {
        super(String.format("%s paravermis", side.label));
    }
}

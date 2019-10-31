package org.MedStard.applied_types.NervousSystem;

import org.MedStard.applied_types.Human.Organism;
import org.MedStard.applied_types.NervousSystem.Cerebellum.Cerebellum;
import org.MedStard.types.AbstractTypes.Initializable;

public class Brain implements Initializable {
    public BrainStem brainStem;
    public Cerebellum cerebellum;

    public Brain(Organism organism) {
        brainStem = new BrainStem(organism);
        cerebellum = new Cerebellum(organism);
    }

    @Override
    public void initialize() {
        brainStem.initialize();
        cerebellum.initialize();
    }
}
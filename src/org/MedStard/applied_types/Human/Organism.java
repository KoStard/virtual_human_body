package org.MedStard.applied_types.Human;

import org.MedStard.applied_types.NervousSystem.NervousSystem;
import org.MedStard.types.AbstractTypes.Initializable;

public class Organism implements Initializable {
    public NervousSystem nervousSystem;

    public Organism() {
        nervousSystem = new NervousSystem();

        initialize();
    }

    @Override
    public void initialize() {
        nervousSystem.initialize();
    }
}
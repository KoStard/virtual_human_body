package org.MedStard.applied_types.NervousSystem;

import org.MedStard.types.AbstractTypes.Initializable;

public class Brain implements Initializable {
    public BrainStem brainStem;

    public Brain() {
        brainStem = new BrainStem();
    }

    @Override
    public void initialize() {
        brainStem.initialize();
    }
}
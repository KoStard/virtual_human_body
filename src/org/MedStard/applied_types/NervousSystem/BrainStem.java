package org.MedStard.applied_types.NervousSystem;

import org.MedStard.applied_types.NervousSystem.MedullaOblongata.MedullaOblongata;
import org.MedStard.types.AbstractTypes.Initializable;

/**
 * BrainStem
 * - medulla oblongata
 * - pons
 */
public class BrainStem implements Initializable {
    public MedullaOblongata medullaOblongata;

    public BrainStem() {
        medullaOblongata = new MedullaOblongata();
    }

    @Override
    public void initialize() {
        medullaOblongata.initialize();
    }
}

package org.MedStard.applied_types.NervousSystem;

import org.MedStard.applied_types.Human.Organism;
import org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalCord;
import org.MedStard.types.AbstractTypes.Initializable;

public class NervousSystem implements Initializable {
    public Brain brain;
    public SpinalCord spinalCord;

    public NervousSystem(Organism organism) {
        brain = new Brain(organism);
        spinalCord = new SpinalCord(organism);
    }

    @Override
    public void initialize() {
        brain.initialize();
        spinalCord.initialize();
    }
}

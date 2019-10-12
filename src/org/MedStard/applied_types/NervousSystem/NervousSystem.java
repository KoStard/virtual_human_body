package org.MedStard.applied_types.NervousSystem;

import org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalCord;

public class NervousSystem {
    public Brain brain;
    public SpinalCord spinalCord;

    public NervousSystem() {
        brain = new Brain();
        spinalCord = new SpinalCord(brain);
    }
}

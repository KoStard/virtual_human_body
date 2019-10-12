package org.MedStard.applied_types.NervousSystem;

public class NervousSystem {
    public Brain brain;
    public SpinalCord spinalCord;

    public NervousSystem() {
        brain = new Brain();
        spinalCord = new SpinalCord(brain);
    }
}

package org.MedStard.applied_types.NervousSystem.SpinalCord;

import org.MedStard.applied_types.Human.Organism;
import org.MedStard.enums.Sides;
import org.MedStard.types.NeuralSystem.NeuralPathGroup;


/**
 * Don't adding roots, because we are not trying to simulate the anatomy
 * This is just a container, we'll add neural paths into this later
 */
public class SpinalNerve extends NeuralPathGroup {
    public SpinalNerve(int index, Sides side, Organism organism) {
        super(String.format("N%d %s spinal nerve", index, side.label));
    }

    @Override
    public void initialize() {

    }
}

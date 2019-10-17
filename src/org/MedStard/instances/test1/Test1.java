package org.MedStard.instances.test1;

import org.MedStard.applied_types.Human.Organism;
import org.MedStard.enums.Sides;

public class Test1 {
    public Test1() {
        Organism organism = new Organism();
        organism.nervousSystem.spinalCord.segments[20].getSpinalNerve(Sides.Left).stimulate();
    }

    public static void main(String[] args) {
        new Test1();
    }
}

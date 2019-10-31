package org.MedStard.instances.test1;

import org.MedStard.applied_types.Human.Organism;

import javax.management.InvalidAttributeValueException;

public class Test1 {
    public Test1() {
        Organism organism = new Organism();
        try {
            organism.nervousSystem.spinalCord.getSegmentByIndex(21).leftHalf.grayMatter.clarkesNucleus.getInputsWithSegmentIndex(21).stimulate();
        } catch (InvalidAttributeValueException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Test1();
    }
}

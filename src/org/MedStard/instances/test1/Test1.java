package org.MedStard.instances.test1;

import org.MedStard.types.Constrictive.SkeletalMuscle;
import org.MedStard.types.NeuralSystem.Nerve;
import org.MedStard.types.NeuralSystem.Nucleus;

import java.util.Vector;

public class Test1 {
    public Test1() {
        Nucleus nucl = new Nucleus();
        Nerve nerve = new Nerve();
        SkeletalMuscle muscle = new SkeletalMuscle();

        nerve.addSource(nucl);
        nerve.addTarget(muscle);

        nucl.stimulate();

        System.out.println(nucl.getOutputNerves().toString());
    }
    public static void main(String[] args) {
        new Test1();
    }
}

package org.MedStard.instances.test1;

import org.MedStard.types.Constrictive.SkeletalMuscle;
import org.MedStard.types.NeuralSystem.Nerve;
import org.MedStard.types.NeuralSystem.NeuralPath;
import org.MedStard.types.NeuralSystem.Nucleus;

import java.util.Vector;

public class Test1 {
    public Test1() {
        Nucleus nucl = new Nucleus("Nucleus One");
        SkeletalMuscle muscle = new SkeletalMuscle("Muscle One");
        Nerve nerve = new Nerve("Test Nerve");

        nerve.addNeuralPath(new NeuralPath(
                "NeuralPath",
                nucl,
                muscle
        ));

        nucl.stimulate();

        System.out.println(nucl.getNeuralOutputs());
    }
    public static void main(String[] args) {
        new Test1();
    }
}

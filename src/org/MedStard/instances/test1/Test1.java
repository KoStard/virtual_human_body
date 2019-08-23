package org.MedStard.instances.test1;

import org.MedStard.types.Constrictive.SkeletalMuscle;
import org.MedStard.types.NeuralSystem.Nerve;
import org.MedStard.types.NeuralSystem.NeuralPath;
import org.MedStard.types.NeuralSystem.Nucleus;
import org.MedStard.types.NeuralSystem.SubNucleus;

import java.util.Vector;

public class Test1 {
    public Test1() {
        Nucleus nucl = new Nucleus("Nucleus One");
        SubNucleus subNucleus = new SubNucleus("SubNucleus one"); 
        nucl.addSubNucleus(subNucleus);
        
        SkeletalMuscle muscle = new SkeletalMuscle("Muscle One");
        Nerve nerve = new Nerve("Test Nerve");

        nerve.addNeuralPath(new NeuralPath(
                "NeuralPath",
                subNucleus,
                muscle
        ));

        nucl.stimulate();
    }
    public static void main(String[] args) {
        new Test1();
    }
}

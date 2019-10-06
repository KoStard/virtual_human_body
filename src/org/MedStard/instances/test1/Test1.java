package org.MedStard.instances.test1;

import org.MedStard.types.Constrictive.SkeletalMuscle;
import org.MedStard.types.NeuralSystem.NeuralPathGroup;
import org.MedStard.types.NeuralSystem.NeuralPath;
import org.MedStard.types.NeuralSystem.Nucleus;
import org.MedStard.types.NeuralSystem.SubNucleus;

import java.util.Vector;

public class Test1 {
    public Test1() {
//        /**
//         * Fasciculus Gracilis and Fasciculus Cuneatus
//         * - conscious proprioception
//         * - deep touch
//         * - vibration
//         * - visceral pain
//         *
//         * Fasciculus Cuneatus - from upper part of the body
//         * Fasciculus Gracilis - from lower limbs and trunk
//         *
//         * Fasciculus Cuneatus - from vertebral level T6 and above
//         * Fasciculus Gracilis - from vertebral level T7 and below
//         */
//
//        NeuralPathGroup leftFasciculusCuneatus = new NeuralPathGroup("Left Fasciculus Cuneatus");
//        NeuralPathGroup rightFasciculusCuneatus = new NeuralPathGroup("Right Fasciculus Cuneatus");
//        NeuralPathGroup leftFasciculusGracilis = new NeuralPathGroup("Left Fasciculus Gracilis");
//        NeuralPathGroup rightFasciculusGracilis = new NeuralPathGroup("Right Fasciculus Gracilis");
//
//        // Adding nuclei
//        SubNucleus leftSubNucleusCuneatus = new SubNucleus("Left Nucleus Cuneatus");
//        SubNucleus rightSubNucleusCuneatus = new SubNucleus("Right Nucleus Cuneatus");
//        SubNucleus leftSubNucleusGracilis = new SubNucleus("Left Nucleus Gracilis");
//        SubNucleus rightSubNucleusGracilis = new SubNucleus("Right Nucleus Gracilis");
//
//        /**
//         * Adding spinal nerves, dorsal/ventral roots and neural paths of fasciculi
//         * Spinal cord segments - 31 segments:
//         *
//         * - 8 cervical - C8 pair of nerves leave the spine between C7 and T1 vertebrae, C1 leaves between foramen magnum and the C1 vertebra
//         * - 12 thoracic
//         * - 5 lumbar
//         * - 5 sacral
//         * - 1 coccygeal
//         */
//
//        Vector<NeuralPathGroup> leftDorsalRoots = new Vector<>(); // Sensory
//        Vector<NeuralPathGroup> rightDorsalRoots = new Vector<>(); // Sensory
//
//        Vector<NeuralPathGroup> leftVentralRoots = new Vector<>(); // Motor
//        Vector<NeuralPathGroup> rightVentralRoots = new Vector<>(); // Motor
//
//        Vector<NeuralPathGroup> leftSpinalNerves = new Vector<>(); // Combination of dorsal and ventral roots
//        Vector<NeuralPathGroup> rightSpinalNerves = new Vector<>(); // Combination of dorsal and ventral roots
//
//        // Cervical segments
//        for (int spinalNerveIndex = 1; spinalNerveIndex <= 31; spinalNerveIndex++) {
//            String nerveName;
//
//            if (spinalNerveIndex <= 8) {  // Cervical
//                nerveName = String.format("C%d", spinalNerveIndex);
//            } else if (spinalNerveIndex <= 20) {  // Thoracic
//                nerveName = String.format("Th%d", spinalNerveIndex - 8);
//            } else if (spinalNerveIndex <= 25) {  // Lumbar
//                nerveName = String.format("L%d", spinalNerveIndex - 20);
//            } else if (spinalNerveIndex <= 30) {  // Sacral
//                nerveName = String.format("S%d", spinalNerveIndex - 25);
//            } else {  // Coccygeal
//                nerveName = String.format("Co%d", spinalNerveIndex - 30);
//            }
//
//            // Sensory
//            leftDorsalRoots.add(new NeuralPathGroup(String.format("Dorsal root of left %s spinal nerve", nerveName)));
//            rightDorsalRoots.add(new NeuralPathGroup(String.format("Dorsal root of right %s spinal nerve", nerveName)));
//
//            // Motor
//            leftVentralRoots.add(new NeuralPathGroup(String.format("Ventral root of left %s spinal nerve", nerveName)));
//            rightVentralRoots
//                    .add(new NeuralPathGroup(String.format("Ventral root of right %s spinal nerve", nerveName)));
//
//            leftSpinalNerves.add(new NeuralPathGroup(String.format("Left %s spinal nerve", nerveName)));
//            rightSpinalNerves.add(new NeuralPathGroup(String.format("Right %s spinal nerve", nerveName)));
//
//            NeuralPath leftFascicularPath = new NeuralPath(String.format("Left %s spinal nerve fascicular path", nerveName));
//            NeuralPath rightFascicularPath = new NeuralPath(String.format("Right %s spinal nerve fascicular path", nerveName));
//
//            if (spinalNerveIndex <= 14) {  // 8 cervical + 6 thoracic
//                leftFasciculusCuneatus.addElement(leftFascicularPath);
//                rightFasciculusCuneatus.addElement(rightFascicularPath);
//
//                leftFascicularPath.setTarget(leftSubNucleusCuneatus);
//                rightFascicularPath.setTarget(rightSubNucleusCuneatus);
//            } else {
//                leftFasciculusGracilis.addElement(leftFascicularPath);
//                rightFasciculusGracilis.addElement(rightFascicularPath);;
//
//                leftFascicularPath.setTarget(leftSubNucleusGracilis);
//                rightFascicularPath.setTarget(rightSubNucleusGracilis);
//            }
//
//            leftDorsalRoots.get(spinalNerveIndex-1).addElement(leftFascicularPath);
//            leftSpinalNerves.get(spinalNerveIndex-1).addElement(leftFascicularPath);
//
//            rightDorsalRoots.get(spinalNerveIndex-1).addElement(rightFascicularPath);
//            rightSpinalNerves.get(spinalNerveIndex-1).addElement(rightFascicularPath);
//        }
//
//        leftFasciculusCuneatus.stimulate();
    }

    public static void main(String[] args) {
        new Test1();
    }
}

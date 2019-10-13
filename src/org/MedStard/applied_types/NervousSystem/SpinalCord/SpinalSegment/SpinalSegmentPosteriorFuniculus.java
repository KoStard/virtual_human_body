package org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalSegment;

import org.MedStard.applied_types.NervousSystem.Brain;
import org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalCord;
import org.MedStard.constants.NervousSystemConstants;
import org.MedStard.enums.Sides;
import org.MedStard.types.NeuralSystem.NeuralPath;
import org.MedStard.types.NeuralSystem.NeuralPathGroup;

public class SpinalSegmentPosteriorFuniculus extends NeuralPathGroup {
    public SpinalSegmentPosteriorFuniculus(int index, Sides side, Brain brain, SpinalCord spinalCord) {
        super(String.format("spinal segment N%d %s white matter posterior funiculus", index, side.label));
        // Fasciculus Gracilis and Cuneatus
        // First element is the one that will be added to the spinal nerve
        if (index <= NervousSystemConstants.FasciculusCuneatusSegmentsCount) { // All fibers of fasciculus gracilis and part of fasciculus cuneatus
            if (side == Sides.Left) {
                // Neural paths leaving in current segment are included here
                for (int i = index
                        - 1; i < brain.brainStem.medullaOblongata.leftHalf.nucleusCuneatus.subnuclei.length; i++) {
                    addElement(
                            brain.brainStem.medullaOblongata.leftHalf.nucleusCuneatus.subnuclei[i].inputFasciculusPath);
                }
                for (int i = 0; i < brain.brainStem.medullaOblongata.leftHalf.nucleusGracilis.subnuclei.length; i++) {
                    addElement(
                            brain.brainStem.medullaOblongata.leftHalf.nucleusGracilis.subnuclei[i].inputFasciculusPath);
                }
            } else {
                // Neural paths leaving in current segment are included here
                for (int i = index
                        - 1; i < brain.brainStem.medullaOblongata.rightHalf.nucleusCuneatus.subnuclei.length; i++) {
                    addElement(
                            brain.brainStem.medullaOblongata.rightHalf.nucleusCuneatus.subnuclei[i].inputFasciculusPath);
                }
                for (int i = 0; i < brain.brainStem.medullaOblongata.rightHalf.nucleusGracilis.subnuclei.length; i++) {
                    addElement(
                            brain.brainStem.medullaOblongata.rightHalf.nucleusGracilis.subnuclei[i].inputFasciculusPath);
                }
            }
        } else { // Part of fasciculus gracilis
            if (side == Sides.Left) {
                // Neural paths leaving in current segment are included here
                for (int i = index - NervousSystemConstants.FasciculusCuneatusSegmentsCount
                        - 1; i < brain.brainStem.medullaOblongata.leftHalf.nucleusGracilis.subnuclei.length; i++) {
                    addElement(
                            brain.brainStem.medullaOblongata.leftHalf.nucleusGracilis.subnuclei[i].inputFasciculusPath);
                }
            } else {
                // Neural paths leaving in current segment are included here
                for (int i = index - NervousSystemConstants.FasciculusCuneatusSegmentsCount
                        - 1; i < brain.brainStem.medullaOblongata.rightHalf.nucleusGracilis.subnuclei.length; i++) {
                    addElement(
                            brain.brainStem.medullaOblongata.rightHalf.nucleusGracilis.subnuclei[i].inputFasciculusPath);
                }
            }
        }

        // Adding muscle stretch and tension nerve fibers for segments lower than L3 segment - will enter Clarke's nucleus in the L3 segment.
        // Ipsilateral
        int clarkesNucleiLowerLevel = NervousSystemConstants.indexFromSegmentLabel("L3");
        NeuralPath[] muscleStretchAndTensionNerveFibers;
        if (index > clarkesNucleiLowerLevel) { // Adding them in the L3 white matter too
            if (side == Sides.Left) {
                muscleStretchAndTensionNerveFibers = spinalCord.segments[clarkesNucleiLowerLevel - 1].leftHalf.grayMatter.clarkesNucleus
                        .getNeuralInputs();
            } else {
                muscleStretchAndTensionNerveFibers = spinalCord.segments[clarkesNucleiLowerLevel - 1].rightHalf.grayMatter.clarkesNucleus
                        .getNeuralInputs();
            }
            for (int i = index; i <= NervousSystemConstants.SpinalSegmentsCount; i++) {
                addElement(muscleStretchAndTensionNerveFibers[i - 1 - clarkesNucleiLowerLevel]);
            }
        }
    }
}

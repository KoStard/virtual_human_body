package org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalSegment;

import org.MedStard.applied_types.NervousSystem.Brain;
import org.MedStard.constants.NervousSystemConstants;
import org.MedStard.enums.Sides;
import org.MedStard.types.NeuralSystem.NeuralPathGroup;

public class SpinalSegmentPosteriorColumn extends NeuralPathGroup {
    public SpinalSegmentPosteriorColumn(int index, Sides side, Brain brain) {
        super(String.format("spinal segment N%d %s white matter posterior column", index, side.label));
        // First element is the one that will be added to the spinal nerve
        if (index <= NervousSystemConstants.FasciculusCuneatusSegmentsCount) { // All fibers of fasciculus gracilis and part of fasciculus cuneatus
            if (side == Sides.Left) {
                // Neural paths leaving in current segment are included here
                for (int i = index - 1; i < brain.brainStem.medullaOblongata.leftHalf.nucleusCuneatus.subnuclei.length; i++) {
                    addElement(brain.brainStem.medullaOblongata.leftHalf.nucleusCuneatus.subnuclei[i].inputFasciculusPath);
                }
                for (int i = 0; i < brain.brainStem.medullaOblongata.leftHalf.nucleusGracilis.subnuclei.length; i++) {
                    addElement(brain.brainStem.medullaOblongata.leftHalf.nucleusGracilis.subnuclei[i].inputFasciculusPath);
                }
            } else {
                // Neural paths leaving in current segment are included here
                for (int i = index - 1; i < brain.brainStem.medullaOblongata.rightHalf.nucleusCuneatus.subnuclei.length; i++) {
                    addElement(brain.brainStem.medullaOblongata.rightHalf.nucleusCuneatus.subnuclei[i].inputFasciculusPath);
                }
                for (int i = 0; i < brain.brainStem.medullaOblongata.rightHalf.nucleusGracilis.subnuclei.length; i++) {
                    addElement(brain.brainStem.medullaOblongata.rightHalf.nucleusGracilis.subnuclei[i].inputFasciculusPath);
                }
            }
        } else { // Part of fasciculus gracilis
            if (side == Sides.Left) {
                // Neural paths leaving in current segment are included here
                for (int i = index - NervousSystemConstants.FasciculusCuneatusSegmentsCount - 1; i < brain.brainStem.medullaOblongata.leftHalf.nucleusGracilis.subnuclei.length; i++) {
                    addElement(brain.brainStem.medullaOblongata.leftHalf.nucleusGracilis.subnuclei[i].inputFasciculusPath);
                }
            } else {
                // Neural paths leaving in current segment are included here
                for (int i = index - NervousSystemConstants.FasciculusCuneatusSegmentsCount - 1; i < brain.brainStem.medullaOblongata.rightHalf.nucleusGracilis.subnuclei.length; i++) {
                    addElement(brain.brainStem.medullaOblongata.rightHalf.nucleusGracilis.subnuclei[i].inputFasciculusPath);
                }
            }
        }
    }
}

package org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalSegment.WhiteMatter;

import java.util.Vector;

import org.MedStard.applied_types.Human.Organism;
import org.MedStard.applied_types.NervousSystem.MedullaOblongata.Cuneatus.NucleusCuneatusSubnucleus;
import org.MedStard.applied_types.NervousSystem.MedullaOblongata.Gracilis.NucleusGracilisSubnucleus;
import org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalSegment.GrayMatter.ClarkesSubnucleus;
import org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalSegment.SpinalSegment;
import org.MedStard.constants.NervousSystemConstants;
import org.MedStard.enums.Sides;
import org.MedStard.types.NeuralSystem.NeuralPathGroup;
import org.MedStard.types.NeuralSystem.NucleusElement;

public class SpinalSegmentPosteriorFuniculus extends NeuralPathGroup {
    int index;
    Sides side;
    Organism organism;

    public SpinalSegmentPosteriorFuniculus(int index, Sides side, Organism organism) {
        super(String.format("spinal segment N%d %s white matter posterior funiculus", index, side.label));
        this.index = index;
        this.organism = organism;
        this.side = side;
    }

    private void addFasciculusGracilisAndCuneatus() {
        // Fasciculus Gracilis and Cuneatus
        // First element is the one that will be added to the spinal nerve
        if (index <= NervousSystemConstants.FasciculusCuneatusSegmentsCount) { // All fibers of fasciculus gracilis and part of fasciculus cuneatus
            NucleusCuneatusSubnucleus[] cuneatusSubnuclei;
            NucleusGracilisSubnucleus[] gracilisSubnuclei;
            if (side == Sides.Left) {
                cuneatusSubnuclei = organism.nervousSystem.brain.brainStem.medullaOblongata.leftHalf.nucleusCuneatus.subnuclei;
                gracilisSubnuclei = organism.nervousSystem.brain.brainStem.medullaOblongata.leftHalf.nucleusGracilis.subnuclei;
            } else {
                cuneatusSubnuclei = organism.nervousSystem.brain.brainStem.medullaOblongata.rightHalf.nucleusCuneatus.subnuclei;
                gracilisSubnuclei = organism.nervousSystem.brain.brainStem.medullaOblongata.rightHalf.nucleusGracilis.subnuclei;
            }
            // Neural paths leaving in current segment are included here
            for (int i = index - 1; i < cuneatusSubnuclei.length; i++) {
                addElement(
                        cuneatusSubnuclei[i].inputFasciculusPath);
            }
            for (int i = 0; i < gracilisSubnuclei.length; i++) {
                addElement(
                        gracilisSubnuclei[i].inputFasciculusPath);
            }
        } else { // Part of fasciculus gracilis
            NucleusGracilisSubnucleus[] gracilisSubnuclei;
            if (side == Sides.Left) {
                gracilisSubnuclei = organism.nervousSystem.brain.brainStem.medullaOblongata.leftHalf.nucleusGracilis.subnuclei;
            } else {
                gracilisSubnuclei = organism.nervousSystem.brain.brainStem.medullaOblongata.rightHalf.nucleusGracilis.subnuclei;
            }
            // Neural paths leaving in current segment are included here
            for (int i = index - NervousSystemConstants.FasciculusCuneatusSegmentsCount
                    - 1; i < gracilisSubnuclei.length; i++) {
                addElement(
                        gracilisSubnuclei[i].inputFasciculusPath);
            }
        }
    }

    private void addMuscleStretchAndTensionNerveFibers() {
        // Adding muscle stretch and tension nerve fibers for segments lower than L3 segment - will enter Clarke's nucleus in the L3 segment.
        // Ipsilateral
        int clarkesNucleiLowerLevel = NervousSystemConstants.indexFromSegmentLabel("L3");
        if (index >= clarkesNucleiLowerLevel) { // Adding them in the L3 white matter too
            Vector<NucleusElement> clarkesSubnuclei;
            SpinalSegment lastSegmentWithClarkesNuclei = organism.nervousSystem.spinalCord.segments[clarkesNucleiLowerLevel - 1];
            if (side == Sides.Left) {
                clarkesSubnuclei = lastSegmentWithClarkesNuclei.leftHalf.grayMatter.clarkesNucleus.getElements();
            } else {
                clarkesSubnuclei = lastSegmentWithClarkesNuclei.rightHalf.grayMatter.clarkesNucleus.getElements();
            }
            for (int i = Math.max(index, clarkesNucleiLowerLevel + 1); i <= NervousSystemConstants.SpinalSegmentsCount; i++) {
                addElement(((ClarkesSubnucleus) clarkesSubnuclei.get(i - clarkesNucleiLowerLevel)).muscleStretchAndTensionNerveFibers);
            }
        }
    }

    @Override
    public void initialize() {
        addFasciculusGracilisAndCuneatus();
        addMuscleStretchAndTensionNerveFibers();
        super.initialize();
    }
}

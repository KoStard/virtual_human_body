package org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalSegment.GrayMatter;

import org.MedStard.constants.NervousSystemConstants;
import org.MedStard.enums.Sides;
import org.MedStard.types.NeuralSystem.Nucleus;
import org.MedStard.types.NeuralSystem.NucleusElement;
import org.MedStard.types.NeuralSystem.SubNucleus;

import javax.management.InvalidAttributeValueException;

/**
 * Clarke's Nucleus in the posterior horn
 * Other names are posterior thoracic nucleus, column of Clarke, dorsal nucleus
 * 
 * Located in the posterior gray column
 * Between between the C8 and L3 levels
 * - below the level of the neck
 * Fibers from regions below L3 are entering dorsal column and ascend to L3 for synapting
 * Dorsal column damages below L3 can lead to loss of coordination of the legs - cerebellar damage appearance
 * 
 * Lateral funiculus, inferior peduncle, spinocerebellum (vermis, paravermis)
 * 
 * Source
 * https://www.dartmouth.edu/~rswenson/NeuroSci/chapter_7A.html#Dorsal_spinocerebellar
 */
public class ClarkesNucleus extends Nucleus {
    public int segmentIndex;
    public Sides side;

    public ClarkesNucleus(Sides side, int segmentIndex) {
        super(String.format("%s %d Clarke's nucleus", side.label, segmentIndex));
        this.segmentIndex = segmentIndex;
        this.side = side;
        // Add inputs here, outputs will be added later
        int lowerEdgeSegmentIndex = NervousSystemConstants.clarkesNucleiLowerLevel;
        if (segmentIndex == lowerEdgeSegmentIndex) {
            // Adding fibers from lower segments here, because they don't have clarke's nucleus there
            // Sorted by leaving levels - from up to down - so in the last segment there will only be the LAST element
            // First one will get fibers from current segment
            for (int i = 0; i < NervousSystemConstants.SpinalSegmentsCount - lowerEdgeSegmentIndex + 1; i++) {
                ClarkesSubnucleus clarkesSubnucleus = new ClarkesSubnucleus(side, segmentIndex + i, segmentIndex);
                addElement(clarkesSubnucleus);
            }
        } else {
            ClarkesSubnucleus clarkesSubnucleus = new ClarkesSubnucleus(side, segmentIndex, segmentIndex);
            addElement(clarkesSubnucleus);
        }
    }

    public MuscleStretchAndTensionNerveFibers getWithSegmentIndex(int index) throws InvalidAttributeValueException {
        for (NucleusElement e : getElements()) {
            ClarkesSubnucleus s = (ClarkesSubnucleus) e;
            if (s.targetSegmentIndex == index) {
                return s.muscleStretchAndTensionNerveFibers;
            }
        }
        throw new InvalidAttributeValueException(String.format("Invalid index %d is given", index));
    }
}
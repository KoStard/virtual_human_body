package org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalSegment;

import org.MedStard.applied_types.Human.Organism;
import org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalNerve;
import org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalSegment.GrayMatter.ClarkesSubnucleus;
import org.MedStard.constants.NervousSystemConstants;
import org.MedStard.enums.Sides;
import org.MedStard.types.AbstractTypes.Initializable;
import org.MedStard.types.AbstractTypes.Symmetric;

import java.security.InvalidKeyException;

public class SpinalSegment implements Initializable, Symmetric<SpinalHalfSegment> {
    public int index;
    public SpinalHalfSegment leftHalf;
    public SpinalHalfSegment rightHalf;
    public Organism organism;

    public SpinalSegment(Organism organism, int index) {
        this.index = index;
        leftHalf = new SpinalHalfSegment(index, Sides.Left, organism);
        rightHalf = new SpinalHalfSegment(index, Sides.Right, organism);
        this.organism = organism;
    }

    private void initializeSpinalNerves() {
        leftHalf.spinalNerve.addElement(leftHalf.whiteMatter.posteriorFuniculus.getElements().get(0));
        rightHalf.spinalNerve.addElement(rightHalf.whiteMatter.posteriorFuniculus.getElements().get(0));

        // Adding muscleStretchAndTensionNerveFibers for segments that are lower than L3 - for clarke's nuclei
        int clarkesNucleiLowerLevel = NervousSystemConstants.clarkesNucleiLowerLevel;
        int clarkesNucleiUpperLevel = NervousSystemConstants.clarkesNucleiUpperLevel;
        if (index >= clarkesNucleiUpperLevel) {
            if (index <= clarkesNucleiLowerLevel) {
                SpinalSegment segment = organism.nervousSystem.spinalCord.getSegmentByIndex(index);
                leftHalf.spinalNerve
                        .addElement(((ClarkesSubnucleus) segment.leftHalf.grayMatter.clarkesNucleus
                                .getElementByIndex(0)).muscleStretchAndTensionNerveFibers);
                rightHalf.spinalNerve
                        .addElement(((ClarkesSubnucleus) segment.rightHalf.grayMatter.clarkesNucleus
                                .getElementByIndex(0)).muscleStretchAndTensionNerveFibers);
            } else {
                SpinalSegment segment = organism.nervousSystem.spinalCord.getSegmentByIndex(clarkesNucleiLowerLevel);
                leftHalf.spinalNerve
                        .addElement(((ClarkesSubnucleus) segment.leftHalf.grayMatter.clarkesNucleus
                                .getElementByIndex(index - clarkesNucleiLowerLevel)).muscleStretchAndTensionNerveFibers);
                rightHalf.spinalNerve
                        .addElement(((ClarkesSubnucleus) segment.rightHalf.grayMatter.clarkesNucleus
                                .getElementByIndex(index - clarkesNucleiLowerLevel)).muscleStretchAndTensionNerveFibers);
            }
        }
    }

    public SpinalNerve getSpinalNerve(Sides side) {
        if (side == Sides.Left) {
            return leftHalf.spinalNerve;
        } else {
            return rightHalf.spinalNerve;
        }
    }

    @Override
    public void initialize() {
        leftHalf.initialize();
        rightHalf.initialize();
        initializeSpinalNerves();
    }

    @Override
    public SpinalHalfSegment getConstituentElement(Sides side) throws InvalidKeyException {
        if (side == Sides.Left) {
            return leftHalf;
        } else if (side == Sides.Right) {
            return rightHalf;
        } else {
            throw new InvalidKeyException(String.format("Invalid side %s", side.label));
        }
    }
}
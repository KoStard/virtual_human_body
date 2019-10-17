package org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalSegment;

import org.MedStard.applied_types.Human.Organism;
import org.MedStard.applied_types.NervousSystem.Brain;
import org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalCord;
import org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalNerve;
import org.MedStard.constants.NervousSystemConstants;
import org.MedStard.enums.Sides;
import org.MedStard.types.AbstractTypes.Initializable;

public class SpinalSegment implements Initializable {
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

    void initializeSpinalNerves() {
        leftHalf.spinalNerve.addElement(leftHalf.whiteMatter.posteriorFuniculus.getElements().get(0));
        rightHalf.spinalNerve.addElement(rightHalf.whiteMatter.posteriorFuniculus.getElements().get(0));

        // Adding muscleStretchAndTensionNerveFibers for segments that are lower than L3 - for clarke's nuclei
        int clarkesNucleiLowerLevel = NervousSystemConstants.indexFromSegmentLabel("L3");
        if (index > clarkesNucleiLowerLevel) {
            leftHalf.spinalNerve
                    .addElement(organism.nervousSystem.spinalCord.segments[clarkesNucleiLowerLevel - 1].leftHalf.grayMatter.clarkesNucleus
                            .getNeuralInputs()[index - clarkesNucleiLowerLevel]);
            rightHalf.spinalNerve
                    .addElement(organism.nervousSystem.spinalCord.segments[clarkesNucleiLowerLevel - 1].rightHalf.grayMatter.clarkesNucleus
                            .getNeuralInputs()[index - clarkesNucleiLowerLevel]);
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
}
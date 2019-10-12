package org.MedStard.applied_types.NervousSystem;

import org.MedStard.constants.NervousSystemConstants;
import org.MedStard.enums.Sides;
import org.MedStard.types.NeuralSystem.NeuralPathGroup;
import org.MedStard.types.NeuralSystem.Nucleus;

class SpinalSegmentAnteriorColumn extends NeuralPathGroup {
    public SpinalSegmentAnteriorColumn(int index, Sides side, Brain brain) {
        super(String.format("spinal segment N%d %s white matter anterior column", index, side.label));
    }
}


class SpinalSegmentLateralColumn extends NeuralPathGroup {
    public SpinalSegmentLateralColumn(int index, Sides side, Brain brain) {
        super(String.format("spinal segment N%d %s white matter lateral column", index, side.label));
    }
}


class SpinalSegmentPosteriorColumn extends NeuralPathGroup {
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

class SpinalSegmentHalfWhiteMatter extends NeuralPathGroup {
    public SpinalSegmentAnteriorColumn anteriorColumn;
    public SpinalSegmentLateralColumn lateralColumn;
    public SpinalSegmentPosteriorColumn posteriorColumn;

    public SpinalSegmentHalfWhiteMatter(int index, Sides side, Brain brain) {
        super(String.format("spinal segment N%d %s white matter", index, side.label));
        anteriorColumn = new SpinalSegmentAnteriorColumn(index, side, brain);
        lateralColumn = new SpinalSegmentLateralColumn(index, side, brain);
        posteriorColumn = new SpinalSegmentPosteriorColumn(index, side, brain);
        addElement(anteriorColumn);
        addElement(lateralColumn);
        addElement(posteriorColumn);
    }
}

/**
 * Considering that subnuclei are not connected between them -> extends from Nucleus
 * Don't adding subnuclei yet
 */

class SpinalSegmentHalfGrayMatter extends Nucleus {

    public SpinalSegmentHalfGrayMatter(int index, Sides side) {
        super(String.format("spinal segment N%d %s half gray matter", index, side.label));
    }
}

class SpinalHalfSegment {
    public SpinalSegmentHalfWhiteMatter whiteMatter;
    public SpinalSegmentHalfGrayMatter grayMatter;
    public SpinalNerve spinalNerve;
    public Sides side;

    public SpinalHalfSegment(int index, Sides side, Brain brain) {
        whiteMatter = new SpinalSegmentHalfWhiteMatter(index, side, brain);
        grayMatter = new SpinalSegmentHalfGrayMatter(index, side);
        spinalNerve = new SpinalNerve(index, side);  // Will be initialized later
        this.side = side;
    }
}


public class SpinalSegment {
    public int index;
    public SpinalHalfSegment leftHalf;
    public SpinalHalfSegment rightHalf;

    public SpinalSegment(int index, Brain brain) {
        this.index = index;
        leftHalf = new SpinalHalfSegment(index, Sides.Left, brain);
        rightHalf = new SpinalHalfSegment(index, Sides.Right, brain);
        initializeSpinalNerves(brain);
    }

    void initializeSpinalNerves(Brain brain) {
        leftHalf.spinalNerve.addElement(leftHalf.whiteMatter.posteriorColumn.getElements().get(0));
        rightHalf.spinalNerve.addElement(rightHalf.whiteMatter.posteriorColumn.getElements().get(0));
    }

    public SpinalNerve getSpinalNerve(Sides side) {
        if (side == Sides.Left) {
            return leftHalf.spinalNerve;
        } else {
            return rightHalf.spinalNerve;
        }
    }
}

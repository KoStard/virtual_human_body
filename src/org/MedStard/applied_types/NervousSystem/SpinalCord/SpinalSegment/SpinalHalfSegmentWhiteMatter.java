package org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalSegment;

import org.MedStard.applied_types.NervousSystem.Brain;
import org.MedStard.enums.Sides;
import org.MedStard.types.NeuralSystem.NeuralPathGroup;

public class SpinalHalfSegmentWhiteMatter extends NeuralPathGroup {
    public SpinalSegmentAnteriorColumn anteriorColumn;
    public SpinalSegmentLateralColumn lateralColumn;
    public SpinalSegmentPosteriorColumn posteriorColumn;

    public SpinalHalfSegmentWhiteMatter(int index, Sides side, Brain brain) {
        super(String.format("spinal segment N%d %s white matter", index, side.label));
        anteriorColumn = new SpinalSegmentAnteriorColumn(index, side, brain);
        lateralColumn = new SpinalSegmentLateralColumn(index, side, brain);
        posteriorColumn = new SpinalSegmentPosteriorColumn(index, side, brain);
        addElement(anteriorColumn);
        addElement(lateralColumn);
        addElement(posteriorColumn);
    }
}

package org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalSegment.WhiteMatter.SpinoCerebellarTracts;

import org.MedStard.applied_types.Human.Organism;
import org.MedStard.enums.Sides;
import org.MedStard.types.NeuralSystem.NeuralPath;

public class VentralSpinoCerebellarPath extends NeuralPath {
    private Organism organism;
    private Sides side;
    private int sourceSegmentIndex;
    public VentralSpinoCerebellarPath(Organism organism, Sides side, int sourceSegmentIndex) {
        super(String.format("ventral spinocerebellar tract of %s segment %d", side.label, sourceSegmentIndex));
        this.organism = organism;
        this.side = side;
        this.sourceSegmentIndex = sourceSegmentIndex;
    }
    @Override
    public void initialize() {

    }
}

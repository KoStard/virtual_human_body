package org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalSegment.WhiteMatter;

import org.MedStard.applied_types.Human.Organism;
import org.MedStard.enums.Sides;
import org.MedStard.types.NeuralSystem.NeuralPath;

public class DorsalSpinoCerebellarPath extends NeuralPath {
    private Organism organism;
    private Sides side;
    private int sourceSegmentIndex;

    /**
     * @param organism
     * @param side
     * @param sourceSegmentIndex - because multiple Clarke's subnuclei can be in the L3 segment,
     *                           we can have multiple DorsalSpinoCerebellarPaths with same sourceSegmentIndex,
     *                           because sourceSegmentIndex here is the source of the path not of the muscle and
     *                           stretch fibers
     */
    public DorsalSpinoCerebellarPath(Organism organism, Sides side, int sourceSegmentIndex) {
        super(String.format("dorsal spinocerebellar tract of %s segment %d", side.label, sourceSegmentIndex));
        this.organism = organism;
        this.side = side;
        this.sourceSegmentIndex = sourceSegmentIndex;
    }

    @Override
    public void initialize() {

    }
}

package org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalSegment.GrayMatter;

import org.MedStard.applied_types.Human.Organism;
import org.MedStard.applied_types.NervousSystem.MedullaOblongata.MedullaOblongataHalf;
import org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalCord;
import org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalSegment.SpinalHalfSegment;
import org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalSegment.SpinalSegment;
import org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalSegment.WhiteMatter.DorsalSpinoCerebellarPath;
import org.MedStard.enums.Sides;
import org.MedStard.types.NeuralSystem.SubNucleus;

import java.security.InvalidKeyException;

public class ClarkesSubnucleus extends SubNucleus {
    public MuscleStretchAndTensionNerveFibers muscleStretchAndTensionNerveFibers;
    public DorsalSpinoCerebellarPath dorsalSpinoCerebellarPath;
    public int sourceSegmentIndex;
    private int segmentIndex;
    private Sides side;
    private Organism organism;

    public ClarkesSubnucleus(Organism organism, Sides side, int sourceSegmentIndex, int segmentIndex) {
        super(String.format("%s %d Clarke's subnucleus for segment %d", side.label, segmentIndex, sourceSegmentIndex));
        this.sourceSegmentIndex = sourceSegmentIndex;
        this.segmentIndex = segmentIndex;
        this.side = side;
        this.organism = organism;
        muscleStretchAndTensionNerveFibers = new MuscleStretchAndTensionNerveFibers(sourceSegmentIndex, side);

        // Adding dorsal spinocerebellar tract and binding with this subnucleus
        dorsalSpinoCerebellarPath = new DorsalSpinoCerebellarPath(organism, side, segmentIndex);
    }

    /**
     * Adding dorsal spinocerebellar path to the spinal white matter lateral funiculi
     * - ipsilateral
     * <p>
     * Adding to the inferior peduncle
     * These fibers end in the spinocerebellum (for now on whole vermis)
     */
    @Override
    public void initialize() {
        SpinalCord spinalCord = organism.nervousSystem.spinalCord;
        for (int i = segmentIndex; i >= 1; i--) {
            SpinalSegment spinalSegment = spinalCord.getSegmentByIndex(i);
            try {
                SpinalHalfSegment spinalHalfSegment = spinalSegment.getConstituentElement(side);
                spinalHalfSegment.whiteMatter.lateralFuniculus.addElement(dorsalSpinoCerebellarPath);
            } catch (InvalidKeyException e) {
                // Invalid state
                e.printStackTrace();
            }
        }

        try {
            MedullaOblongataHalf medullaOblongataHalf = organism.nervousSystem.brain.brainStem.medullaOblongata.getConstituentElement(side);
            medullaOblongataHalf.lowerPeduncle.addElement(dorsalSpinoCerebellarPath);
        } catch (InvalidKeyException e) {
            // Invalid state
            e.printStackTrace();
        }
        muscleStretchAndTensionNerveFibers.setTarget(this);

        dorsalSpinoCerebellarPath.setSource(this);
        dorsalSpinoCerebellarPath.setTarget(organism.nervousSystem.brain.cerebellum.vermis);
    }
}

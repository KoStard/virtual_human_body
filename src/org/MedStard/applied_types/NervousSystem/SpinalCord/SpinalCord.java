package org.MedStard.applied_types.NervousSystem.SpinalCord;

import org.MedStard.applied_types.NervousSystem.Brain;
import org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalSegment.SpinalSegment;
import org.MedStard.constants.NervousSystemConstants;
import org.MedStard.types.AbstractTypes.Initializable;

/**
 * Containing 31 segments
 */
public class SpinalCord implements Initializable {
    public SpinalSegment[] segments;

    public SpinalCord(Brain brain) {
        segments = new SpinalSegment[NervousSystemConstants.SpinalSegmentsCount];
        // Constructing the spinal cord from up to the bottom
        for (int i = 0; i < segments.length; i++) {
            segments[i] = new SpinalSegment(i + 1, brain, this);  // Index is 1 based
        }
    }

    @Override
    public void initialize() {
        for (SpinalSegment s : segments) {
            s.initialize();
        }
    }
}

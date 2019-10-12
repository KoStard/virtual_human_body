package org.MedStard.applied_types.NervousSystem.SpinalCord;

import org.MedStard.applied_types.NervousSystem.Brain;
import org.MedStard.applied_types.NervousSystem.SpinalCord.SpinalSegment.SpinalSegment;
import org.MedStard.constants.NervousSystemConstants;

/**
 * Containing 31 segments
 */
public class SpinalCord {
    public SpinalSegment[] segments;

    public SpinalCord(Brain brain) {
        segments = new SpinalSegment[NervousSystemConstants.SpinalSegmentsCount];
        for (int i = 0; i < segments.length; i++) {
            segments[i] = new SpinalSegment(i + 1, brain);  // Index is 1 based
        }
    }
}

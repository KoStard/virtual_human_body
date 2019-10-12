package org.MedStard.applied_types.NervousSystem;

/**
 * Containing 31 segments
 */
public class SpinalCord {
    SpinalSegment[] segments;

    public SpinalCord() {
        segments = new SpinalSegment[31];
        for (int i = 0; i < 31; i++) {
            segments[i] = new SpinalSegment(i + 1);
        }
    }
}

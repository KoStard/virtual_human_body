package org.MedStard.constants;

public class NervousSystemConstants {
    public static final int SpinalSegmentsCount = 31;
    public static final int FasciculusCuneatusSegmentsCount = 14;
    public static final int FasciculusGracilisSegmentsCount = 17;

    public static int indexFromSegmentLabel(String label) {
        /**
         * Spinal cord segments - 31 segments:
         * - 8 cervical - C8 pair of nerves leave the spine between C7 and T1 vertebrae, C1 leaves between the foramen magnum and the C1 vertebra
         * - 12 thoracic - Th
         * - 5 lumbar - L
         * - 5 sacral - S
         * - 1 coccygeal - Cx
         */
        int partIndex = 0;
        String part = "";
        for (char c : label.toCharArray()) {
            if (Character.isDigit(c)) {
                partIndex = partIndex * 10 + Character.getNumericValue(c);
            } else {
                part += c;
            }
        }
        int index = 0;
        if (!part.equals("C")) {
            index += 8;
            if (!part.equals("Th")) {
                index += 12;
                if (!part.equals("L")) {
                    index += 5;
                    if (!part.equals("S")) {
                        index += 5;
                        if (!part.equals("Cx")) {
                            index += 1; // This is problematic!
                        }
                    }
                }
            }
        }
        index += partIndex;
        return index; // 1 based
    }
}

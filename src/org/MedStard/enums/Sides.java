package org.MedStard.enums;

public enum Sides {
    Left("Left"),
    Right("Right"),

    // Using Latin here
    Superior("Superior"),
    Inferior("Inferior"),
    Anterior("Anterior"),
    Posterior("Posterior");

    public final String label;
    Sides(String label) {
        this.label = label;
    }
}

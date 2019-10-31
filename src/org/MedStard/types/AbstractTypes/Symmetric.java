package org.MedStard.types.AbstractTypes;

import org.MedStard.enums.Sides;

import java.security.InvalidKeyException;

public interface Symmetric<ElementType> {
    ElementType getConstituentElement(Sides side) throws InvalidKeyException;
}

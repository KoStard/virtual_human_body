package org.MedStard.types.AbstractTypes;

import java.util.Vector;

public interface Group<ElementType extends GroupElement<?>> {
	void addElement(ElementType e);
	void removeElement(ElementType e);
	void bindElement(ElementType e);  //- Has to add current group as owner to the element
	ElementType getElementByIndex(int i);
	Vector<ElementType> getElements();
}

package org.MedStard.types.AbstractTypes;

import java.util.LinkedList;

public interface GroupElement <GroupType extends Group<?>> {
	void appendOwner(GroupType g);
	void removeOwner(GroupType g);
	LinkedList<GroupType> getOwners();  // Owners are chained - they don't overlap
	Boolean hasOwner();
}

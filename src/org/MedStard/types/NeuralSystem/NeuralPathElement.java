package org.MedStard.types.NeuralSystem;

import org.MedStard.types.AbstractTypes.Excitable;
import org.MedStard.types.AbstractTypes.GroupElement;

/**
 * Interface for all types that can be element of NeuralPathGroup - NeuralPath and NeuralPathGroup
 * 
 * @author rubenkostandyan
 *
 */

public interface NeuralPathElement extends GroupElement<NeuralPathGroup>, Excitable {
}

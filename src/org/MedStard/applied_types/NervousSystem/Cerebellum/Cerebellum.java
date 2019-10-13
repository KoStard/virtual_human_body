package org.MedStard.applied_types.NervousSystem.Cerebellum;

import org.MedStard.enums.Sides;
import org.MedStard.types.NeuralSystem.Nucleus;

// Anterior Lobe, Middle Lobe, Flocculonodular Lobe (on the inferior surface)

public class Cerebellum extends Nucleus {
    public Vermis vermis;
    public Paravermis leftParavermis;
    public Paravermis rightParavermis;
    public Hemisphere leftHemisphere;
    public Hemisphere rightHemisphere;
    public Cerebellum() {
        super("Cerebellum");
        vermis = new Vermis();
        leftParavermis = new Paravermis(Sides.Left);
        rightParavermis = new Paravermis(Sides.Right);
        leftHemisphere = new Hemisphere(Sides.Left);
        rightHemisphere = new Hemisphere(Sides.Right);
        addElement(vermis);
        addElement(leftParavermis);
        addElement(rightParavermis);
        addElement(leftHemisphere);
        addElement(rightHemisphere);
    }
}

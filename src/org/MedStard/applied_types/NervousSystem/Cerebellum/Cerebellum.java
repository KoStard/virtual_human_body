package org.MedStard.applied_types.NervousSystem.Cerebellum;

import org.MedStard.applied_types.Human.Organism;
import org.MedStard.enums.Sides;
import org.MedStard.types.NeuralSystem.Nucleus;

// Anterior Lobe, Middle Lobe, Flocculonodular Lobe (on the inferior surface)

public class Cerebellum extends Nucleus {
    public Vermis vermis;
    public Paravermis leftParavermis;
    public Paravermis rightParavermis;
    public Hemisphere leftHemisphere;
    public Hemisphere rightHemisphere;
    private Organism organism;
    public Cerebellum(Organism organism) {
        super("Cerebellum");
        vermis = new Vermis();
        leftParavermis = new Paravermis(organism, Sides.Left);
        rightParavermis = new Paravermis(organism, Sides.Right);
        leftHemisphere = new Hemisphere(organism, Sides.Left);
        rightHemisphere = new Hemisphere(organism, Sides.Right);
        addElement(vermis);
        addElement(leftParavermis);
        addElement(rightParavermis);
        addElement(leftHemisphere);
        addElement(rightHemisphere);
    }
}

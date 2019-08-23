package org.MedStard.types.NeuralSystem;

import org.MedStard.types.AbstractTypes.Excitable;
import org.MedStard.types.AbstractTypes.Named;

import java.util.Vector;

public class Nucleus implements Excitable, Named {
    private String name;
    private Vector<SubNucleus> subNuclei;

    public Nucleus(String name) {
    	subNuclei = new Vector<>();
        setName(name);
    }

    @Override
    public void stimulate() {
    	System.out.println("Stimulating Nucleus");
        for (SubNucleus subNucleus : subNuclei) {
        	subNucleus.stimulate();
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    public void addSubNucleus(SubNucleus subNucleus) {
        subNuclei.add(subNucleus);
    }

    public void removeSubNucleus(SubNucleus subNucleus) {
        subNuclei.remove(subNucleus);
    }
}

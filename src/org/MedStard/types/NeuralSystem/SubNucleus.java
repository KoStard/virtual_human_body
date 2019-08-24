package org.MedStard.types.NeuralSystem;

import java.util.LinkedList;
import java.util.Vector;

import org.MedStard.types.AbstractTypes.Excitable;

/**
 * 
 * Smallest nuclear element - is doing one concrete mission - otherwise it would be splitted into multiple subnuclei
 * 
 * @author rubenkostandyan
 *
 */

public class SubNucleus implements Excitable, NeuralPathSource, NeuralPathTarget, NucleusElement {
    private Vector<NeuralPath> neuralInputs;
    private Vector<NeuralPath> neuralOutputs;
    private LinkedList<Nucleus> owners;
    private String name;
    
    public SubNucleus(String name) {
    	setName(name);
    	neuralOutputs = new Vector<>();
    	neuralInputs = new Vector<>();
    	owners = new LinkedList<>();
    }


    @Override
    public void addToNeuralOutputs(NeuralPath nerve) {
        neuralOutputs.add(nerve);
    }

    @Override
    public void removeFromNeuralOutputs(NeuralPath nerve) {
        neuralOutputs.remove(nerve);
    }

    @Override
    public NeuralPath[] getNeuralOutputs() {
        return neuralOutputs.toArray(new NeuralPath[neuralOutputs.size()]);
    }

    @Override
    public void addToNeuralInputs(NeuralPath nerve) {
        neuralInputs.add(nerve);
    }

    @Override
    public void removeFromNeuralInputs(NeuralPath nerve) {
        neuralInputs.remove(nerve);
    }

	@Override
	public NeuralPath[] getNeuralInputs() {
		return neuralInputs.toArray(new NeuralPath[neuralInputs.size()]);
	}

    @Override
    public void stimulate() {
        System.out.println(String.format("The subnucleus %s is stimulating.", getName()));
        for (int i = 0; i < neuralOutputs.size(); i++) {
            neuralOutputs.elementAt(i).stimulate();
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


	@Override
	public void appendOwner(Nucleus g) {
		owners.add(g);
	}


	@Override
	public void removeOwner(Nucleus g) {
		owners.remove(g);
	}


	@Override
	public LinkedList<Nucleus> getOwners() {
		return owners;
	}


	@Override
	public Boolean hasOwner() {
		return owners.isEmpty();
	}
}

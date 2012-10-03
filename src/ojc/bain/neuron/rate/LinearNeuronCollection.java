package ojc.bain.neuron.rate;

import ojc.bain.base.*;

/**
 * Implements neurons that simply pass through received input.
 * 
 * @author Oliver J. Coleman
 */
public class LinearNeuronCollection extends NeuronCollectionWithBias {
	/**
	 * Create a LinearNeuronCollection.java.
	 * 
	 * @param size The size of this collection.
	 */
	public LinearNeuronCollection(int size) {
		this.size = size;
		init();
	}

	@Override
	public void run() {
		int neuronID = getGlobalId();
		if (neuronID >= size)
			return;
		neuronOutputs[neuronID] = neuronInputs[neuronID] + bias[neuronID];
		super.run();
	}

	@Override
	public ComponentConfiguration getConfigSingleton() {
		return null;
	}

	@Override
	public void ensureStateVariablesAreFresh() {
	}

	@Override
	public ComponentCollection createCollection(int size) {
		return new LinearNeuronCollection(size);
	}
}
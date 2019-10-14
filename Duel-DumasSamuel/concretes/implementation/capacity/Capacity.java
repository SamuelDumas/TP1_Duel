package implementation.capacity;

import abstracts.combattant.ICapacity;
import exceptions.capacity.IllegalCharacteristicException;
import implementation.combattant.Fighter;

public abstract class Capacity implements ICapacity {

	int characteristic;//MS bien que la s�curit� par d�faut est "private", la bonne pratique est de le sp�cifier.//MS Qu'est-ce qu'on fait si on ajoute des nouvelles possibilit�s de caract�ristiques? Est-ce que �a aurait �t� plus simple de lui passer une liste de ICaract�ristiques?
	final static int MINIMUM_CHARACTERISTIC = 20;
	final static int MAXIMUM_CHARACTERISTIC = 100;
	
	public Capacity(int characteristic) {
		validateCharacteristic(characteristic);
		this.characteristic = characteristic;
	}
	private void validateCharacteristic(int characteristic) {
		if(characteristic < MINIMUM_CHARACTERISTIC || characteristic > MAXIMUM_CHARACTERISTIC) throw new IllegalCharacteristicException();
		
	}
	public int getCharacteristic() {
		return this.characteristic;
		
	}
	public int getPower(Fighter fighter) {//MS On doit mettre cette m�thode abstract plut�t que de mettre return 0;
		// TODO Auto-generated method stub
		return 0;
	}
}

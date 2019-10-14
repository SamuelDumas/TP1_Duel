package implementation.capacity;

import abstracts.combattant.ICapacity;
import exceptions.capacity.IllegalCharacteristicException;
import implementation.combattant.Fighter;

public abstract class Capacity implements ICapacity {

	int characteristic;//MS bien que la sécurité par défaut est "private", la bonne pratique est de le spécifier.//MS Qu'est-ce qu'on fait si on ajoute des nouvelles possibilités de caractéristiques? Est-ce que ça aurait été plus simple de lui passer une liste de ICaractéristiques?
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
	public int getPower(Fighter fighter) {//MS On doit mettre cette méthode abstract plutôt que de mettre return 0;
		// TODO Auto-generated method stub
		return 0;
	}
}

package implementation.capacity;

import implementation.combattant.Fighter;

public class Shield extends Capacity{


	public Shield(int characteristic) {
		super(characteristic);
	
	}
	
 public int getPower(Fighter fighter) {
	 return  fighter.getStrength()* characteristic/100;
 }
	

}

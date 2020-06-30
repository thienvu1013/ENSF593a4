/**
 * 
 * Wolf is a subclass of Animal and implements the Predator interface.
 * 
 * @author Thien Nguyen
 * @since June 7 2020
 */

public class Wolf extends Animal implements Predator {
	/**
	 * Constructor for Wolf
	 */
	 public Wolf() {
	        kind = "wolf";
	 }

	 /**
	  * speak() implements the Animal speak() method. Wolf howls
	  */
	 public String speak() {
		 return "Awoooo!";
	 }

	 /**
	  * eat() implements the Animal eat() method. A wolf eats smaller animals.
	  */
	 public String eat() {
		 return "small animals";
	 }

	 /**
	  * preysOn() implements the Predator interface
	  */
	public boolean preysOn(Animal x) {
		boolean isIt = false;
		if ((x instanceof Cat) || (x instanceof Dog)){
			isIt = true;
		}
		return (isIt);
	}


}

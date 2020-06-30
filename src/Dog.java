/**
 * Dog extends the Animal class.
 * @author Thien Nguyen
 * @since June 7 2020
 * 
 * Dog class represent our furry companion.
 * It have methods that describe what a typical dog do.
 *
 */

public class Dog extends Animal implements Trainable {
	/**
	 * Dog() constructor assign the kind variable when declared.
	 */
	public Dog() {
		kind = "Dog";
	}
	/**
	 * speak() implements the speak() method in animal
	 * "ruff" was chosen because "bow wow" seems weird.
	 */
	public String speak() {
		
		return ("ruff ruff");
	}
    /**
     * eat() implements the Animal eat() method.
     * A dog eats bone.
     */
    public String eat() {
    	return "bone";
    }
	/**
	 * doATrick() is implemented from the Trainable interface.
	 * A dog can play fetch.
	 */
	public String doATrick() {
		return("I do tricks. I play fetch");
	}
}

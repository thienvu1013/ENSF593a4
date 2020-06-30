/**
 * 
 * Cat is a subclass of Animal.
 * 
 * @author Thien Nguyen
 * @since June 7, 2020
 */
public class Cat extends Animal implements Trainable{

    /**
     * Cat() constructor sets its kind variable
     */
    public Cat() {
        kind = "cat";
    }

    /**
     * speak() implements the Animal speak() method. 
     *  When a cat speaks it says meow.
     */
    public String speak() {
        return "meow";
    }
    /**
     * eat() implements the Animal eat() method.
     * A cat eats mice.
     */
    public String eat() {
    	return "mice";
    }

	/**
	 * doATrick() is implemented from the Trainable interface.
	 * A cat can chase the lazer
	 */
	public String doATrick() {
		return("I do trick. I can chase the lazer");
	}
}
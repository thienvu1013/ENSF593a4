/**
 * Cow is a subclass of Animal.
 * 
 * @author Thien Nguyen
 * @since June 7 2020
 * 
 */
public class Cow extends Animal{

    /**
     * Cow() constructor sets its kind variable
     */
    public Cow() {
        kind = "cow";
    }

    /**
     * speak() implements the Animal speak() method. 
     *  When a cow speaks it says moo.
     */
    public String speak() {
        return "moo";
    }
    /**
     * eat() implements the Animal eat() method.
     * A cow eats grass.
     */
    public String eat() {
    	return "grass";
    }

}
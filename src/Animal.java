
/**
 *  Animal is an abstract class. It's speak()
 *  method is abstract and meant to be implemented in 
 *  Animal subclasses, such as Dog, Cat.
 *  
 *  @author Thien Nguyen
 *  @since June 7 2020 
 */
public abstract class Animal {
	
	protected String kind; // Cow, pig, cat, etc.

    /**
     * Animal() default constructor
     */
    public Animal()  {  }

    /**
     * toString() method overrides the Object toString() method.
     */
    public String toString() {
        return "I am a " + kind + " and I go " + speak()+ "\n"+ "I eat "+ eat();
    }

    /**
     * speak() returns an appropriate String representing
     *  the way a certain kind of animal speaks. It is 
     *  implemented in the Animal subclasses.
     */
    public abstract String speak();   // Abstract method
    
    /**
     * eat() return a string that describe what the animal eat.
     * It is implemented in the Animal subclasses.
     */
    public abstract String eat();

    /** 
     * main() creates instances of Animal subclasses and invokes
     *  their speak() methods, illustrating inheritance and 
     *  polymorphism.
     */   
	public static void main(String[] args) {
		//Declaring an animal object named cow as a Cow subclass
		Animal cow = new Cow();
		//Print out animal name
        System.out.println(cow.toString());
        //Redeclaring the animal variable to a Cat subclass.
        Animal cat = new Cat();
        //Testing the toString functions.
        System.out.println(cat.toString());
        
        
        //Testing the Dog subclass
        Animal dog = new Dog();
        //Testing the Dog's toString() method
        System.out.println(dog.toString());
        
        
        //Testing the Trainable interface on Cat subclass
        Trainable petCat = new Cat();
        System.out.println(petCat.doATrick());
        //Testing the Trainable interface on Dog subclass
        Trainable petDog = new Dog();
        System.out.println(petDog.doATrick());
        
        
        //Testing the Predator interface on Wolf subclass
        Predator wolfie = new Wolf();
        System.out.println("I prey on dogs: " + wolfie.preysOn(dog));
        

	}

}

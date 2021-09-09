class Animal { // Superclass (parent)
    
    public String name;
    public int age;
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
  
    public void greet(){
        System.out.println("Hello there!");
    }
}

class Cat extends Animal {
	
	public Cat(String name, int age){
		super(name, age);
	
	}
  
    public void animalSound(){
		super.animalSound();
		System.out.println("Meow Meow!!!");
        
	}
}


class Dog extends Animal { // Subclass (child)
  
	public Dog(String name, int age){
		super(name, age);
	
	}
    public void animalSound() {
        super.animalSound(); // Call the superclass method
        System.out.println("The dog says: bow wow");
    }
}

public class Main {
   public static void main(String[] args) {
      Animal myDog = new Dog("dogname", 12); // Create a Dog object
      myDog.animalSound(); // Call the method on the Dog object
      myDog.greet();
     
      Animal myCat = new Cat("catname", 2);
      myCat.animalSound();
      System.out.println(myDog.name);
     
      //WHEN INITIALIZE usng PARENT CLASS -> cannot use myCat.name or myDog.name if the parent class dont have available attributes, constructor and methods 
      //Because of inheritance features
      //ADD constructor in the PARENT CLASS and in BOTH SUBCLASS in order to make it work
      //Normally Cat myCat = new Cat("somename", 1) // will be able to call myCat.name and print out result.
   }
}
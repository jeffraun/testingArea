// Class: a blueprint for how a data structure should function
// Inheritance: allows one class to use functionality defined in another class
class Dog extends Animal {

  int age;

// Constructor: instructs the class to set up the initial state of an object
	public Dog(int dogsAge) {

  	age = dogsAge;

  }

// Method: set of instructions that can be called on an object
  public void bark() {

    System.out.println("Woof!");

	}

// Method: set of instructions that can be called on an object
// Parameter: values that can be specified when creating an object or calling a method
  public void run(int feet) {

    System.out.println("Your dog ran " + feet + " feet!");

	}

// Method: set of instructions that can be called on an object
// Return value: specifies the data type that a method will return after it runs
  public int getAge() {

    return age;

	}

	public static void main(String[] args) {

// Object: instance of a class that stores the state of a class
    Dog spike = new Dog(5);
    spike.bark();
    spike.run(40);
    int spikeAge = spike.getAge();
    System.out.println(spikeAge);
    spike.checkStatus();

	}

}

// Class: a blueprint for how a data structure should function
// Constructor: instructs the class to set up the initial state of an object
// Object: instance of a class that stores the state of a class
// Method: set of instructions that can be called on an object
// Parameter: values that can be specified when creating an object or calling a method
// Return value: specifies the data type that a method will return after it runs
// Inheritance: allows one class to use functionality defined in another class

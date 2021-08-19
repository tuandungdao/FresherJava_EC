package javacore;

class Animal {
	public void sound() {
		System.out.println("some sound");
	}
}

class Dog extends Animal {
	public void sound() {
		System.out.println("bow wow");
	}
	
	public void play() {
		System.out.println("The dog is phaying");
	}
}

class Cat extends Animal {
	public void sound() {
		System.out.println("meow meow");
	}
}

class Duck extends Animal {
	public void sound() {
		System.out.println("quack quack");
	}
}

public class Sound {
	public static void main(String[] args) {
		// Up-casting 
		Animal animal1 =  new Cat();
		animal1.sound();
		Animal animal2 =  new Dog();
		animal2.sound();
		
		Animal animal = new Dog();
		//Down-casting
		((Dog) animal).play();
		
		Animal[] animals = new Animal[4];
		animals[0] = new Animal();
		animals[1] = new Dog();
		animals[2] = new Cat();
		animals[3] = new Duck();
		for (int i = 0; i < 4; i++) {
			animals[i].sound();
		}
	}
}

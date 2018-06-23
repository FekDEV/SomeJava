package test1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Scanner;

//@SuppressWarnings("unused")
@SuppressWarnings("all")
public class Animal {

    private String name;
    private int weight;
    private boolean hasOwner=false;
    private byte age;
    private long uniqueID;
    private char favoriteChar;
    private double speed;
    private float height;
    
    private int j;
    
    //Getters and setters
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}


	public boolean isHasOwner() {
		return hasOwner;
	}

	public void setHasOwner(boolean hasOwner) {
		this.hasOwner = hasOwner;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public long getUniqueID() {
		return uniqueID;
	}
	
	

	public void setUniqueID(long uniqueID) {
		this.uniqueID = uniqueID;
	}
	
	public void setUniqueID() {
		long min=1;
		long max=1000;
		this.uniqueID=min+(long)((max-min)*Math.random())-1;
	}
	
	public char getFavoriteChar() {
		return favoriteChar;
	}

	public void setFavoriteChar(char favoriteChar) {
		this.favoriteChar = favoriteChar;
	}

	public double getSpeed() {
		return speed;
	}


	public void setSpeed(double speed) {
		this.speed = speed;
	}


	public float getHeight() {
		return height;
	}


	public void setHeight(float height) {
		this.height = height;
	}

	public static int getNumberOfAnimals() {
		return numberOfAnimals;
	}

	public static void setNumberOfAnimals(int numberOfAnimals) {
		Animal.numberOfAnimals = numberOfAnimals;
	}

	public static Scanner getUserInput() {
		return userInput;
	}

	public static void setUserInput(Scanner userInput) {
		Animal.userInput = userInput;
	}
	

	protected static int numberOfAnimals = 0 ;
    static Scanner userInput=new Scanner(System.in);

    public Animal() {
    	numberOfAnimals++;
    	
    	System.out.println("Enter the name :\n");
    	if(userInput.hasNextLine()) {
    		this.setName(userInput.nextLine());
    	}
    }
    
    public String makeSound() {
    	return "Grrr";
    }
    
    public static void speakAnimal(Animal randomAnimal) {
    	System.out.println("Animal says "+randomAnimal.makeSound());
    }

    
	
	
    
	 

}

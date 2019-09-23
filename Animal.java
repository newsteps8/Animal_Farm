public class Animal {
//Animal class is superclass of other class and some properities of animal objects are shown in this class.
//Büþra Gökmen_150116027
private String name;
private int age;
private int legNumber;
private int  pregnancyPerYear;
private int numberOfOffsprings;
public Animal(){

}
public Animal(String name,int age){
	this.name=name;
	this.age=age;
}
public void sayGreeting(){//What does the animal say?
	System.out.println("Have nothing to say!");
}
public void reproduce(){
	System.out.println("None of your business!!");
}


public void setLegnumber(int newlegNumber){//Set a new leg's number for each animal
	 legNumber = newlegNumber;
}
public void setPregnancyPerYear(int newpregnancyPerYear){//Set a new pregnancyperyear for each animal
	 this.pregnancyPerYear = newpregnancyPerYear;
}
public void setNumberOfOffsprings(int newnumberOfOffsprings){//Set a new number of offsprings for each animal
	 this.numberOfOffsprings=newnumberOfOffsprings;
}
public String getName(){//Get name of animal from superclass
	return this.name;
}
public int getAge(){//Get age of animal from superclass
	return this.age;
}
public int getLegnumber(){//Get leg's number of animal from superclass
	return legNumber;
}

public int getPregnancyPerYear(){//Get pregnancyPerYear from superclass for each animal
	return this.pregnancyPerYear;
}

public int getNumberOfOffsprings(){//Get numberOfOffsprings from superclass for each animal
	return this.numberOfOffsprings;
}
public String toString(){
return "My name is! " + this.getName() + "\n" + " I am " + this.getAge() + " years old! " +  "\n"  + " I have " + this.getLegnumber() + " legs!";
}


}

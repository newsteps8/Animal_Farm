public class Horse extends Mammal {
	//This class contains some information about horses and subclass of Mammal.
	//Büþra Gökmen_150116027
	private static int count = 0;
	public Horse(){
	
}
public Horse(String name,int age){
	super(name,age);
	setLegnumber(4);
	setPregnancyPerYear(1);
	setNumberOfOffsprings(1);
	count++;
}
public void sayGreeting(){//What does the Horse say?
	System.out.println("I will work harder!");
}
public static int getCount(){
	return count;
	}
public static void decrementCount(){//Decreasing of Horse's number
	count -= 1;}
}

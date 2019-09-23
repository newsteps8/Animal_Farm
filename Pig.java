public class Pig extends Mammal{
	//This class contains some information about pigs and subclass of Mammal.
		//Büþra Gökmen_150116027
public static int count=0;
public Pig(){

}
public Pig(String name,int age){
	super(name,age);
	setLegnumber(4);
	setPregnancyPerYear(12);
	setNumberOfOffsprings(2);
	count++;
}
public void sayGreeting(){//What does the Pig say?
	System.out.println("All animals are equal, but some animals are more equal than others!");
}
public static int getCount(){
	return count;}
public static void decrementCount(){//Decreasing of Pig's number
	count -= 1;}
}

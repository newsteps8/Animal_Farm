public class Chicken extends Bird{
	//This class contains some information about chickens and subclass of Bird.
	//Büþra Gökmen_150116027
private static int count = 0;
public Chicken(){

}
public Chicken(String name,int age){
	super(name,age);
	setLegnumber(2);
	setPregnancyPerYear(1);
	setNumberOfOffsprings(200);
	count++;
}
@Override
public void sayGreeting(){//What does the Chicken say?
	System.out.println("I have nothing to say other than I am against Pigs!");
}
public static int getCount(){
	return count;

}
public static void  decrementCount(){//Decreasing of Chicken's number
	count -= 1;
}
}

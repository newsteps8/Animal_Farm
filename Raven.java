public class Raven extends Bird{
	//This class contains some information about ravens and subclass of Bird.
		//Büþra Gökmen_150116027
	private static int count = 0;
   public Raven(){
	
}
public Raven(String name,int age){
	super(name,age);
	setLegnumber(2);
	setPregnancyPerYear(5);
	setNumberOfOffsprings(1);
	count++;
}
public void sayGreeting(){//What does the Raven say?
	System.out.println("A happy country where we poor animals shall rest forever!");
}
public static int getCount(){
	return count;}
public static void decrementCount(){//Decreasing of Raven's number
	count -= 1;}


}

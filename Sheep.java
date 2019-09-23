public class Sheep extends Mammal {
	//This class contains some information about sheeps and subclass of Mammal.
		//Büþra Gökmen_150116027
	private static int count = 0;
	public Sheep(){

	}
	public Sheep(String name,int age){
		super(name,age);
		setLegnumber(4);
		setPregnancyPerYear(1);
		setNumberOfOffsprings(1);
		count++;
	}
	public void sayGreeting(){//What does the Sheep say?
		System.out.println("Four legs good, two legs better!");
	}
	public static int getCount(){
		return count;}
	public static void decrementCount(){//Decreasing of Sheep's number
		count -= 1;}




















}

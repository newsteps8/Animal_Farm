public class Donkey extends Mammal{
	//This class contains some information about donkeys and subclass of Mammal.
	//Büþra Gökmen_150116027
private static int count = 0;
public Donkey(){
	
}
public Donkey(String name,int age){
	super(name,age);
	setLegnumber(4);
	setPregnancyPerYear(1);
	setNumberOfOffsprings(1);
	count++;
}
@Override
public void sayGreeting(){//What does the Donkey say?
	System.out.println("Life will go on as it has always gone –that is, badly!");
}
public static int getCount(){
	return count;
}
public static void decrementCount(){//Decreasing of Donkey's number
	count -= 1;
}

}

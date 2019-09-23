public class Mammal extends Animal {
	//This class contains some information about mammals and subclass of Animal.
	//Büþra Gökmen_150116027
public Mammal(){
	
}
public Mammal(String name,int age){
super(name,age);
}
public void walk(){//It's about functions of mammals
	System.out.println("I can walk to the far away lands!");
}
@Override
public void reproduce(){//It's about functions of mammals
	System.out.println("I give birth!");
}
public void herbivore(){//It's about functions of mammals
	System.out.println("I eat plants only!");
}



}

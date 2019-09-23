public class Bird extends Animal {
//This class contains some information about birds and subclass of Animal.
//Büþra Gökmen_150116027
public Bird(){

}
public Bird(String name,int age){
  super(name,age);
}
public void fly(){//It's about functions of birds
	System.out.println("I can fly to the endless skies!");
}
@Override
public void reproduce(){//It's about functions of birds
	System.out.println("I lay eggs!");
}
public void omnivore(){//It's about functions of birds
	System.out.println("I can eat everything!");
}
}

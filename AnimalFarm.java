import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//An AnimalFarm object represents an animal farm containing animals.
//Büþra Gökmen_150116027
public class AnimalFarm {
ArrayList <Animal> animalList = new ArrayList<Animal>();//it contains all animal in the farm
ArrayList <String> animalNames = new ArrayList<String>();//it contains all animal names in the farm
ArrayList<Integer> animalAges = new ArrayList<Integer>();
private final int CAPACITY;//capacity of the animalfarm
private static int numberOfAnimals = 0;//number of animals the farm has
protected  int newPopulation = 0;//this refer to next population
protected  int newPopulation2 = 0;
protected  int newPopulation3 = 0;
protected  int newPopulation4 = 0;
protected  int newPopulation5 = 0;
protected  int newPopulation6 = 0;

//containing animals


public AnimalFarm(int capacity){
     CAPACITY=capacity;
}
public static int getNumberOfAnimal(){//achieve the number of animals
 	return numberOfAnimals;
}
public boolean addAnimal(Animal animal)  {//This method add animal to AnimalList by it's type
	if(numberOfAnimals<CAPACITY){
	if(animal instanceof Chicken){
		for(int i=0; i<1; i++){
	    animalList.add(animal);
	    numberOfAnimals++;
	}
	}
		else if (animal instanceof Donkey){
	      for(int i=0; i<1; i++){
		 animalList.add(animal);
		 numberOfAnimals++;
	}
		}
	else if (animal instanceof Horse){
		     for(int i=0; i<1; i++){
			 animalList.add(animal);
			 numberOfAnimals++;
	}
	}
		else if (animal instanceof Pig){
			for(int i=0; i<1; i++){
				 animalList.add(animal);
				 numberOfAnimals++;

		}
		}
		else if (animal instanceof Raven){
			for(int i=0; i<1; i++){
				 animalList.add(animal);
				 numberOfAnimals++;
		}
		}
		else if (animal instanceof Sheep){
			for(int i=0; i<1; i++){
				 animalList.add(animal);
				 numberOfAnimals++;
		}
		}



	}


		return false;
}




public boolean removeAnimal(String name){//This method remove from ArrayList and decrements count of animal by it's type
	for(int i=0; i<numberOfAnimals; i++){
	if(animalList.get(i).getName().equals(name)){
    animalList.remove(i);
	if(animalList.get(i) instanceof Chicken)
	Chicken.decrementCount();
	else if(animalList.get(i) instanceof Donkey)
	Donkey.decrementCount();
	else if(animalList.get(i) instanceof Horse)
	Horse.decrementCount();
	else if(animalList.get(i) instanceof Raven)
	Raven.decrementCount();
	else if(animalList.get(i) instanceof Pig)
	Pig.decrementCount();
	else if(animalList.get(i) instanceof Sheep)
	Sheep.decrementCount();
	}

	}

	return false;


}
public void printAllAnimalGreetings(){
	for(int i =0; i<animalList.size(); i++)
	((Animal)animalList.get(i)).sayGreeting();
}
public void printOneAnimalGreeting(Animal animal){
       animal.sayGreeting();
	}

public void printAllAnimalNames(){//This method writes all animal's name
	for(int i =0; i<animalList.size(); i++)
     printOneAnimalName(animalList.get(i));
}
public void printOneAnimalName(Animal animal){//This method writes one animal's name
	for(int i =0; i<numberOfAnimals; i++)
	System.out.println("animal's name: " + animalList.get(i).getName());//This method writes one animal's name
}
public void printAllAnimals(){//This method writes for all animal
	for(int i =0; i<animalNames.size(); i++)
		animalNames.get(i).toString();
}
public int nextYearPopulationForecast(){//this method calculates next year population
	for(int i =0; i<animalList.size(); i++){
	if (animalList.get(i) instanceof Chicken){
	 newPopulation +=  ((animalList.get(i).getNumberOfOffsprings()) * (animalList.get(i).getPregnancyPerYear())) ;
	}
	else if(animalList.get(i) instanceof Donkey){
		 newPopulation2 +=  ((animalList.get(i).getNumberOfOffsprings()) * (animalList.get(i).getPregnancyPerYear())) ;
		  }
	else if(animalList.get(i) instanceof Horse){
	     newPopulation3 += ((animalList.get(i).getNumberOfOffsprings()) * (animalList.get(i).getPregnancyPerYear())) ;
	     }
	else if(animalList.get(i) instanceof Raven){
		 newPopulation4 +=  ((animalList.get(i).getNumberOfOffsprings()) * (animalList.get(i).getPregnancyPerYear())) ;
		 }
	else if(animalList.get(i) instanceof Pig){
		 newPopulation5 +=  ((animalList.get(i).getNumberOfOffsprings()) * (animalList.get(i).getPregnancyPerYear())) ;
		 }
	else if(animalList.get(i) instanceof Sheep){
		 newPopulation6 +=  ((animalList.get(i).getNumberOfOffsprings()) * (animalList.get(i).getPregnancyPerYear())) ;
		}
	}
       return newPopulation + newPopulation2 + newPopulation3 +newPopulation4 +newPopulation5 +newPopulation6 + numberOfAnimals;//This is all of population
}
public void animalMovements(){//What does the animal move?
	for(int i =0; i< animalList.size(); i++){
		if(animalList.get(i) instanceof Mammal){
		((Mammal)animalList.get(i)).walk();
		System.out.print("My name is " + animalList.get(i).getName() + " and " );
		((Mammal)animalList.get(i)).walk();
		}
		else if(animalList.get(i) instanceof Bird)
			((Bird)animalList.get(i)).fly();
		System.out.print("My name is " + animalList.get(i).getName() + " and " );
		((Bird)animalList.get(i)).fly();
	}
}
public void eatingHabits(){//What does the animal eat?
	for(int i =0; i<animalList.size(); i++){
		if(animalList.get(i) instanceof Mammal){
			((Mammal) animalList.get(i)).herbivore();
			System.out.println("My name is " + animalList.get(i).getName() + " and " );
			((Mammal) animalList.get(i)).herbivore();
		}
			else if(animalList.get(i) instanceof Bird){
			((Bird) animalList.get(i)).omnivore();
			System.out.println("My name is " + animalList.get(i).getName() + " and " );
			((Bird) animalList.get(i)).omnivore();
		}

	}
}
public void sortAlphabetically(){//sort by name
	 for(int i=0; i<animalList.size(); i++){
	animalNames.add(animalList.get(i).getName());
	 }
Collections.sort(animalNames);
System.out.println(animalNames);

}
public void sortBasedLegNumber(){//sort by legnumber

}

public void sortBasedOnAge(){//sort by age
	for(int i=0; i<animalList.size(); i++){
    animalAges.add(animalList.get(i).getAge());
	  }


	 Collections.sort(animalAges);
	 System.out.println(animalAges);

}
public void sortBasedAdditionOnDate(){//sort by date
	 printAllAnimals();

}


public void searchBasedOnName(String name){//Search an animal by it's name in the animalfarm
	for(int i=0; i<numberOfAnimals; i++){
	if(animalList.get(i).getName().equals(name)){
      System.out.println(animalList.get(i).toString());
	  }




		}

}
public void searchBasedOnAge(int age){//Search an animal by it's age in the animalfarm
	for(int i =0; i<numberOfAnimals; i++){
		if(animalList.get(i).getAge() == age){
		System.out.println(animalList.get(i).toString());
		}
}
}

public void printReport(String filename) throws FileNotFoundException {//This method write a file about information of animal lives in animalfarm.
PrintWriter file = new PrintWriter(filename);//print to file
file.println("We have total of " + animalList.size() + "animals in the farm.");
for(int i=0; i<numberOfAnimals; i++){
if(animalList.get(i) instanceof Chicken){
		file.println("        *" + Chicken.getCount() + " of them are Chicken.Those are: ");
		file.printf("                 ", "Name","Age"," Leg Number");
		file.printf("                 ", animalList.get(i).getName(), animalList.get(i).getAge(),animalList.get(i).getLegnumber() );
	}

else if(animalList.get(i) instanceof Donkey){
	file.println("        *" + Donkey.getCount() + " of them are Chicken.Those are: ");
	file.printf("                 ", "Name","Age"," Leg Number");
	file.printf("                 ", animalList.get(i).getName(), animalList.get(i).getAge(),animalList.get(i).getLegnumber() );
}
else if(animalList.get(i) instanceof Horse){
	file.println("        *" + Horse.getCount() + " of them are Chicken.Those are: ");
	file.printf("                 ", "Name" , "Age" , " Leg Number");
	file.printf("                 ", animalList.get(i).getName(), animalList.get(i).getAge(),animalList.get(i).getLegnumber() );
}
else if(animalList.get(i) instanceof Pig){
	file.println("        *" + Pig.getCount() + " of them are Chicken.Those are: ");
	file.printf("                 ", "Name","Age"," Leg Number");
	file.printf("                 ", animalList.get(i).getName(), animalList.get(i).getAge(),animalList.get(i).getLegnumber() );
}
else if(animalList.get(i) instanceof Raven){
	file.println("        *" + Raven.getCount() + " of them are Chicken.Those are: ");
	file.printf("                 ", "Name","Age"," Leg Number");
	file.printf("                 ", animalList.get(i).getName(), animalList.get(i).getAge(),animalList.get(i).getLegnumber() );
}

else if(animalList.get(i) instanceof Sheep){
	file.println("        *" + Sheep.getCount() + " of them are Chicken.Those are: ");
	file.printf("                 ", "Name","Age"," Leg Number");
	file.printf("                 ", animalList.get(i).getName(), animalList.get(i).getAge(),animalList.get(i).getLegnumber() );
}
}
     file.close();//final of file
}

}


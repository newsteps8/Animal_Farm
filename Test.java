//this class test all of classes and Animalfarm methods
//Büþra Gökmen_150116027
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		System.out.println("enter a capacity: ");
		int CAPACITY = input.nextInt();
		AnimalFarm animalfarm = new AnimalFarm(CAPACITY);
		// kapasiteye göre animal farm objesi oluþtur
		//do-while ile döngüye alabilirsin
		while(CAPACITY > AnimalFarm.getNumberOfAnimal()){
		System.out.println(
				"0-Exit the program\n1-Add animal\n2-Remove animal\n3-Search animal\n4-Sort animals\n5-Calculate next year's population estimate\n6-Print all animal's movements\n7-Print all animal's eating habits\n8-Print report\n");
		System.out.println("Please enter your choice: ");
		int Input = input.nextInt();
         if(Input==0)
         System.exit(0);
         else if(Input==1){
        System.out.println("1-Chicken\n2-Donkey\n3-Horse\n4-Pig\n5-Raven\n6-Sheep");
        System.out.println("Select animal type: ");
        int animaltype = input.nextInt();
         if(animaltype==1){


         System.out.println("isim: ");
         String name=input.next();
           System.out.println("yaþ: ");
           int yas= input.nextInt();
          Animal chicken= new Chicken(name,yas);
          animalfarm.addAnimal(chicken);
        }

         else if(animaltype==2){



          System.out.println("isim: ");
          String name=input.next();
            System.out.println("yaþ: ");
            int yas= input.nextInt();

            Animal donkey= new Donkey(name,yas);
            animalfarm.addAnimal(donkey);

		}

         else if(animaltype==3){
        	 System.out.println("isim: ");
             String name=input.next();
             System.out.println("yaþ:");
             int yas=input.nextInt();

           Animal horse= new Horse(name,yas);
           animalfarm.addAnimal(horse);

         }
         else if(animaltype==4){
        	 System.out.println("isim: ");
             String name=input.next();
               System.out.println("yaþ: ");
               int yas= input.nextInt();
            Animal pig= new Pig(name,yas);
            animalfarm.addAnimal(pig);


         }
         else  if(animaltype==5){
        	 System.out.println("isim: ");
             String name=input.next();
               System.out.println("yaþ: ");
               int yas= input.nextInt();
           Animal raven= new Raven(name,yas);
           animalfarm.addAnimal(raven);


         }

         else if(animaltype==6){
       System.out.println("isim: ");
       String name=input.next();
         System.out.println("yaþ: ");
         int yas= input.nextInt();
        Animal sheep= new Sheep(name,yas);
        animalfarm.addAnimal(sheep);

         }
      }


         else if(Input==2){
        	 System.out.println("enter name of the animal please: ");
        	String name = input.next();
            animalfarm.removeAnimal(name);
         }

         else if(Input==3){
        	 System.out.println("1-Search based on name\n" + "2-Search based on age");
        	 System.out.println("enter your choice: ");
        	 int choice = input.nextInt();
        	 if(choice ==1){
        	System.out.println("enter name: ");
        	 String name = input.next();
        	 animalfarm.searchBasedOnName(name);
        	 }
        	 else if(choice==2){
        	 System.out.println("enter age: ");
        	 int yas = input.nextInt();
        	 animalfarm.searchBasedOnAge(yas);
        	 }
         }
          else if(Input==4){
        	 System.out.println("1-Sort based on name\n" + "2-Sort based on legnumber\n" + "3-Sort based on age\n" + "4-Sort based on addition date");
        	 System.out.println("enter your choice: ");
        	 int choice = input.nextInt();
        	 if(choice==1)
        	 animalfarm.sortAlphabetically();
        	 else if(choice ==2)
        	animalfarm.sortBasedLegNumber();
        	 else if (choice==3)
            animalfarm.sortBasedOnAge();
        	 else if (choice == 4)
             animalfarm.sortBasedOnDate();
          }
          else if(Input==5){
        System.out.println(animalfarm.nextYearPopulationForecast());
          }
          else if(Input==6){
        animalfarm.animalMovements();
          }
          else if(Input==7){
          animalfarm.eatingHabits();
          }
          else if(Input==8){
           System.out.println("Enter filename: ");
           String filename = input.next();
           try {
			animalfarm.printReport(filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
}
	}
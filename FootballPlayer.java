import java.util.Scanner;
public class FootballPlayer {
  public static void main(String[] args) {

    // Task 1
    String name;
    int age, jerseyNumber;
    double height, weight;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter player's details");
    System.out.print("Name: ");
    name = scanner.nextLine();
    System.out.print("Age: ");
    age = scanner.nextInt();
    System.out.print("Height (in meters): ");
    height = scanner.nextDouble();
    System.out.print("Weight (in pounds): ");
    weight = scanner.nextDouble();
    System.out.print("Jersey Number: ");
    jerseyNumber = scanner.nextInt();
    System.out.println("Player's Details:");
    System.out.println("Name - " + name);
    System.out.println("Age - " + age);
    System.out.println("Height - " + height + "m");
    System.out.println("Weight - " + weight + "lbs");
    System.out.println("Jersey Number - " + jerseyNumber);

    // Task 2
    double pound = 0.45359237;
    int meters = 100;
    double weightInKilograms = weight * pound;
    double heightInCentimeters = height * meters;

    int KgsInt = (int) weightInKilograms;

    System.out.println("Player's details: ");
    System.out.println("Name - " + name);
    System.out.println("Age - " + age);
    System.out.println("Height - " + heightInCentimeters + "cm");
    System.out.println("Weight - " + KgsInt + "kgs");
    System.out.println("Jersey Number - " + jerseyNumber);

    // Task 3

    System.out.println(name + "'s age: " + age);
    age++;
    jerseyNumber--;
    System.out.println("New age and jersey number updates: ");
    System.out.println("Age - " + age);
    System.out.println("Jersey Number - " + jerseyNumber);

    // Task 4

    if(age >=18 && age <= 35 && weightInKilograms < 90) {
      System.out.println("Eligible");
    }else{
      System.out.println("Not Eligible");
    }
    
    if(age < 8 || weightInKilograms >= 90){
      System.out.println("Player has a problem (either too young or too heavy)");
    }
    
    if(!(age >=18 && age <= 35 && weightInKilograms < 90)){
      System.out.println("Not Eligible");
    }

    // task 5
    String category;
    if(age < 20){
      category = "Rising Star";
    }else if(age >= 20 && age <=30){
      category = "Prime Player";
    }else{
      category = "Veteran";
    }
    System.out.println("Player " + name + "'s category: " + category);

    // task 6
    System.out.print("Coach please enter the player's jersey number: ");
    int jerseyNumberFromCoach  = scanner.nextInt();
    String position;
    switch(jerseyNumberFromCoach){
      case 1:
        position = "Goalkeeper";
        break;
      case 2:
        position = "Defender";
        break;
      case 6:
        position = "Midfielder";
        break;
      case 7:
        position = "Winger";
        break;
      case 8:
        position = "Midfielder";
        break;
      case 9:
        position = "Striker";
        break;
      case 10:
        position = "Playmaker";
        break;
      case 11:
        position = "Winger";
        break;
      default:
        position = "Player position not known";
        break;
    }
    System.out.println(position);

    // task 7 Part B
    switch(jerseyNumberFromCoach){
      case 1:
        System.out.println("GoalKeeper");
        break;
      case 2:
        System.out.println("Defender");
      case 6:
        System.out.println("Midfielder");
      case 7:
        System.out.println("Winger");
        break;
      case 9:
        System.out.println("Striker");
        break;
      default:
        System.out.println("Player position not known");
        break;
    }

    // task 7 Part B
    switch (jerseyNumberFromCoach) {
      case 2:
        System.out.println("Defender");
        break;
      case 6:
      case 8:
        System.out.println("Midfielder");
        break;
      case 7:
      case 11:
        System.out.println("Winger");
        break;
      case 9:
        System.out.println("Striker");
        break;
      case 1:
        System.out.println("Goalkeeper");
        break;
      case 10:
        System.out.println("Playmaker");
        break;
      default:
        System.out.println("Player position not known");
        break;
    }

    // Task 8
    if (category == "Prime Player") {
      if (weightInKilograms < 80) {
        System.out.println("Player " + name + " is selected for the starting lineup.");
      }else {
        System.out.println("Player " + name + " is on the bench.");
      }
    } else {
      System.out.println("Player " + name + " is on the bench.");
    }

    // Task 9
    String eligibility = (age >=18 && age <= 35 && weightInKilograms < 90) ? "Eligible" : "Not Eligible";
    System.out.println(eligibility);
  }
}
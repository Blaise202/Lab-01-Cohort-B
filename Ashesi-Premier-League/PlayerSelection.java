// task 10
import java.util.Scanner;
public class PlayerSelection {
  public static void main(String[] args) {
    String name, position, eligibility, attackerStatus, lineupDecision, finalDecision;
    int age, jerseyNumber, jerseyNumberFromCoach;
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
    System.out.print("Coach please enter the player's jersey number: ");
    jerseyNumberFromCoach = scanner.nextInt();


    double pound = 0.45359237;
    int meters = 100;
    double weightInKilograms = weight * pound;
    double heightInCentimeters = height * meters;
    int KgsInt = (int) weightInKilograms;

    String category;
    if(age < 20){
      category = "Rising Star";
    }else if(age >= 20 && age <=30){
      category = "Prime Player";
    }else{
      category = "Veteran";
    }

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

    if(age >=18 && age <= 35 && weightInKilograms < 90) {
      eligibility = "Eligible";
    }else{
      eligibility = "Not Eligible";
    }

    if (position=="Striker" || position=="Winger" || position=="Playmaker") {
      attackerStatus = "Yes";
    } else {
      attackerStatus = "No";
    }

    if (category == "Prime Player" && weightInKilograms < 80) {
      lineupDecision = "Starting Lineup";
    } else {
      lineupDecision = "Bench";
    }

    if (eligibility == "Eligible" && lineupDecision == "Starting Lineup") {
      finalDecision = "Play";
    } else {
      finalDecision = "Rest";
    }


    System.out.println("Player Report:");
    System.out.println("\tPlayer: " + name);
    System.out.println("\tAge: " + age + "[" + category + "]");
    System.out.println("\tHeight: " + heightInCentimeters + "cm");
    System.out.println("\tWeight: " + KgsInt + "kg");
    System.out.println("\tJersey: " + jerseyNumber);
    System.out.println("\tPosition: " + position);
    System.out.println("\tAttacker Jersey: " + attackerStatus);
    System.out.println("\tEligibility: " + eligibility);
    System.out.println("\tLineup Decision: " + lineupDecision);
    System.out.println("\tFinal Decision: " + finalDecision);
  }
}
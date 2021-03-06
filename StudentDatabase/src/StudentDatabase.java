import java.util.Scanner;

public class StudentDatabase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean flag = true;
		String userContinue;
		int studentNumber;
		
		String[] fName = {"Roger", "Jerry", "Norma", "Jimmy", "Grace"};
		String[] lName = {"Waters", "Garcia", "Jean", "Page", "Slick"};
		String[] zodiac = {"Virgo", "Leo", "Gemini", "Capricorn", "Scorpio"};
		String[] hometown = {"Great Bookham", "San Francisco", "Los Angeles", "Heston", "Highland Park"};
		
		System.out.print("Welcome to our Java class. ");
		while (flag) {
			System.out.print("Which student would you like to learn more about? (enter a number 1-5): ");
			studentNumber = input.nextInt();

			while (studentNumber < 1 || studentNumber > 5) {
				try {
					System.out.printf("Student %d is %s %s", studentNumber, fName[studentNumber - 1], lName[studentNumber - 1]);
				} catch (IndexOutOfBoundsException ex) {
					System.out.println("That student does not exist.  Please try again. (enter a number 1-5): ");
					studentNumber = input.nextInt();
				}
			}
			
			System.out.printf("Student %d is %s %s. What would you like to know about %s? (enter \"zodiac\" or \"hometown\"): ", studentNumber, fName[studentNumber - 1], lName[studentNumber - 1], fName[studentNumber - 1]);
			String userInput = input.next();
			
			while (!userInput.equalsIgnoreCase("zodiac") && !userInput.equalsIgnoreCase("hometown")) {
				System.out.print("That data does not exist.  Please try again. (enter or \"zodiac\" or \"hometown\"): ");
				userInput = input.next();
			}
			if (userInput.equalsIgnoreCase("zodiac")) {
				System.out.printf("%s is a %s. Would you like to know more? (enter \"yes\" or \"no\") ", fName[studentNumber - 1], zodiac[studentNumber - 1]);
				userContinue = input.next();
			} else {
				System.out.printf("%s is from %s. Would you like to know more? (enter \"yes\" or \"no\") ", fName[studentNumber - 1], hometown[studentNumber - 1]);
				userContinue = input.next();
			}
			
			while (!userContinue.equalsIgnoreCase("yes") && !userContinue.equalsIgnoreCase("no")) {
				System.out.print("That is not a valid option.  Would you like to know more? (enter \"yes\" or \"no\") ");
				userContinue = input.next();
			}
			
			if (userContinue.equalsIgnoreCase("yes")) {
				
			} else {
				flag = false;
				System.out.println("Thanks!");
			}
		}
	}

}

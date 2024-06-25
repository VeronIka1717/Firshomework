package lv.acodemy;

public class Firsthomework {
    public static void main(String[] args) {


        //Easy peasy: Write a Java program that checks if a given number is positive. If it is, print "Positive number."
        int i = 1;
        if (i > 0) {
            System.out.println("Positive number.");
        } else {
            System.out.println("Not a positive number.");
        }

        //Odd or even: Create a Java program that determines if a given integer is even. If it is, print "Even number."
        int j = 6;
        if (j % 2 == 0) {
            System.out.println("Even number");
        }

        //Age group classifier: Write a Java program that classifies a person into different age groups based on their age. If the age is less than 18, print "Teenager," otherwise print "Adult."
        int age = 26;
        if (age <= 18) {
            System.out.println("Teenager");
        } else {
            System.out.println("Adult");
        }
        //Leap year checker: Create a Java program that checks if a given year is a leap year. If it is, print "Leap year."
        int year = 2000;
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                System.out.println("Leap year");
            }
        }


        //Multiple conditions: Write a Java program that checks if a given number is positive, even, and less than 100. If all conditions are true, print "Valid number."
        int k = 24;
        if (k > 0 && k % 2 == 0 && k < 100) {
            System.out.println("Valid number");
        }


        //Nested conditions: Create a Java program that checks if a number is positive, and if so, check if it's even. If both conditions are true, print "Positive and Even."
        int l = 988;
        if (l > 0) {
            if (l % 2 == 0) {
                System.out.println("Positive and even");
            } else {
                System.out.println("Invalid number");
            }
        }
        //Character type identifier: Write a Java program that determines if a given character is a vowel. If it is, print "Vowel." (Use variable with data type: char. When checking character use == and ||)
        char vowel = 'b';
        if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u' ||
                vowel == 'A' || vowel == 'E' || vowel == 'I' || vowel == 'O' || vowel == 'U') {
            System.out.println("Vowel");
        }

        //BMI calculator: Create a Java program that calculates BMI (Body Mass Index) and categorizes it into different ranges. Print the category based on the BMI. Formula: bmi = weight / (height * height);
        double heightM = 1.76;
        double weightKg = 57;
        double bmi = weightKg / (heightM * heightM);
        if (bmi <= 18.5) {
            System.out.println("Your BMI is: " + bmi + " and you are UNDERWEIGHT");
        } else if (bmi > 18 && bmi < 25) {
            System.out.println("Your BMI is: " + bmi + " and you are IN HEALTHY RANGE");
        } else if (bmi >= 25) {
            System.out.println("Your BMI is: " + bmi + " and you are OVERWEIGHT");
        }

    /*
    Write a Java program that calculates the final grade for a student based on their scores in three subjects: Math, Science, and English. The program should take input scores for each subject and calculate the average. Assign a final grade based on the following criteria:
    If the average score is 90 or above, assign a grade of "A."
    If the average score is between 80 and 89, assign a grade of "B."
    If the average score is between 70 and 79, assign a grade of "C."
    If the average score is between 60 and 69, assign a grade of "D."
    If the average score is below 60, assign a grade of "F."
     */

        int math = 90;
        int science = 100;
        int english = 90;
        double average = (math + science + english) / 3.0;
        if (average >= 90) {
            System.out.println("You got A");
        } else if (average < 90 & average > 80) {
            System.out.println("You got B");
        } else if (average < 79 & average > 70) {
            System.out.println("You got C");
        } else if (average < 69 & average > 60) {
            System.out.println("You got D");
        } else if (average < 60) {
            System.out.println("You got F");
        } else {
            System.out.println("N/A");
        }
        //File extension checker: Write a Java program that takes a filename as input and checks if it has a valid file extension. Assume valid extensions are ".txt", ".doc", and ".pdf". If the file has a valid extension, print "Valid file extension," otherwise print "Invalid file extension."

        String doc = "homework.doc";
        boolean s = doc.endsWith(".txt") || doc.endsWith(".doc") || doc.endsWith(".pdf");
        if (s) {
            System.out.println("Valid file extension");
        } else {
            System.out.println("Invalid file extension");
        }

    }
}


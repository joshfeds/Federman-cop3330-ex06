package oop.Exercise06;
import java.time.LocalDate;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Federman
 */
public class Exercise06
{
    static Scanner input = new Scanner(System.in);
    static LocalDate year = LocalDate.now();

    public static String currAge() {
        System.out.print("What is your current age? ");
        return input.nextLine();
    }
    public static String ageRetire() {
        System.out.print("At what age would you like to retire? ");
        return input.nextLine();
    }
    public static void yearsLeft(int age, int retireAge) {
        int yearsLeft = retireAge - age;

        if(yearsLeft <= 0){
            System.out.print("You can already retire!");
            return;
        }

        System.out.printf("You have %d years left until you can retire.\n", yearsLeft);
        int currYear = year.getYear();
        int retYear = currYear + yearsLeft;

        System.out.printf("It's %d, so you can retire in %d", currYear, retYear);
    }
    public static void main( String[] args ) {

        int age = Integer.parseInt(currAge());
        int retireAge = Integer.parseInt(ageRetire());

        yearsLeft(age, retireAge);
    }
}

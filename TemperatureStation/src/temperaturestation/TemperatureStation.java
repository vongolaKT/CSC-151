/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperaturestation;

import java.util.Scanner;

/**
 * 03/02/2021
 * CSC - 151 - 0b02
 * Kevin Griffin
 */
public class TemperatureStation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String keepGoing = "y";
        
        while (keepGoing.equals("y")){
            //call the function continuously until the user exits
            TakeTemperature();
            
            // Asking for input to continue
            System.out.print("To contine enter \"y\">> ");
            
            // made case insensitive
            keepGoing = scnr.next().toLowerCase();
            // Could add another if stateent here to make sure they want to exit
            //if they do not enter "y"
            
        }
    }
    public static void TakeTemperature(){
        //scnr for input
        Scanner scnr = new Scanner(System.in);
        
        // variables
        double temp;
        
        System.out.print("Please Enter the persons temperature: ");
        temp = scnr.nextDouble();
        
        if (temp >= 100.4) {
            System.out.println("Have the person sit in the designated area.");
            System.out.println("Immediately call Public Safety at (910)678-8433"
                    + " so they can dispatch an officer to the area.");
            System.out.println("Wait 3-5 minutes and retake temperature.");
            System.out.println("");
            System.out.println("Please re-enter the temperature: ");
            temp = scnr.nextDouble();
            
            if(temp >= 100.4){
                System.out.println("Tell the person they will need to leave "
                        + "campus for everyone’s safety.  Instruct them to "
                        + "monitor their temperature and their health for "
                        + "symptoms of COVID-19.");
                System.out.println("Give the individual a copy of the FTCC’s "
                        + "COVID-19 Campus Exposure Procedures document. ");
                System.out.println("Instruct the person wait for the Public "
                        + "Safety officer.  The officer will collect the "
                        + "necessary information and escort them off campus.");
                System.out.println("If the person does not have a ride, the "
                        + "Public Safety Officer will escort them to an "
                        + "isolation room to wait.");
                
                System.out.println("Please enter if this person is a student or"
                        + " Faculty/Staff");
                
                StudentOrStaff();
               
                
            }
            else {
                System.out.println("Slide an armband across the table to them."
                        + "  (See armband color schedule).");
                System.out.println("Instruct the person to wear the armband at "
                        + "all times on campus.");
            }
        }
        else {
            System.out.println("Slide an armband across the table to them."
                    + "  (See armband color schedule).");
            System.out.println("Instruct the person to wear the armband at all "
                    + "times on campus.");
            
        }
    }
    public static void StudentOrStaff(){
        Scanner scnr = new Scanner(System.in);
        String userInput;
        // make case insensitive input
        switch(userInput = scnr.nextLine().toLowerCase()){
            case "student":
                System.out.println("Remind them to contact their instructors "
                        + "to notify of them of non-attendance and to "
                        + "arrange to make-up course assignments.");
                        break;
            case "faculty":
            case "staff":
                System.out.println("They should contact their immediate "
                    + "supervisor and the College’s COVID Coordinator,"
                    + " Carl Mitchell (mitchelc@faytechcc.edu).");
                        break;
            default:
                System.out.println("You did not enter \"Student\", "
                    + "\"Faculty\" or \"Staff\".");
                System.out.println("Please Try Again!");
                
                // Call until desired input is entered
                StudentOrStaff();
        }
    }
}

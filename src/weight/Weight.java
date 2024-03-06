/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package weight;

import java.util.Scanner;

/**
 *
 * @author jayia
 */
public class Weight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        /*constants*/
        double footInInches=12;
        double baseWeight=110;

        /* input*/
        double heightInInches;
        heightInInches=getheight(footInInches);

        /*Calculation */
        double addInches;
        addInches=calculateAddInches(heightInInches);

        double idealWeight;
        idealWeight=calculateIdealWeight(addInches, baseWeight);

        /*Output */
        printIdealWeight(heightInInches, idealWeight);

    }

    public static double getheight(double footInInches1){
        double feet;
        double inches;
        double height;

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the person's height in feet and Inches (eg. 5 8 for five foot 8)");
        feet=s.nextDouble();
        inches=s.nextDouble();

        height=feet*footInInches1 + inches;

        s.close(); 

        return height;
    }
    
    public static double calculateAddInches(double heightInInches1){
        double additionalInches;

        additionalInches=heightInInches1-60;

        return additionalInches;
    }

    public static double calculateIdealWeight(double addInches1, double baseWeight1){
        double ideal;
        double addWeight;

        addWeight=addInches1*5;

        ideal=baseWeight1+addWeight;

        return ideal;
    }

    public static void printIdealWeight(double heightInInches2, double idealWeight){
        System.out.println("Height in Inches: " + heightInInches2);
        System.out.println("Calculated ideal body weight in pounds: " + idealWeight);
    }
}

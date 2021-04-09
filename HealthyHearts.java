
package HealthyHearts;

/**
 *
 * @author elishasewell
 */

import java.util.Scanner;

public class HealthyHearts {
        public static void main(String[] args){
            
            int maxHeartRate;
            double lowerTargetHeartRate;
            double upperTargetHeartRate;
            
            Scanner inputReader = new Scanner(System.in);
            
            System.out.println("How old are you?");
            int age;
            age = Integer.parseInt(inputReader.nextLine());
            
            maxHeartRate = 220 - age;
            lowerTargetHeartRate = maxHeartRate * .5;
            upperTargetHeartRate = maxHeartRate * .85;
            
            
            System.out.println("The max heart rate for someone your age is: " + maxHeartRate + " beats per minute.");
            System.out.println("The target heart rate for someone your age is between " + lowerTargetHeartRate + " and " + upperTargetHeartRate + " beats per minute.");
        }
}


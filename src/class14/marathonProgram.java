package class14;

import java.util.Scanner;

public class marathonProgram {
    public static void main(String[]args){
        Scanner rr = new Scanner(System.in);
        System.out.println("Enter your health status (good/bad):");
        String healthStatus = rr.nextLine();
        if (healthStatus.equals("good")) {
            System.out.println("Enter your fitness level (high/medium/low):");
            String fitnessLevel = rr.nextLine();
            if (fitnessLevel.equals("high")) {
                System.out.println("We recommend you to prepare for a full marathon");
            } else if (fitnessLevel.equals("medium")) {
                System.out.println("We recommend you to prepare for a half marathon");
            } else if (fitnessLevel.equals("low")) {
                System.out.println("We recommend you to prepare for a 5k run");
            }else {
                System.out.println("Wrong entry for fitness level");
            }
        }
        else if(healthStatus.equals("bad")){
            System.out.println("We recommend you to participate in the marathon by walking and running as much as you can");
        }else{
            System.out.println("Wrong entry for health status");
        }
    }
}


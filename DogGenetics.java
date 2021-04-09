/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dogdna;

import java.util.Scanner;
import java.util.Random;

public class DogGenetics {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("What's your dog's name?");
        String dogName = myScanner.nextLine();
        
        Random rand = new Random();
        
        int Greyhound = rand.nextInt(1000);
        int Pomski = rand.nextInt(1000);
        int Bulldog = rand.nextInt(1000);
        int Husky = rand.nextInt(1000);
        int Dobermann = rand.nextInt(1000);
        int total = (Greyhound + Pomski + Bulldog + Husky + Dobermann);
        
        System.out.println(dogName + " is:");
        System.out.printf("%.2f%% Greyhound\n",((Greyhound*1.0/total)*100));
        System.out.printf("%.2f%% Pomski\n",((Pomski*1.0/total)*100));
        System.out.printf("%.2f%% Bulldog\n",((Bulldog*1.0/total)*100));
        System.out.printf("%.2f%% Husky\n",((Husky*1.0/total)*100));
        System.out.printf("%.2f%% Dobermann\n",((Dobermann*1.0/total)*100));
    }
    
}

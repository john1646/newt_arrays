package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner objentrada = new Scanner(System.in);
        int [] numeros=new int[4];

        for(int i=0; i < numeros.length; i++){
            System.out.println("Digita el dato: "+ i);
            numeros[i] = objentrada.nextInt();
        }

        System.out.println("########################################################");

        for(int i=0; i < numeros.length; i++){
            System.out.println("dato "+ numeros [i]);

        }

    }
}

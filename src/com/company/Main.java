package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner objentrada = new Scanner(System.in);
        Persona [] personas=new Persona[4];

        for(int i=0; i < personas.length; i++){

            personas[i] = new Persona();

            System.out.println("Digita el nombre de la persona: "+ i);
            personas[i].setNombre(objentrada.next());
        }

        System.out.println("########################################################");

        for(int i=0; i < personas.length; i++){

            System.out.println(personas[i].getNombre());


        }

    }
}

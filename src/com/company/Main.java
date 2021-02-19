package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int num1=0,num2=0, resultado=0;
        Scanner objeto= new Scanner(System.in);

            System.out.println("Introduzca el primer numero");
            num1=objeto.nextInt();
            System.out.println("Introduzca el primer numero");
            num2=objeto.nextInt();

            resultado=num1+num2;

            System.out.println("El resultado es:" + resultado);

    }
}

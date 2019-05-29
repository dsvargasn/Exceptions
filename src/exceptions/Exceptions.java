/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.Scanner;
import exceptions.*;

/**
 *
 * @author Estudiantes
 */
public class Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese el numero de error que desea ver:");
        System.out.println("1. Aithmetic");
        System.out.println("2. Array");
        System.out.println("3. Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1:
                Arithmetic a = new Arithmetic();
                a.error();
                break;
            case 2:
                ArrayStore e = new ArrayStore();
                e.error();
                break;
            case 3:
                NumberFormat n = new NumberFormat();
                n.error();
                break;

        }
    }

}

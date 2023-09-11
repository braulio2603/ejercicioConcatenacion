package Main;


import arrays.arreglos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static arrays.arreglos.arr1;
import static arrays.arreglos.arr2;

public class Main {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del arreglo 1: ");
        arreglos arreglo1 = new arreglos(scanner.nextInt());
        capValorarr1(new Scanner(System.in), arreglo1);

        //Scanner scanner2 = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del arreglo 2: ");
        arreglos arreglo2 = new arreglos(scanner.nextInt());
        capValorarr2(new Scanner(System.in), arreglo2);
        concatenacion();

            }
    public static void capValorarr1(Scanner scanner, arreglos arreglo1) {
        int contador = 0;
        try {
            while (contador < arreglo1.getArr1().length) {
                System.out.println("Registra un valor entero al arreglo");
                arreglo1.setArr1(scanner.nextInt());
                contador++;
            }
        } catch (Exception e) {
            System.out.println("Error en la captura");
        }

    }
    public static void capValorarr2(Scanner scanner, arreglos arreglo2) {
        int contador = 0;
        try {
            while (contador < arreglo2.getArr2().length) {
                System.out.println("Registra un valor entero al arreglo");
                arreglo2.setArr2(scanner.nextInt());
                contador++;
            }
        } catch (Exception e) {
            System.out.println("Error en la captura");
        }

    }
    public static void concatenacion(){
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(arr2));

        Set<Integer> concatenaSet = new HashSet<>(set1);
        concatenaSet.retainAll(set2);
        System.out.println(concatenaSet);

    }
}

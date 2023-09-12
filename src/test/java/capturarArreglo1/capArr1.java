package capturarArreglo1;

import java.util.Scanner;

import static arrays.arreglos.arr1;

public class capArr1 {
    public static void capValorarr1(Scanner scanner) {
        try {
            System.out.println("Registra el tamaño del arreglo uno: ");
            arr1= new Integer[scanner.nextInt()];
            for (int i = 0; i < arr1.length; i++) {
                System.out.println("Registra un valor entero al arreglo uno: ");
                arr1[i] = scanner.nextInt();
            }
        } catch (Exception e) {
            System.out.println("Error en la captura");
        }

    }

}

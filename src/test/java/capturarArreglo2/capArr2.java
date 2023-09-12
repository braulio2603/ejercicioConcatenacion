package capturarArreglo2;

import java.util.Scanner;

import static arrays.arreglos.arr2;

public class capArr2 {

    public static void capValorarr2(Scanner scanner) {
        try {
            System.out.println("Registra el tamaño del arreglo dos: ");
            arr2= new Integer[scanner.nextInt()];
            for (int i = 0; i < arr2.length; i++) {
                System.out.println("Registra un valor entero al arreglo dos ");
                arr2[i] = scanner.nextInt();
            }
        } catch (Exception e) {
            System.out.println("Error en la captura");
        }

    }
}

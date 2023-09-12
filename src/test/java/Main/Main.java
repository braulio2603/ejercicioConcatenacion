package Main;


import arrays.arreglos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static arrays.arreglos.arr1;
import static arrays.arreglos.arr2;
import static capturarArreglo1.capArr1.capValorarr1;
import static capturarArreglo2.capArr2.capValorarr2;

public class Main {
    public static void main(String[] args){
    capValorarr1(new Scanner(System.in));
    capValorarr2(new Scanner(System.in));
    Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
    set1.retainAll(Arrays.asList(arr2));
    System.out.println("Los valores que se intersectan en los arreglos uno y dos son: " + set1);

            }
}

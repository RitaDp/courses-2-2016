package com.courses.spalah;

/**
 * @author Ievgen Tararaka
 */
public class PrintMatrix {
    /**
     * Написать программу, печатает двумерный массив заданного размера
     * квадратом и 4-мя треугольниками.
     * <p>
     * Входные параметры программы:
     * 1. Размер массива
     * 2. Символ для печати
     * <p>
     * Пример
     * Размер массива - 5
     * Символ для печати - #
     * <p>
     * # # # # #
     * # # # # #
     * # # # # #
     * # # # # #
     * # # # # #
     * <p>
     * #
     * # #
     * # # #
     * # # # #
     * # # # # #
     * <p>
     * # # # # #
     * # # # #
     * # # #
     * # #
     * #
     * <p>
     * #
     * # #
     * # # #
     * # # # #
     * # # # # #
     * <p>
     * # # # # #
     * # # # #
     * # # #
     * # #
     * #
     *
     * @param args - размер массива
     */
    public static void main(String[] args) {

        int size = 5;
        char b = '#';
        char[][] a = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                a[i][j] = b;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        char b1 = '#';
        int[][] a1 = new int[5][5];
        /*a1[0] = new int [1];
        a1[1] = new int [2];
        a1[2] = new int [3];
        a1[3] = new int [4];
        a1[4] = new int [5];
        */

        for(int i = 0; i<a1.length; i++){
            for(int j = 0; j<a1[i].length; j++){
                a1[i][j] = b1;
                System.out.print(a1[i][j] + " ");
            }
            System.out.println();
        }

    }
}




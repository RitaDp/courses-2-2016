package com.courses.spalah;

/**
 * Модифицируйте этот класс(файл)
 *
 * @author Ievgen Tararaka
 */
public class HomeWorkLoops {
    /**
     * Метод должен вернуть минимальное число
     * из заданного массива.
     * <p>Например:
     * вернуть число=3 при заданном массиве=[5, 4, 3, 4, 5]
     *
     * @param integers заданный массив типа int[]
     * @return минимальное число из массива
     */
    public static int min(int[] integers) {

        integers = new int [14, 25, 8, 13, 18];
        int min = integers[0];
        for(int i = 0; i < integers.length; i++) {
            if (min > integers[i]) ;
            min = integers[i];
        }
        System.out.println(min);
        return min;
    }


    /**
     * Метод должен вернуть максимальное число
     * из заданного массива.
     * <p>Например:
     * вернуть число=6.0 при заданном массиве=[5.1, 4.33, 3.0, 6.0, 5.999]
     *
     * @param doubles заданный массив типа double[]
     * @return максимальное число из массива
     */
    public static double max(double[] doubles) {

        doubles = new double [3.1, 2.5, 8.4, 1.3, 8.1];
        double max = doubles[0];
        for(double i = 0; i < double.length; i++) {
            if (max > doubles[i]) ;
            max = doubles[i];
        }
        System.out.println(max);
        return max;
    }

    /**
     * Метод должен вернуть среднее арифмитическое число
     * из заданного массива.
     * <p>Например:
     * вернуть число=8.0 при заданном массиве=[1, 3, 8, 10, 25, 1]
     *
     * @param shorts заданный массив типа short[]
     * @return среднее арифмитическое число из массива
     */
    public static float average(short[] shorts) {

       shorts = new short [4, 8, 10, 12, 16];
        short a  = shorts [0];
        for (short i = 0; i < short.length; i++) {
            a = a + shorts[i];
        }
        a = a / short.length;
        System.out.println(a);
       return a;
     }

    /**
     * Метод должен перевернуть массив.
     * <p>Например:
     * вернуть массив=[f, e, d, c, b, a] из заданного массива=[a, b, c, d, e, f]
     *
     * @param chars заданный массив типа char[]
     * @return перевернутый массив
     */
    public static char[] reverse(char[] chars){

        chars = new char [1, 2, 3, 4, 5, 6];
        for (char i = 0; i < char.length / 2; i++){
        int a = chars [i];
            chars[i] = chars[char.length - 1 - i];
            chars[char.length - 1 - i] = a;
        }
        return new char[chars];
    }
    }

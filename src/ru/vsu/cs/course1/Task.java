package ru.vsu.cs.course1;


import com.sun.tools.javac.Main;

import java.lang.reflect.Array;

public class Task {
    public static void Process(int[][] arr2) {
        for (int r = 0; r < arr2.length; r++) {
            for (int c = 0; c < arr2[r].length; c++) {
                arr2[r][c]++;
            }
        }
    }

    public static int[][] Process2(int[][] arr2) {
        int[][] res = new int[2][2];
        for (int r = 0; r < Math.min(arr2.length, 2); r++) {
            for (int c = 0; c < Math.min(arr2[0].length, 2); c++) {
                res[r][c] = arr2[r][c];
            }
        }
        return res;
    }

    public static int[][] createNew (int[][] arr2) {

        int[][] NewArray = new int[arr2.length][arr2[0].length];

        int columnsInd = arr2[0].length;
        int linesInd = arr2.length;

        for (int col = 0; col < columnsInd; col++) {
            for (int str = 0; str < linesInd; str++) {
                NewArray[str][col] = 1;
            }
        }

        for (int col = 0; col < columnsInd; col++) {
            for (int str = 0; str < linesInd; str++) {


                int sign = arr2[str][col];

                // вправо и вниз
                for (int d = 1; d < Math.min(linesInd - str, columnsInd - col); d++) {
                    if (sign == arr2[str + d][col + d]) {
                        NewArray[str][col]++;
                    }
                }
                // влево и вверх
                for (int d = Math.min(str, col); d > 0; d--) {
                    if (sign == arr2[str - d][col - d]) {
                        NewArray[str][col]++;
                    }
                }
                // вправо и вверх
                for (int d = 1; d < Math.min(columnsInd - col, str + 1); d++) {
                    if (sign == arr2[str - d][col + d]) {
                        NewArray[str][col]++;
                    }
                }
                // влево и вниз
                for (int d = 1; d < Math.min(col + 1, linesInd - str); d++) {

                    if (sign == arr2[str + d][col - d]) {
                        NewArray[str][col]++;
                    }
                }
            }
        }
        return NewArray;
    }

}

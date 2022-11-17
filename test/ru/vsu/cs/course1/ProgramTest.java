package ru.vsu.cs.course1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.vsu.cs.util.ArrayUtils;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    @Test
    public void test0(){
        int[][] arr = {{1, 2, 3, 4}, {3, 2, 2, 0}, {1, 2, 1, 0}};
        int[][] expectedArr = {{2, 2, 1, 1}, {1, 1, 3, 1}, {1, 2, 2, 1}};
//        System.out.println(ArrayUtils.toString(Task.createNew(arr)));
//        System.out.println(" ");
//        System.out.println(ArrayUtils.toString(Task.createNew(expectedArr)));
        Assertions.assertArrayEquals(expectedArr, Task.createNew(arr), "Array must be...");
    }
    @Test
    public void test1(){
        int[][] arr = {{1, 2, 3}, {2, 1, 2}, {4, 3, 1}, {5, 6, 7}};
        int[][] expectedArr = {{3, 3, 1}, {2, 3, 2}, {1, 1, 3}, {1, 1, 1}};
//        System.out.println(ArrayUtils.toString(Task.createNew(arr)));
//        System.out.println(" ");
//        System.out.println(ArrayUtils.toString(Task.createNew(expectedArr)));
        Assertions.assertArrayEquals(expectedArr, Task.createNew(arr), "Array must be...");
    }
    @Test
    public void test2(){
        int[][] arr = {{4, 3, 5, 3, 4}, {5, 4, 3, 4, 5}, {5, 3, 4, 3, 5}};
        int[][] expectedArr = {{3, 3, 3, 3, 3}, {1, 3, 5, 3, 1}, {2, 3, 5, 3, 2}};
//        System.out.println(ArrayUtils.toString(Task.createNew(arr)));
//        System.out.println(" ");
//        System.out.println(ArrayUtils.toString(Task.createNew(expectedArr)));
        Assertions.assertArrayEquals(expectedArr, Task.createNew(arr), "Array must be...");
    }
    @Test
    public void test3(){
        int[][] arr = {{9, 9, 9}, {9, 9, 9}, {9, 9, 9}};
        int[][] expectedArr = {{3, 3, 3}, {3, 5, 3}, {3, 3, 3}};
//        System.out.println(ArrayUtils.toString(Task.createNew(arr)));
//        System.out.println(" ");
//        System.out.println(ArrayUtils.toString(Task.createNew(expectedArr)));
        Assertions.assertArrayEquals(expectedArr, Task.createNew(arr), "Array must be...");
    }
    @Test
    public void test4(){
        int[][] arr = {{1, 2}, {2, 1}};
        int[][] expectedArr = {{2, 2}, {2, 2}};
//        System.out.println(ArrayUtils.toString(Task.createNew(arr)));
//        System.out.println(" ");
//        System.out.println(ArrayUtils.toString(Task.createNew(expectedArr)));
        Assertions.assertArrayEquals(expectedArr, Task.createNew(arr), "Array must be...");
    }
    @Test
    public void test5(){
        int[][] arr = {{1, 2, 1}, {2, 3, 2}, {1, 2, 1}};
        int[][] expectedArr = {{2, 3, 2}, {3, 1, 3}, {2, 3, 2}};
//        System.out.println(ArrayUtils.toString(Task.createNew(arr)));
//        System.out.println(" ");
//        System.out.println(ArrayUtils.toString(Task.createNew(expectedArr)));
        Assertions.assertArrayEquals(expectedArr, Task.createNew(arr), "Array must be...");
    }
    @Test
    public void test6(){
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expectedArr = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
//        System.out.println(ArrayUtils.toString(Task.createNew(arr)));
//        System.out.println(" ");
//        System.out.println(ArrayUtils.toString(Task.createNew(expectedArr)));
        Assertions.assertArrayEquals(expectedArr, Task.createNew(arr), "Array must be...");
    }
    @Test
    public void test7(){
        int[][] arr = {{10, 15, 10}, {15, 10, 15}, {10, 15, 10}};
        int[][] expectedArr = {{3, 3, 3}, {3, 5, 3}, {3, 3, 3}};
//        System.out.println(ArrayUtils.toString(Task.createNew(arr)));
//        System.out.println(" ");
//        System.out.println(ArrayUtils.toString(Task.createNew(expectedArr)));
        Assertions.assertArrayEquals(expectedArr, Task.createNew(arr), "Array must be...");
    }
    @Test
    public void test8(){
        int[][] arr = {{1, 2, 3, 4, 5, 6, 7, 8, 9}, {9, 1, 2, 3, 4, 5, 6, 7, 8}, {8, 9, 1, 2, 3, 4, 5, 6, 7}, {7, 8, 9, 1, 2, 3, 4, 5, 6}, {6, 7, 8, 9, 1, 2, 3, 4, 5}, {5, 6, 7, 8, 9, 1, 2, 3, 4}, {4, 5, 6, 7, 8, 9, 1, 2, 3}, {3, 4, 5, 6, 7, 8, 9, 1, 2}, {2, 3, 4, 5, 6, 7, 8, 9, 1}};
        int[][] expectedArr =  {{9, 8, 7, 6, 5, 4, 3, 2, 1}, {8, 9, 8, 7, 6, 5, 4, 3, 2}, {7, 8, 9, 8, 7, 6, 5, 4, 3}, {6, 7, 8, 9, 8, 7, 6, 5, 4}, {5, 6, 7, 8, 9, 8, 7, 6, 5}, {4, 5, 6, 7, 8, 9, 8, 7, 6}, {3, 4, 5, 6, 7, 8, 9, 8, 7}, {2, 3, 4, 5, 6, 7, 8, 9, 8}, {1, 2, 3, 4, 5, 6, 7, 8, 9}};
//        System.out.println(ArrayUtils.toString(Task.createNew(arr)));
//        System.out.println(" ");
//        System.out.println(ArrayUtils.toString(Task.createNew(expectedArr)));
        Assertions.assertArrayEquals(expectedArr, Task.createNew(arr), "Array must be...");
    }
    @Test
    public void test9(){
        int[][] arr = {{10104, 100000, 10104}, {100, 10104, 100}, {10104, 1000, 10104}};
        int[][] expectedArr = {{3, 1, 3}, {1, 5, 1}, {3, 1, 3}};
//        System.out.println(ArrayUtils.toString(Task.createNew(arr)));
//        System.out.println(" ");
//        System.out.println(ArrayUtils.toString(Task.createNew(expectedArr)));
        Assertions.assertArrayEquals(expectedArr, Task.createNew(arr), "Array must be...");
    }
    @Test
    public void test10(){
        int[][] arr = {{10, 10, 10}, {10, 1, 10}, {10, 10, 10}};
        int[][] expectedArr = {{2, 3, 2}, {3, 1, 3}, {2, 3, 2}};
//        System.out.println(ArrayUtils.toString(Task.createNew(arr)));
//        System.out.println(" ");
//        System.out.println(ArrayUtils.toString(Task.createNew(expectedArr)));
        Assertions.assertArrayEquals(expectedArr, Task.createNew(arr), "Array must be...");
    }



}
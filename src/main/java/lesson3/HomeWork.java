package lesson3;

public class HomeWork {
    public static void main(String[] args) {
        invertArray();
        fillDiagonal();
        fillArray();
        changeArray();
        putArray(3, 2);
        minMax();
        int[] arr = {2, 1, 3, 8, 5, 10, 2, 4};
    }

    public static void invertArray() { // Task #1
        int[] array = {1, 0, 1, 1, 0, 1, 0, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
    }

    public static void fillArray () { // Task #2
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

    }

    public static void changeArray () { // Task #3
        int[] arrNum = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i] < 6) {
                arrNum[i] *= 2;
            }
        }
    }

    public static void fillDiagonal () { // Task #4
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, k = arr[i].length; j < arr[i].length; j++, k--) {
                if (i == j || i == k - 1) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static int[] putArray(int len, int initialValue) { // Task #5
        int[] arrayNum = new int[len];
        for(int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = initialValue;
        }
        return arrayNum;
    }

    public static void minMax() { // Task #6*
        int[] array = {55, 11, -33, 44, 55, 786, 99};
        int max = 0;
        int min = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[max]) {
                max = i;
            }
            else if (array[i] < array[min]) {
                min = i;
            }
        }
        System.out.println(max + " " + min);
    }


}

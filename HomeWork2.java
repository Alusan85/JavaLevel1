/*
 * Java. Level 1. Lesson 2
 *
 * @author Kirill Kovalev
 * @version dated Aug 16, 2018
 *
 */

public class HomeWork2 {
    public static void main(String[] args) {
        // call for task №1
        changeArray();
        //call for task №2
        createArray();
        //call for task №3
        toDoubleArray();
        //call for task №4
        diagonalArray();
        //call for task №5
        findInArray();
        //call for task №6
        System.out.println(checkBalance(new int[] { 1, 1, 1, 2, 1 }));
        System.out.println(checkBalance(new int[] { 2, 1, 1, 2, 1 }));
        System.out.println(checkBalance(new int[] { 10, 10 }));
    }

    //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;

    private static void changeArray() {
        int[] arr = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
    }

    //2. Задать пустой целочисленный массив размером 8.
    // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

    private static void createArray() {
        int[] arr = new int[8];
        for (int i = 0, j = 0; i < arr.length; i++,j += 3) {
            arr[i]=j;

        }
    }

    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    // пройти по нему циклом, и числа меньшие 6 умножить на 2;

    private static void toDoubleArray() {
        int[] arr = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<6) arr[i]*=2;
        }
    }

    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов
    // одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

    private static void diagonalArray() {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i==j)  arr[i][j]=1;
            }
        }
    }

    //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы
    // (без помощи интернета);

    private static void findInArray() {
        int[] arr = new int[] {1, 5, -1, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int max=arr[0];
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = (min < arr[i]) ? min : arr[i];
            max = (max > arr[i]) ? max : arr[i];
        }
    }

    //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    // метод должен вернуть true если в массиве есть место, в котором сумма левой и правой
    // части массива равны. Примеры:
    // checkBalance([1, 1, 1, || 2, 1]) → true,
    // checkBalance([2, 1, 1, 2, 1]) → false,
    // checkBalance ([10, || 10]) → true,
    // граница показана символами ||, эти символы в массив не входят.

    private static boolean checkBalance(int[] arr) {

        for (int i = 0; i < arr.length + 1; i++) {
            int lSum = 0;
            int rSum = 0;

            for (int j = 0; j < i; j++) {
                lSum += arr[j];
            }
            for (int j = i; j < arr.length; j++) {
                rSum += arr[j];
            }
            if (lSum == rSum) return true;
        }
        return false;
    }
}

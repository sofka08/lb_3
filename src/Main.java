import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int rows = 5; // Количество строк
        int cols = 5; // Количество столбцов
        int[][] array = new int[rows][cols];

        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = rand.nextInt(10); // Случайные числа от 0 до 9
            }
        }

        System.out.println("Исходный массив:");
        printArray(array);

        for (int i = 0; i < rows; i++) {
            insertionSort(array[i]);
        }

        System.out.println("Отсортированный массив:");
        printArray(array);
    }
    // Метод сортировки вставками
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            // Перемещение текущего элемента в нужную позицию
            for (int j = i; j > 0 && array[j - 1] > array[j]; j--) {
                // Меняем местами элементы
                int temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
            }
        }
    }
    // Метод для вывода массива
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
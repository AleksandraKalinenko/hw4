import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;

        double[] weight1 = {1.57, 7.654, 9.986};

        int[] weight2 = {2, 4, 6, 8, 10};
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        for (int index = 0; index < weight.length; index++) {
            if (index == weight.length - 1) {
                System.out.println(weight[index]);
                break;
            }
            System.out.print(weight[index] + ", ");
        }

        double[] weight1 = {1.57, 7.654, 9.986};
        for (int index1 = 0; index1 < weight1.length; index1++) {
            if (index1 == weight1.length - 1) {
                System.out.println(weight1[index1]);
                break;
            }
            System.out.print(weight1[index1] + ", ");
        }

        int[] weight2 = {2, 4, 6, 8, 10};
        for (int index2 = 0; index2 < weight2.length; index2++) {
            if (index2 == weight2.length - 1) {
                System.out.println(weight2[index2]);
                break;
            }
            System.out.print(weight2[index2] + ", ");
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        for (int index = 2; index < weight.length; index--) {
            if (index == 0) {
                System.out.println(weight[index]);
                break;
            }
            System.out.print(weight[index] + ", ");
        }

        double[] weight1 = {1.57, 7.654, 9.986};
        for (int index1 = 2; index1 < weight1.length; index1--) {
            if (index1 == 0) {
                System.out.println(weight1[index1]);
                break;
            }
            System.out.print(weight1[index1] + ", ");
        }

        int[] weight2 = {2, 4, 6, 8, 10};
        for (int index2 = 4; index2 < weight2.length; index2--) {
            if (index2 == 0) {
                System.out.println(weight2[index2]);
                break;
            }
            System.out.print(weight2[index2] + ", ");
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        for (int index = 0; index < weight.length; index++) {
         if (weight[index] % 2 != 0) {
             weight[index] += 1;
         }
        }
        System.out.println(Arrays.toString(weight));
    }

    public static void task5 () {
        System.out.println("Задача 5");
        int sum = 0;
        int[] arr = generateRandomArray();
        for (int j : arr) {
            sum += j;
        }
        System.out.println(sum);
    }

    public static void task6 () {
        System.out.println("Задача 6");
        int[] arr = generateRandomArray();
        int minArr = 200_000;
        int maxArr = 100_000;
        for (int j : arr) {
            if (j > maxArr) {
                maxArr = j;
            }
            if (j < minArr) {
                minArr = j;
            }
        }
        System.out.println(minArr);
        System.out.println(maxArr);
    }

    public static void task7 () {
        System.out.println("Задача 7");
        double sum = 0;
        int[] arr = generateRandomArray();
        for (int j : arr) {
            sum += j;
        }
        sum /= 30;
        System.out.println(sum);
    }

    public static void task8 () {
        System.out.println("Задача 8");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}

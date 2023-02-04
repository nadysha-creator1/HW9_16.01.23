import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        //Задача 1.
        System.out.println("Задача1.");
        int[] weight = new int[3];
        for (int i = 0; i < weight.length; i++) {
            weight[i] = i + 1;
            System.out.println(weight[i]);
        }

        double[] nums = {1.57, 7.654, 9.986};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        boolean[] booleans = {true, false};
        for (int i = 0; i < booleans.length; i++) {
            System.out.println(booleans[i]);
        }
    }

    public static void task2() {
        //Задача2.
        int[] weight = new int[3];
        for (int i = 0; i < weight.length; i++) {
            weight[i] = i + 1;
        }
        double[] nums = {1.57, 7.654, 9.986};
        boolean[] booleans = {true, false};

        System.out.println("Задача2");
        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i]);
            if (i != weight.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i != nums.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < booleans.length; i++) {
            System.out.print(booleans[i]);
            if (i != booleans.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void task3() {
        //Задача 3.
        System.out.println("Задача 3.");
        int[] weight = new int[3];
        for (int i = 0; i < weight.length; i++) {
            weight[i] = i + 1;
        }
        double[] nums = {1.57, 7.654, 9.986};
        boolean[] booleans = {true, false};

        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.print(weight[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = booleans.length - 1; i >= 0; i--) {
            System.out.print(booleans[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void task4() {
        //Задача4.
        System.out.println("Задача 4.");
        int[] weight = new int[3];
        for (int i = 0; i < weight.length; i++) {
            weight[i] = i + 1;
        }
        double[] nums = {1.57, 7.654, 9.986};
        boolean[] booleans = {true, false};
            for (int i=0; i < weight.length;i++){
            if (weight[i] % 2 == 1) {
                weight[i]++;
            }
        }
        System.out.println(Arrays.toString(weight));
    }
}

package coreJava.array;

public class TwoDimensionalArrayDemo {
    public static void main(String[] args) {
        int[][] arr = {{5,8,9},{9,3,1},{5,1,2},{4,7,6}};
//        System.out.println(arr.length);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

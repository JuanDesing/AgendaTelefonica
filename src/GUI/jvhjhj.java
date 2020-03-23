package GUI;

public class jvhjhj {

    public static void main(String[] args) {

        int[] myArray = {1, 2, 1, 3, 3, 1, 2, 1, 5, 1};

        for (int i = 1; i <= 5; i++) {
            int c = 0;
            for (int j = 0; j < myArray.length; j++) {
                if (i == myArray[j]) {
                    c++;
                }

            }
            System.out.print(i + ": ");
            for (int k = 0; k < c; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}

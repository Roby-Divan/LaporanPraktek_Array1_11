import java.util.Arrays;
import java.util.Scanner;

public class ArrayBilangan28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil[] = { 5, 15, -7, 17 };

        for (int i = 0; i <= 4; i++) {
            System.out.println("bil[" + i + "] = " + bil[i] + ", double = " + (bil[i] * 2));
        }
        for (int nilai : bil) {
            System.out.println(nilai);
        }
        System.out.println(Arrays.toString(bil));
        input.close();
    }
}

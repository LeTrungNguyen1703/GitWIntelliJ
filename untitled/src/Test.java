import java.util.Scanner;

public class Test {
    public void Ham1(int x){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        x = scanner.nextInt();
        System.out.println("You entered: " + x);

    }

    public boolean aksd(int a) {
        float temp = (float) a;

        temp = temp / 2;

        int temp2 =  Math.round(temp);

        temp2 *=2;

        temp = (float) a;
        a = Math.round(temp);

        a = a * 2;

        return temp2 == a;

    }
}

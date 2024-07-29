import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AdditionAndSubtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int diff=0;
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        sum=n1+n2;
        diff=n1-n2;
        System.out.println(sum);
        System.out.println(diff);
    }
}
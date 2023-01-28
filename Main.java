import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        System.out.print("n Sayısını Giriniz: ");
        int n = imp.nextInt();
        double result=0;
        for(int i = 1; i<=n; i++){
                result+=(1.0/i );

        }
        System.out.println(result);
    }
}
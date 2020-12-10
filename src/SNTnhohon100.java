import java.util.Scanner;

public class SNTnhohon100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        while(number < 100){
            boolean check=true;
            if ( number<2)
                check=false;
            else if (number== 2)
                check=true;
            else {
                for (int i = 2; i <number ; i++) {
                    if (number % i ==0)
                        check=false;
                }
            }
            if(check){
                System.out.println("So nguyen to: ");
                System.out.println(number);
            }
            number++;
        }
    }
}

import java.util.Scanner;
public class Powerofnum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the  number");
        int num=scanner.nextInt();
        if(num>0){
            System.out.println("Number is positive");
        }else if(num<0){
            System.out.println("Number is negative");
        }else{
            System.out.println("Number is zero");
        }
        scanner.close();
    }
}

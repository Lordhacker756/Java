import java.util.*;

public class TestProgram{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i, count=0, n;
        System.out.println("Enter number: ");
        n = sc.nextInt();
        for(i=2; i<n; i++){
            if(n%2==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("It's a prime number");
        }else{
            System.out.println("Not a prime number");
        }
    }
}
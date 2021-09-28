import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        int sum=0,i;
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        
        for(i=2;i<=n;i++)
        {
            sum=sum+i;
            i++;
        }
                    System.out.println(sum);
    }
}

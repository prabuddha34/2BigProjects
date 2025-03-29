import java.util.Scanner;
public class CaldendarProblem
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Day Number !");
        int n=sc.nextInt();
        int[] arr = {
                31, // January
                28, // February
                31, // March
                30, // April
                31, // May
                30, // June
                31, // July
                31, // August
                30, // September
                31, // October
                30, // November
                31  // December
        };
        int s=0;
        int c=0;
        String month[]={"Jan","Feb","March","April","May","June","July","August","Sept","Oct","Nov","Dec"};
        for(int i=0;i<arr.length;i++){
            if(n>arr[i]){
                s=s+arr[i];
                n=n-arr[i];
                c++;
            }
            else{
                n=n/arr[i];
                break;
            }

        }
        System.out.println(" ");
        System.out.println(c);
        System.out.println(s);
    }
}

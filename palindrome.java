import java.util.*;
class pln{
     public static void isPalindrome(int n){
       int orgnum=n;
       int rev=0;
       while (n>0) {
        int d=n%10;  rev=(rev*10)+d;  n/=10;
       }
       if(rev==orgnum) System.out.println("Palindrome Number");
       else System.out.println("Not a Palindrome number");

     }
 }   

public class palindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number to check : ");
        int n=sc.nextInt();
        pln obj=new pln();
        obj.isPalindrome(n);
    }
 }
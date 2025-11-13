public class leap {
    public static void main(String[] args) {
// int n=Integer.parseInt(args[0]);
// if(n%4==0 && n%100!=0) System.out.println("leap year");
// else if(n%4==0 && n%100==0 && n%400==0) System.out.println("leap year");
// else System.out.println("not a leap year");
        
        int year=Integer.parseInt(args[0]);
        boolean isLeap = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
        System.out.println(year + " is a " + (isLeap ? "leap year" : "not a leap year"));
    }
}

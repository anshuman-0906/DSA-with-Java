public class cd1 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        boolean result= (a%b==0 || b%a==0);
        System.out.println(result);
    }
    
}

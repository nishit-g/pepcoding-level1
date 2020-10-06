import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
       // write ur code here
       int t = scn.nextInt();
       while(t-->0){
           int n = scn.nextInt();
           System.out.println(primeOrNot(n));
       }
   }
   
   static String primeOrNot(int n){
       if(n < 2) return "not prime";
       for(int i = 2; i*i<=n; i++){
           if(n%i==0)
            return "not prime";
       }
       return "prime";
   }
   
  }
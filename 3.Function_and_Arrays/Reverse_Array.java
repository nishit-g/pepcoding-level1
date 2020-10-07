import java.io.*;

public class Reverse_Array {
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void reverse(int[] a){
    // write your code here
    for(int i =0; i<(a.length/2); i++){
        int d = a[i];
        int b = a[a.length-i-1];
        int temp = d;
        d = b;
        b = temp;
        a[i] = d;
        a[a.length-i-1]  = b;
    }
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    reverse(a);
    display(a);
 }

}
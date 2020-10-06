import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Write your code here

        for(int i =0; i<5; i++){
            if(i==0)
                System.out.print("*****\n");
            else if (i == 4)
                System.out.println("*****");
            else{
                int k = 5-i;
                System.out.format("%" + k + "s\n", "*");
            }
        }
    }
}
import java.io.*;
import java.util.*;
public class GCD {
	
/* A simple recursion example*/
	
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println(GCD(x,y));
    }
    
    public static int GCD(int x, int y){
        if(x == y){
            int GCD = x;
            return x;
        }else if(x > y){
            return GCD(x - y, y);
        }else{
            return GCD(y - x, x);
        }
    }

}

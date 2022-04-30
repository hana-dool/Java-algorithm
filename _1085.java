import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner ;

public class _1085 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in); 
        int x  = in.nextInt() ; 
        int y  = in.nextInt() ; 
        int w  = in.nextInt() ; 
        int h  = in.nextInt() ;
        ArrayList arrlst = new ArrayList() ; 
        arrlst.add(w-x) ;
        arrlst.add(x) ;
        arrlst.add(h-y) ;
        arrlst.add(y) ; 
        System.out.println(Collections.min(arrlst)); 
        in.close()  ; 
    }
    
}

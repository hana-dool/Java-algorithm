import java.util.Scanner ; 
public class _11021 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in) ; 
        int T = in.nextInt() ; 
        int[] arrA = new int[T] ;
        int[] arrB = new int[T] ; 
        for (int i = 0 ; i < T ; i++){
            int A = in.nextInt() ;
            int B = in.nextInt() ;
            arrA[i] = A ; 
            arrB[i] = B ;  
        }
        for (int i = 0 ; i < T ; i++){
            String v = Integer.toString(i+1) ;
            int k  = arrA[i]+arrB[i] ; 
            System.out.println("Case #"  + v + ": "  +k  ) ; 
        }

    }
    
}

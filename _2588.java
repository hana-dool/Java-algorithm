import java.util.Scanner ; 

public class _2588 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in) ; 
        int A = in.nextInt() ;
        int B = in.nextInt() ;
        String sB = Integer.toString (B)  ;
        String s1 = sB.substring(2,3) ;
        String s2 = sB.substring(1,2) ; 
        String s3 = sB.substring(0,1) ;
        int S1 = Integer.parseInt(s1) ; 
        int S2 = Integer.parseInt(s2) ;
        int S3 = Integer.parseInt(s3) ; 
        System.out.println(S1 * A) ; 
        System.out.println(S2 * A) ;
        System.out.println(S3 * A) ;
        System.out.println(A * B) ; 
        in.close() ; 
    }
    
}

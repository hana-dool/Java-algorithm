import java.util.Scanner ; 

public class _2562{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in) ;
        int[] arr = new int[9] ; 
        for(int i=0 ; i<9 ; i++){
            arr[i] = in.nextInt() ; 
        }
        in.close() ;
        int index = 0 ;
        int mxindex = 0 ;
        int mx = 0 ; 
        for (int element : arr) {
            index++ ; 
            if (mx<element){
                mx = element ;
                mxindex = index ; 
            }
        }
        System.out.println(mx) ;         
        System.out.println(mxindex) ; 

    }
}
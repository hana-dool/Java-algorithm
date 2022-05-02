import java.util.Scanner ; 

public class _2525 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in) ; 
        int hour = in.nextInt() ; 
        int minute = in.nextInt() ; 
        int require_minute = in.nextInt() ;
        require_minute += minute ; 
        int add_hour = require_minute / 60 ; 
        int new_minute = require_minute % 60 ; 
        hour += add_hour ; 
        int new_hour = hour % 24  ; 
        System.out.print(new_hour) ; 
        System.out.print(" ") ; 
        System.out.println(new_minute) ; 
    }
}

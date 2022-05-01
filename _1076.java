import java.util.Scanner ; 
import java.util.HashMap;

public class _1076 {
    public static void main(String[] args){
        HashMap<String,Integer> map = new HashMap<>() ; 
        map.put("black",0) ;
        map.put("brown",1) ; 
        map.put("red",2) ; 
        map.put("orange",3) ; 
        map.put("yellow",4) ; 
        map.put("green",5) ; 
        map.put("blue",6) ; 
        map.put("violet",7) ; 
        map.put("grey",8) ; 
        map.put("white",9) ; 
        Scanner in = new Scanner(System.in) ; 
        String A = in.nextLine() ; 
        String B = in.nextLine() ;
        String C = in.nextLine() ; ; 
        double C_value = Math.pow(10,map.get(C)) ; 
        String AB = Integer.toString(map.get(A)) + Integer.toString(map.get(B)) ;
        Integer D = Integer.parseInt(AB); 
        double answer = D * C_value ;
        long answer_int = (long) answer  ; 
        System.out.println(answer_int) ;

    }
}

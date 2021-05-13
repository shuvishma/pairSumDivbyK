import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;



/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in)) ;
        String[] str = read.readLine().trim().split(" ") ;
        int n = Integer.parseInt(str[0]) ;
        int k = Integer.parseInt(str[1]) ;
        int[] arr = new int[n] ;
        str = read.readLine().trim().split(" ") ;
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(str[i]) ;
        }
        HashMap<Integer,Integer> mp = new HashMap<>() ;
        long count = 0L ;
        for(int i=0; i<n; i++) {
            int x = arr[i] % k ;
            int y = (k - x) % k ;
            if(mp.containsKey(y)) {
                int temp = mp.get(y) ;
                count += temp ;
            }
            
            if(mp.containsKey(x)) {
                int temp = mp.get(x) ;
                mp.put(x, temp+1) ;
            }
            else{
                mp.put(x, 1) ;
            }
        }
        System.out.println(count);
        
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Q11508 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int n_div = n/3;
        int sum = 0;
        int tmp = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n ; i++){
            arr.add(Integer.parseInt(bf.readLine()));
        }
        Collections.sort(arr,Collections.reverseOrder());
        for(int i = 0; i < n_div*3 ; i++){
            tmp++;
            if(tmp == 3){
                tmp = 0;
                continue;
            }
            else{
                sum+= arr.get(i);
            }
        }
        for(int i = n_div*3 ; i < n ; i++){
            sum+= arr.get(i);
        }
        System.out.println(sum);
    }
}

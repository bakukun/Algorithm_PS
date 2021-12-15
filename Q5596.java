import java.io.*;
import java.util.StringTokenizer;

public class Q5596 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int sum1 = 0;
        int sum2 = 0;
        for(int i =0; i<2; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for(int j =0; j<4;j++){
                if(i==0){
                    sum1 += Integer.parseInt(st.nextToken());
                }
                else{
                    sum2 += Integer.parseInt(st.nextToken());
                }
            }
        }
        if(sum1>=sum2){
            System.out.println(sum1);
        }
        else{
        System.out.println(sum2);
        }
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Q2822 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] score = new int[8];
        int cnt = 0;

        for (int i = 0; i < score.length; i++) {
            score[i] = Integer.parseInt(bf.readLine());
        }

        int[] score_high = score.clone();
        int[] save = new int[5];
        Arrays.sort(score_high);

        for(int k = 7 ; k > 2; k--){
            cnt += score_high[k];
            for(int j=0;j<8;j++){
                if( score_high[k] == score[j]){
                    save[k-3] = j;
                }
            }
        }
        Arrays.sort(save);
        System.out.println(cnt);
        for(int i=0; i<save.length; i++){
           System.out.print((save[i]+1)+" ");
        }
    }
}

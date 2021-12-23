import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1343 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        StringBuilder sb = new StringBuilder("");
        StringBuilder tmp_sb = new StringBuilder("");
        int tmp = 0;
        for (int i = 0; i < str.length(); i++) {
            char tet = str.charAt(i);
            if (tet == 'X'){
                tmp++;
            }
            else if(tet == '.'){
                if(tmp%2 ==1){
                    System.out.println(-1);
                    System.exit(1);
                }
                else{
                    int A_num = tmp / 4;
                    int B_num = tmp - (A_num * 4);
                    while( A_num --> 0){
                        tmp_sb.append("AAAA");
                    }
                    while( B_num --> 0){
                        tmp_sb.append("B");
                    }
                    sb.append(tmp_sb);
                    sb.append('.');
                    tmp_sb.setLength(0);
                    tmp = 0;
                }
            }
        }
        if(tmp > 0){
            if(tmp%2 ==1){
                System.out.println(-1);
                System.exit(1);
            }
            else{
                int A_num = tmp / 4;
                int B_num = tmp - (A_num * 4);
                while( A_num --> 0){
                    tmp_sb.append("AAAA");
                }
                while( B_num --> 0){
                    tmp_sb.append("B");
                }
                sb.append(tmp_sb);
                tmp_sb.setLength(0);
                tmp = 0;
            }
        }
        System.out.println(sb);
    }
}

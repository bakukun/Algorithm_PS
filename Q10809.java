import java.util.*;

public class Q10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] str = new int[26];
        String tmp = sc.next();
        for (int k=0; k < 26; k++){
            str[k] = -1;
        }
        for (int i=0; i < tmp.length(); i++){
            if (str[tmp.charAt(i)-97] == -1) {
                str[tmp.charAt(i) - 97] = i;
            }
        }
        for (int j=0; j < 26; j++){
            if (str[j] <= -1){
                System.out.print(-1);
            }
            else {
                System.out.print(str[j]);
            }
            System.out.print(" ");
        }
    }
}




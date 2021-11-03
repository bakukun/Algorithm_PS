import java.io.*;


public class Q1769 {
    public static int count = 0;
    public static int three(int n){
        count++;
        int sum = 0;
        while(n>0){
            sum+= (n%10);
            n/=10;
        }
        if(sum>=10){
            return three(sum);
        }
        else{
            return sum;
    }
}
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        if(str.length() == 1){
            if (str.equals("3")  || str.equals("6") || str.equals("9") ){
                bw.write("0");
                bw.newLine();
                bw.write("YES");
            }
            else{
                bw.write("0");
                bw.newLine();
                bw.write("NO");
            }
        }
        else {
            int tmp = 0;
            for(int i=0;i<str.length();i++){
               tmp += (str.charAt(i)-48);
            }
            count++;
            int n = three(tmp);
            bw.write(Integer.toString(count));
            bw.newLine();
            if(n%3==0){
                bw.write("YES");
            }
            else{
                bw.write("NO");
            }
        }
        bw.flush();
        bw.close();
    }
}

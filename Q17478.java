import java.io.*;

public class Q17478 {
    public static int cnt = 0;

    public static void ans(int n){
        String str1 = "\"재귀함수가 뭔가요?\"";
        String str2 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
        String str3 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
        String str4 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
        if(n>0){
              if(cnt < n) {
                for (int i = 0; i < cnt * 4; i++) {
                    System.out.print("_");
                }
                System.out.println(str1);
                for (int i = 0; i < cnt * 4; i++) {
                    System.out.print("_");
                }
                System.out.println(str2);
                for (int i = 0; i < cnt * 4; i++) {
                    System.out.print("_");
                }
                System.out.println(str3);
                for (int i = 0; i < cnt * 4; i++) {
                    System.out.print("_");
                }
                System.out.println(str4);
            }
            else if(cnt==n){
                for (int i = 0; i < cnt * 4; i++) {
                    System.out.print("_");
                }
                System.out.println(str1);
                for (int i = 0; i < cnt * 4; i++) {
                    System.out.print("_");
                }
                System.out.println("\"재귀함수는 자기 자신을 호출하는 함수라네\"");
            }
            cnt++;
            ans(n-1);
            for (int i = 0; i < cnt * 4; i++) {
                System.out.print("_");
            }
            System.out.println("라고 답변하였지.");
        }
    }




    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        bw.write("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");
        bw.flush();
        ans(n);
        bw.close();
    }
}



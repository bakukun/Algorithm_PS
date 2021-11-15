import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Q11724 {
    public static int cnt;
    public static int n;

    public static boolean istrue(boolean[] check){
        for(int i=1; i< check.length; i++){
            return check[i];
            }

        return true;
    }

    // DFS 함수 정의
    public static void dfs(int[][]a,boolean[] visited, int x,boolean[] check) {
        if(visited[x] == true) {
            return;
        }
        // 현재 노드를 방문 처리
        visited[x] = true;
        check[x] = true;

        for(int i=0;i<a[x].length;i++) {
            if(a[x][i]==1 && !visited[i]){
                dfs(a,visited,i,check);
            }

        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer count = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(count.nextToken());
        int m = Integer.parseInt(count.nextToken());
        boolean[] visited = new boolean[n+1];
        boolean[] check = new boolean[n+1];
        int[][] arr = new int[n+1][n+1];

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        while(!istrue(check)){
            for(int i = 1; i<check.length;i++){
                if(check[i] == false){
                    cnt++;
                    dfs(arr,visited,i,check);
                }
            }
        }

        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();
    }
}



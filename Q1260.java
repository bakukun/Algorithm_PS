import java.util.*;

public class Q1260 {
    public static boolean[] visited = new boolean[1001];
	public static boolean[] visited1 = new boolean[1001];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

	// DFS 함수 정의
	public static void dfs(int x) {
		// 현재 노드를 방문 처리
		visited[x] = true;
		System.out.print(x + " ");
		// 현재 노드와 연결된 다른 노드를 재귀적으로 방문
		for (int i = 0; i < graph.get(x).size(); i++) {
			int y = graph.get(x).get(i);
			if (!visited[y]) dfs(y);
		}
	}

	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(start);
		// 현재 노드를 방문 처리
		visited1[start] = true;
		// 큐가 빌 때까지 반복
		while(!q.isEmpty()) {
			// 큐에서 하나의 원소를 뽑아 출력
			int x = q.poll();
			System.out.print(x + " ");
			// 해당 원소와 연결된, 아직 방문하지 않은 원소들을 큐에 삽입
			for(int i = 0; i < graph.get(x).size(); i++) {
				int y = graph.get(x).get(i);
				//System.out.println("i :"+i+" x :"+x+" x size :"+graph.get(x).size()+" y :"+y);
				if(!visited1[y]) {
					q.offer(y);
					visited1[y] = true;
				}
			}
		}
	}

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    int start = sc.nextInt();
		int[][] arr = new int[m][2];

		// 그래프 초기화
		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Integer>());
		}

		// 값 삽입
		for(int i = 0; i < m; i++) {
			arr[i][0] = sc.nextInt();
			int front = arr[i][0];
			arr[i][1] = sc.nextInt();
			int back = arr[i][1];
			if (front > back){
				arr[i][1] = front;
				arr[i][0] = back;
			}
		}

		// 이차원 배열 정렬
		Arrays.sort(arr, (o1, o2) -> {
			if(o1[0] == o2[0]) {
				return Integer.compare(o1[1], o2[1]);
			}
			else {
				return Integer.compare(o1[0],o2[0]);
			}
		});

		for(int i = 0; i < m; i++){
            graph.get(arr[i][0]).add(arr[i][1]);
			graph.get(arr[i][1]).add(arr[i][0]);
        }

		dfs(start);
		System.out.print("\n");
		bfs(start);

	}
}


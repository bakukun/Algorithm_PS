import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1004 {
	public static boolean check(double x1,double y1,double x2,double y2,double c1,double c2,double c3){
		double m_1 = Math.sqrt(Math.pow(c1-x1,2)+Math.pow(c2-y1,2));
		double m_2 = Math.sqrt(Math.pow(c1-x2,2)+Math.pow(c2-y2,2));
		//System.out.println(x1+" "+y1+" "+x2+" "+y2+" "+c1+" "+c2+" "+c3+" "+m_1+" "+m_2);
		if(m_1< c3 || m_2 < c3) {
			if (m_1 < c3 && m_2 < c3) {
				return false;
			} else {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine()," ");
			int cnt = 0;
			double x1 = Double.parseDouble(st.nextToken());
			double y1 = Double.parseDouble(st.nextToken());
			double x2 = Double.parseDouble(st.nextToken());
			double y2 = Double.parseDouble(st.nextToken());
			int one = Integer.parseInt(bf.readLine());
			double[][] colide = new double[one][3];
			for (int j = 0 ; j < one; j++){
				StringTokenizer st2 = new StringTokenizer(bf.readLine()," ");
				colide[j][0] = Double.parseDouble(st2.nextToken());
				colide[j][1] = Double.parseDouble(st2.nextToken());
				colide[j][2] = Double.parseDouble(st2.nextToken());
				if (check(x1,y1,x2,y2,colide[j][0],colide[j][1],colide[j][2]) == true){
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}

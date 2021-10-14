public class Q4673 {
    public static int Self_Num(int N){
        int sum = N;
        while(N != 0){
            sum += (N%10);
            N /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        boolean[] arr = new boolean[10001];
        for(int i=1; i<10001; i++){
            int n = Self_Num(i);
            if(n<10001){
                arr[n] = true;
            }
        }
        for(int j=1; j<10001; j++){
            if (arr[j] == false){
                System.out.println(j);
            }
        }
    }
}

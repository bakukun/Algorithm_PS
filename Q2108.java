import java.io.*;
import java.util.*;

public class Q2108 {
    public static int n;
    public static int[] sorted;

    public static void merge(int a[],int m, int middle,int n){
        int i = m;
        int j = middle + 1;
        int k = m;
        //작은 순서대로 배열 삽입
        while(i<= middle && j<= n){
            if(a[i]<=a[j]){
                sorted[k] = a[i];
                i++;
            }
            else{
                sorted[k] = a[j];
                j++;
            }
            k++;
        }
        //남은 데이터 삽입
        if( i > middle) { //왼쪽 다찰때
            for(int t = j; t<= n;t++){
                sorted[k] = a[t];
                k++;
            }
        } else {
            for(int t = i; t<=middle; t++){
                sorted[k] = a[t];
                k++;
            }
        }
        // 정렬된 배열을 다시 삽입해주기
        for(int t=m;t<=n;t++){
            a[t] = sorted[t];
        }
    }

    public static void mergeSort(int a[],int m,int n) {

        if(m<n){
            int middle = (m+n)/2;
            mergeSort(a,m,middle);
            mergeSort(a,middle+1,n);
            merge(a,m,middle,n);
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        //최빈값 필요 변수
        int cnt = 0;
        int[] idx = new int[4001];
        int[] idx_negative = new int[4001];
        ArrayList<Integer> max = new ArrayList<>();
        sorted = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum+=arr[i];
            if(arr[i]>=0){
                idx[arr[i]]++;
            }
            else{
                idx_negative[-1*(arr[i])]++;
            }
        }
        mergeSort(arr,0,arr.length-1);
        double realsum = sum/(double)n;
        bw.write(Integer.toString((int)Math.round(realsum)));
        bw.newLine();
        bw.write(Integer.toString(arr[n/2]));
        bw.newLine();
        for(int i=0; i<4001;i++){
            if(idx[i]>cnt){
                max.clear();
               // System.out.println("idx 계산1 "+i+" "+idx[i]);
                cnt = idx[i];
                max.add(i);
            }
            else if(idx[i]==cnt){
               // System.out.println("idx 계산2 "+i+" "+idx[i]);
                max.add(i);
            }
            if(idx_negative[i]>cnt){
                max.clear();
               // System.out.println("idx nega 계산1 "+i+" "+idx_negative[i]);
                cnt = idx_negative[i];
                max.add(i*(-1));
            }
            else if(idx_negative[i]==cnt){
               // System.out.println("idx nega 계산2 "+i+" "+idx_negative[i]);
                max.add(i*(-1));
            }
        }
        if(max.size()>1){
            Collections.sort(max);
            bw.write(Integer.toString(max.get(1)));
        }
        else{
            bw.write(Integer.toString(max.get(0)));
        }
        bw.newLine();
        bw.write(Integer.toString(arr[n-1]-arr[0]));
        bw.newLine();
        bw.flush();
        bw.close();
    }
}


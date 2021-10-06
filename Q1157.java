import java.util.Scanner;

public class Q1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int cnt = 0;
        int index = 0;
        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) { //아스키코드 넣기
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                arr[str.charAt(i) - 65]++;
            }
            else if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                arr[str.charAt(i) - 97]++;
            }
        }
        for(int a=0; a<arr.length; a++){
            if (arr[a]> cnt){
                cnt = arr[a];
                index = a;
            }
        }
        for(int k=0; k< arr.length; k++){ //중복값
            for(int j=k+1; j< arr.length; j++){
               if (arr[k]+arr[j]-(2*cnt)==0){
                    System.out.println("?");
                    System.exit(0);
                }
            }
        }
        System.out.println(((char)(index+65)));
    }
}

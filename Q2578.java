import java.util.Scanner;

public class Q2578 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];
        boolean[][] arr2 = new boolean[5][5];
        int tmp = 0;
        int cnt = 0;
        int n = 0;
        int no_row1 = -1;
        int no_row2 = -1;
        int no_col1 = -1;
        int no_col2 = -1;
        int no_dia1 = -1;
        int no_dia2 = -1;


        for(int i = 0; i<5; i++){ //배열 숫자 넣기
            for(int j = 0; j<5; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        while(cnt<3){ //숫자 입력받고 비교해서 boolean값에 True값 넣기
        int num = sc.nextInt();
        n++;
            for(int j = 0; j<5; j++){
                for(int k = 0; k<5; k++) {

                    if(arr[j][k] == num){ //boolean값에 True값 넣기
                        arr2[j][k] = true;
                    }

                    for(int a=0; a<5;a++){//가로판단용
                        tmp = 0;
                        if(a == no_row1 || a == no_row2){
                            continue;
                        }
                        for(int b=0; b<5; b++){
                            if(arr2[a][b] == true){
                                tmp++;
                            }

                            if(tmp == 5){
                                if(no_row1 >= 0){
                                    no_row2 = a;
                                }
                                else {
                                    no_row1 = a;
                                }
                                cnt++;

                            }
                        }
                    }

                    for(int a=0; a<5;a++){//세로판단용
                        tmp = 0;
                        if(a == no_col1 || a == no_col2){
                            continue;
                        }
                        for(int b=0; b<5; b++){
                            if(arr2[b][a] == true){
                                tmp++;
                            }
                            if(tmp == 5){
                                if(no_col1 >= 0){
                                    no_col2 = a;
                                }
                                else {
                                    no_col1 = a;
                                }
                                cnt++;

                            }
                        }
                    }
                    if(no_dia1 == -1) {
                        tmp = 0;//우하대각선 판단용
                        for (int a = 0; a < 5; a++) {
                            if (arr2[a][a] == true) {
                                tmp++;
                            }
                            if(tmp == 5){
                                no_dia1 = 1;
                                cnt++;

                            }
                        }
                    }
                    if(no_dia2 == -1) { //좌상대각선 판단용
                        tmp = 0;
                        for (int a = 4; a >=0; a--) {
                            if (arr2[a][4-a] == true) {
                                tmp++;
                            }
                            if(tmp == 5){
                                no_dia2 = 1;
                                cnt++;

                           }
                        }
                    }

                }
            }
        }
        System.out.println(n);
    }
}

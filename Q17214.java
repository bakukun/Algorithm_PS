import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q17214 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int tmp = -1;
        int len = str.length();
        String str1 = "";
        String str2 = "";
        boolean plus = false;
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        if (str.charAt(0) == '-') { //음수
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) != 'x') {
                    one.append(str.charAt(i));
                } else {
                    tmp = i;
                    break;
                }
            }
            if (tmp == -1) { // 상수항일 경우
                if (str.equals("-1")) { // 상수가 1 일때
                    System.out.println("-x+W");
                } else if (str.equals("0")) { // 상수가 0 일때
                    System.out.println("W");
                } else { // 아닐때
                    System.out.println(str + "x+W");
                }
            } else { //상수항이 아닐경우
                len -= (tmp + 1);
                int trans_one = Integer.parseInt(one.toString()) / 2;
                if (len == 0) { //일차항으로만 이루이진 경우
                    if (trans_one == 1) {
                        System.out.println("-xx+W");
                    } else {
                        System.out.println("-" + trans_one + "xx+W");
                    }
                } else {   // 일차 + 상수항

                    if (str.charAt(tmp + 1) == '+') {
                        plus = true;
                    }
                    for (int i = tmp + 2; i < str.length(); i++) {
                        two.append(str.charAt(i));
                    }

                    int trans_two = Integer.parseInt(two.toString());

                    if (trans_two == 0) { // 상수항이 0일때
                        if (trans_one == 1) {
                            System.out.print("-xx+W");
                        } else {
                            System.out.println("-" + trans_one + "xx+W");
                        }
                    } else { // 상수가 0이 아닐때
                        if (plus) { // +일때
                            if (trans_one == 1 || trans_two == 1) {
                                if (trans_one == 1 && trans_two == 1) {
                                    System.out.print("-xx+" + "x+W");
                                } else if (trans_one == 1) {
                                    System.out.print("-xx+" + trans_two + "x+W");
                                } else if (trans_two == 1) {
                                    System.out.print("-" +trans_one + "xx+" + "x+W");
                                }
                            } else {
                                System.out.print("-" +trans_one + "xx+" + trans_two + "x+W");
                            }
                        } else { // -일때
                            if (trans_one == 1 || trans_two == 1) {
                                if (trans_one == 1 && trans_two == 1) {
                                    System.out.print("-xx-" + "x+W");
                                } else if (trans_one == 1) {
                                    System.out.print("-xx-" + trans_two + "x+W");
                                } else if (trans_two == 1) {
                                    System.out.print("-" +trans_one + "xx-" + "x+W");
                                }
                            } else {
                                System.out.print("-" +trans_one + "xx-" + trans_two + "x+W");
                            }
                        }
                    }
                }
            }
        }

        else{ //양수
            for(int i=0;i<str.length();i++){ // 일차항 숫자 판별
                if (str.charAt(i)!='x'){
                    one.append(str.charAt(i));
                }
                else{
                    tmp = i;
                    break;
                }
            }
            if(tmp == -1) { // 상수항일 경우
                if (str.equals("1")) { // 상수가 1 일때
                    System.out.println("x+W");
                }
                else if(str.equals("0")){ // 상수가 0 일때
                    System.out.println("W");
                }
                else { // 아닐때
                    System.out.println(str + "x+W");
                }
            }
            else{ //상수항이 아닐경우
                len -= (tmp+1);
                int trans_one = Integer.parseInt(one.toString())/2;
                if(len == 0){ //일차항으로만 이루이진 경우
                    if(trans_one == 1){
                        System.out.println("xx+W");
                    }
                    else{
                        System.out.println(trans_one+"xx+W");
                    }
                }
                else{   // 일차 + 상수항

                    if(str.charAt(tmp+1) == '+'){
                        plus = true;
                    }
                    for(int i=tmp+2;i<str.length();i++){
                        two.append(str.charAt(i));
                    }

                    int trans_two = Integer.parseInt(two.toString());

                    if(trans_two == 0){ // 상수항이 0일때
                        if(trans_one == 1){
                            System.out.print("xx+W");
                        }
                        else{
                            System.out.println(trans_one+"xx+W");
                        }
                    }

                    else{ // 상수가 0이 아닐때
                        if(plus) { // +일때
                            if (trans_one == 1 || trans_two == 1) {
                                if (trans_one == 1 && trans_two == 1) {
                                    System.out.print("xx+" + "x+W");
                                } else if (trans_one == 1) {
                                    System.out.print("xx+" + trans_two + "x+W");
                                } else if (trans_two == 1) {
                                    System.out.print(trans_one + "xx+" + "x+W");
                                }
                            } else {
                                System.out.print(trans_one + "xx+" + trans_two + "x+W");
                            }
                        }
                        else{ // -일때
                            if (trans_one == 1 || trans_two == 1) {
                                if (trans_one == 1 && trans_two == 1) {
                                    System.out.print("xx-" + "x+W");
                                } else if (trans_one == 1) {
                                    System.out.print("xx-" + trans_two + "x+W");
                                } else if (trans_two == 1) {
                                    System.out.print(trans_one + "xx-" + "x+W");
                                }
                            } else {
                                System.out.print(trans_one+"xx-"+trans_two+"x+W");
                            }
                        }
                    }
                }
            }
        } // 양수끝
    }
}

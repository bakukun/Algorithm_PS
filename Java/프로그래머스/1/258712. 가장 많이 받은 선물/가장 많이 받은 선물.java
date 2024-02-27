import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int friend = friends.length;
        Map<String, Integer> friendidx = new HashMap<>();
        for(int idx = 0; idx < friend; idx++){
            friendidx.put(friends[idx], idx);  
        }
        
        int[][] table = new int[friend][friend];
        for(int i = 0 ; i < gifts.length; i++){
            String[] name = gifts[i].split(" ");
            table[friendidx.get(name[0])][friendidx.get(name[1])] += 1;
        }
        
        int[][] gifttable = new int[friend][4];
        for(int i = 0 ; i < table.length; i++){
            int rowsum = 0;
            int colsum = 0;
            for(int j = 0 ; j < table[i].length; j++){
                rowsum += table[i][j];
                colsum += table[j][i];
            }
            gifttable[i][0] = rowsum;
            gifttable[i][1] = colsum;
            gifttable[i][2] = rowsum - colsum;
        }
        
        for(int i = 0 ; i < table.length; i++){
            for(int j = 0 ; j < table[i].length; j++){
                
                if (i == j) continue;
                if(table[i][j] > table[j][i]){
                    gifttable[i][3] += 1;
                }
                else if (table[i][j] == table[j][i]){
                    if(gifttable[i][2] > gifttable[j][2]){
                        gifttable[i][3] += 1;
                    }
                }
            }
        }
        int max = 0;
        for (int i = 0; i < gifttable.length; i++) {
            if (gifttable[i][3] > max) {
                max = gifttable[i][3];
            }
        }
        return max;
    }
}
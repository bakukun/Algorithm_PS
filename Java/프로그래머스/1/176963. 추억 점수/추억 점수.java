class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int x = photo.length;
        int[] answer = new int[x];
        int y = yearning.length;
        for (int i = 0; i < x; i++){
            int sum = 0;
            int photosize = photo[i].length;  
            for (int j = 0; j < photosize; j++){
                for (int k = 0; k < y; k++){
                    if(name[k].equals(photo[i][j])){
                       sum += yearning[k];
                    }
                }
            }
            answer[i] = sum;
        }
        return answer;
    }
}

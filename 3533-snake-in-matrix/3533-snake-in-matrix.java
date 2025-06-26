class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int pos = 0;
        for(String s : commands){
            if(s.equals("UP")){
                pos-=n;
            }
            else if(s.equals("DOWN")){
                pos+=n;
            }
            else if(s.equals("LEFT")){
                pos-=1;
            }
            else{
                pos +=1;
            }
        }
        return pos;
    }
}
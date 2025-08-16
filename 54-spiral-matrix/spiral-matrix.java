//Abdul's
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int cls=0;    //cls=columnStart
        int rs=0;     //res=rowStart

        int re=matrix.length-1;       //re=rowEnd
        int cle=matrix[0].length-1;   //cle=columnEnd 

        while(cls<=cle  &&  rs<=re){
            
            //direction[LEFT TO RIGHT]
            for(int i=cls;i<=cle;i++){
                ans.add(matrix[rs][i]);
            }
            rs++;

             //direction[TOP TO BOTTOM]
            for(int i=rs;i<=re;i++){
                ans.add(matrix[i][cle]);
            }
            cle--;

             //direction[RIGHT TO LEFT]
            if(rs<=re){
            for(int i=cle;i>=cls;i--){
                ans.add(matrix[re][i]);
            }
            re--;
            }

             //direction[BOTTOM TO TOP]
            if(cls<=cle){
            for(int i=re;i>=rs;i--){
                ans.add(matrix[i][cls]);
            }
            cls++;
            }
        }
       return ans;  
    }
}
class Solution {
    public static boolean isValid(int row,int col,List<String> b,int n){
        int row1 = row;
        int col1 = col;

        int row2 = row;
        int col2 = col;

        if(row>=0 && row<n && col>=0 && col<n){
            //col top
            for(int r=0;r<=row;r++){
                if(b.get(r).charAt(col)=='Q'){
                    return false;
                }
            }
            //row left
            for(int c=0;c<=col;c++){
                if(b.get(row).charAt(c)=='Q'){
                    return false;
                }
            }
            //left top diagonal
            while(col1>=0 && row1>=0){
                if(b.get(row1).charAt(col1)=='Q'){
                    return false;
                }
                col1--;
                row1--;
            }
            //right top diagonal
            while(col2<n && row2>=0){
                if(b.get(row2).charAt(col2)=='Q'){
                    return false;
                }
                col2++;
                row2--;
            }
        }
        return true;
    }
    public static void solve(int row,List<List<String>> boards,List<String> b,int n){
        //base case
        if(row>=n){
            boards.add(new ArrayList<>(b));
            return;
        }

        //recursive calls
        for(int col=0;col<n;col++){
            if(isValid(row,col,b,n)){
                String s = b.get(row);
                String md = s.substring(0,col)+'Q'+s.substring(col+1);
                b.set(row, md);
                solve(row+1,boards,b,n);
                String s2 = b.get(row);
                String md2 = s.substring(0,col)+'.'+s.substring(col+1);
                b.set(row, md2);
            }
        }

    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> boards = new ArrayList<>();
        List<String> b = new ArrayList<>();
        for(int i=0;i<n;i++){
            StringBuilder s = new StringBuilder("");
            for(int j=0;j<n;j++){
                s.append(".");
            }
            b.add(s.toString());
        }
        solve(0,boards,b,n);
        return boards;
    }
}
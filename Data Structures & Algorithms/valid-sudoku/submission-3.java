class Solution {
    public boolean isValidSudoku(char[][] board) {
      HashSet<Character>[] rows=new HashSet[9];
      HashSet<Character>[] columns=new HashSet[9];
      HashSet<Character>[] boxes=new HashSet[9]; 
      for(int i=0;i<9;i++){
        rows[i]=new HashSet<>();
        columns[i]=new HashSet<>();
        boxes[i]=new HashSet<>();
      } 

      for(int x=0;x<9;x++){
        for(int y=0;y<9;y++){
            if(board[x][y]=='.'){
                continue;
            }
            int boxindex= (x/3)*3+y/3;

            if(rows[x].contains(board[x][y])||columns[y].contains(board[x][y])||boxes[boxindex].contains(board[x][y])){
                return false;
            }
            rows[x].add(board[x][y]);
            columns[y].add(board[x][y]);
            boxes[boxindex].add(board[x][y]);
        }
      }
      return true;
    }
}

import java.util.*;
public class nQueen {
    public static boolean isSafe(int row,int col,char[][] board){
        //horizontal
        for(int j=0; j<board.length; j++) {
            if(board[row][j] == 'Q') {
                return false;
            }
        }

        //vertical
        for(int i=0; i<board.length; i++) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        //upper left
        int r = row;
        for(int c=col; c>=0 && r>=0; c--, r--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        //upper right
        r = row;
        for(int c=col; c<board.length && r>=0; r--, c++) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        //lower left
        r = row;
        for(int c=col; c>=0 && r<board.length; r++, c--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        //lower right
        for(int c=col; c<board.length && r<board.length; c++, r++) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        return true;
    }
    public static void saveBoard(char[][] board , List<List<String>> allboard){
        String row = " ";
        List<String> newBoard = new ArrayList<>();
        for(int i=0;i< board.length;i++){
            row = "";
            for(int j=0;j< board[0].length;j++){
                if (board[i][j] == 'Q') {
                    row += "Q";
                }else{
                    row += ".";
                }
            }
            newBoard.add(row);
        }
        allboard.add(newBoard);
    }
    public static void helper(char[][] board , List<List<String>> allboard , int col){
        if(col== board.length){
            saveBoard(board,allboard);
            return;
        }
        for(int i=0;i< board.length;i++){
            if(isSafe(i,col,board)){
                board[i][col]='Q';
                helper(board,allboard,col+1);
                board[i][col]='.';
            }
        }
    }
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoard = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board,allBoard,0);
        return allBoard;
    }
    public static void main(String[] args){
        int n=1;
        System.out.println(solveNQueens(n));
    }
}
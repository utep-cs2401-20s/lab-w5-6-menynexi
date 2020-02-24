public class SnakeGame{
    private boolean[][] game;
    private int[] headPosition = new int[2];
    private static int exhaustiveSearch;
    private static int recursiveCheck;



    //default constructor constructors
    public SnakeGame(){
        this.game = new boolean[1][1];
        //this.headPosition;
    }

    //basic constructor with input of 2D array
    public SnakeGame(boolean[][] givenBoard, int x, int y){
        //copies the array
        for(int i = 0; i < givenBoard.length; i++){
            for(int j = 0; j < givenBoard[i].length; j++){
                this.game[i][j] = givenBoard[i][j];
            }
        }
        this.headPosition[0] = x;
        this.headPosition[1] = y;
    }






    public static void main(String[] args){
        //I UPLOADING FROM A NEW LAPTOP
    }
}
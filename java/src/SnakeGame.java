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

    public static void printSnake(){
        for(int i = 0; i < this.game; i++){
            for(int j = 0; j < this.game[i]; j++){
                System.out.print(this.game[i][j]);
            }
            System.out.println("");
        }
    }

    public int neighbors(int row, int collum){
        int count = 0;
        //up
        if((row > 0) && (this.game[row + 1][collum ] == true) && (row != this.headPosition[0] && collum != this.headPosition[1])){
            count++;
        }
        //down
        if((row < this.game.length) && (this.game[row - 1][collum] == true) && (row != this.headPosition[0] && collum != this.headPosition[1])){
            count++;
        }
        //left
        if((collum > 0) && (this.game[row][collum - 1] == true) && (row != this.headPosition[0] && collum != this.headPosition[1])){
            count++;
        }
        //right
        if((collum < this.game.length) && (this.game[row][collum + 1] == true) && (row != this.headPosition[0] && collum != this.headPosition[1])){
            count++;
        }
        return count;
    }


    /*public int[] findTailExhaustive(){
        for(int i = 0; i < this.game.length; i++){
            for(int j = 0; j < this.game[i].length; j++){
                if((i != this.headPosition[0] && j != this.headPosition[1]) &&  )
            }
        }
    }*/

    //recursive material
    //int[] arr = new int[3];//index 0 = tail at x //index 1 = tail y // index 2 = length
    //int[] previndex = new int[2]; //cordinate x and cordinate y
    //int[] currindex = new int[2];//where you are in the array
    //boolean flag = false;
    //while(flag != true){
    //}
    //return arr;

    public static void main(String[] args){
        //I UPLOADING FROM A NEW LAPTOP
    }
}
//things I did to trouble shoot
//restart intelij
//restart my computer and intilij
//I deleted the file it was in and created a new module to see if it coul dtest it properly

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
        System.out.println("This is wrong ?");
        for(int i = 0; i < givenBoard.length; i++){
            for(int j = 0; j < givenBoard[i].length; j++){
                this.game[i][j] = givenBoard[i][j];
            }
        }
        this.headPosition[0] = x;
        this.headPosition[1] = y;
    }


    public void printSnake(){
        for(int i = 0; i < this.game.length; i++){
            for(int j = 0; j < this.game[i].length; j++){
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


    public int[] findTailExhaustive(){
        //this was used to test a case System.out.println("This is wrong");
        this.exhaustiveSearch = 1;
        int lengthOfSnake = 0;
        int[] tail = new int[3];

        for(int i = 0; i < this.game.length;i++){//checks the length
            for(int j = 0; j < this.game[i].length; j++){
                if(game[i][j] == true){
                    lengthOfSnake++;
                }
            }
        }

        for(int i = 0; i < this.game.length; i++){
            for(int j = 0; j < this.game[i].length; j++){
                if((i != this.headPosition[0] && j != this.headPosition[1]) && (neighbors(i,j) == 1)){//calls neighbors to cheack the
                    tail[0] = i;
                    tail[1] = j;
                    tail[2] = lengthOfSnake;
                }
                this.exhaustiveSearch++;
            }
        }
        return tail;
    }

    //recursive material
    //int[] arr = new int[3];//index 0 = tail at x //index 1 = tail y // index 2 = length
    //int[] previndex = new int[2]; //cordinate x and cordinate y
    //int[] currindex = new int[2];//where you are in the array
    //boolean flag = false;
    //while(flag != true){
    //}
    //return arr;
    //curr is not the head

    public int[] findTailRecursive(){
        return findTailRecursive(headPosition,headPosition);
    }

    private int[] findTailRecursive(int[] currentPosition, int[] previousPosition){
        this.recursiveCheck = 0;
        int[] tail = new int[3];
        //up
        if((currentPosition[0] > 0) && (this.game[currentPosition[0] + 1][currentPosition[1]] == true) && (currentPosition[0] != previousPosition[0] && currentPosition[1] != previousPosition[1])){
            this.recursiveCheck++;
            previousPosition[0] = currentPosition[0];
            previousPosition[1] = currentPosition[1];

            currentPosition[0] = currentPosition[0] + 1;
            currentPosition[1] = currentPosition[1];

            return findTailRecursive(currentPosition, previousPosition);
        }
        //down
        else if((currentPosition[0] < this.game.length) && (this.game[currentPosition[0] - 1][currentPosition[1]] == true) && (currentPosition[0] != previousPosition[0] && currentPosition[1] != previousPosition[1])){
            this.recursiveCheck++;
            previousPosition[0] = currentPosition[0];
            previousPosition[1] = currentPosition[1];

            currentPosition[0] = currentPosition[0] - 1;
            currentPosition[1] = currentPosition[1];

            return findTailRecursive(currentPosition, previousPosition);
        }
        //left
        else if((currentPosition[1] > 0) && (this.game[currentPosition[0]][currentPosition[1] - 1] == true) && (currentPosition[0] != previousPosition[0] && currentPosition[1] != previousPosition[1])){
            this.recursiveCheck++;
            previousPosition[0] = currentPosition[0];
            previousPosition[1] = currentPosition[1];

            currentPosition[0] = currentPosition[0];
            currentPosition[1] = currentPosition[1] - 1;

            return findTailRecursive(currentPosition, previousPosition);
        }
        //right
        else if((currentPosition[1] < this.game.length) && (this.game[currentPosition[0]][currentPosition[1] + 1] == true) && (currentPosition[0] != previousPosition[0] && currentPosition[1] != previousPosition[1])){
            this.recursiveCheck++;
            previousPosition[0] = currentPosition[0];
            previousPosition[1] = currentPosition[1];

            currentPosition[0] = currentPosition[0] + 1;
            currentPosition[1] = currentPosition[1];

            return findTailRecursive(currentPosition, previousPosition);
        }
        else{
            tail[0] = currentPosition[0];
            tail[1] = currentPosition[1];
            tail[2] = this.recursiveCheck;
            return tail;
        }
    }

    private void resetCounters(){
        this.recursiveCheck = 1;
        this.exhaustiveSearch = 1;
    }

    static int getRecursiveChecks(){
        return recursiveCheck;
    }

    static int getExhaustiveChecks(){
        return exhaustiveSearch;
    }

    public static void main(String[] args){
        System.out.println("test code");
    }//none of my code is being tested

}
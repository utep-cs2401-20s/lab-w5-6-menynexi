//import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.testng.annotations.AfterTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.testng.annotations.AfterTest;
import org.junit.jupiter.api.TestMethodOrder;


/*
I would like ot note that none of the test cases where tested because of an issue with intellij
I do not know why but none of the test cases could be tested even hen i clicked test
This is a new computer If possible I would like to speak to the IA for more help but please note that i did push my complete code corectly

*/

public class SnakeGameTest{

    @Test
    public void snakeTest1(){
        // this was used to test if it reads it but it does not System.out.println("This does not work");
        boolean f = false;
        boolean t = true;
        boolean[][] arr = {
                {f,t,f,f,f},
                {f,t,f,f,f},
                {f,t,f,f,f},
                {f,f,f,f,f},
        };

        int[] expectedTail = {3,1,3};
        SnakeGame case1 = new SnakeGame(arr,0,1);
        assertEquals(expectedTail, case1.findTailExhaustive());
    }

    @Test
    public void snakeTest2(){
        boolean f = false;
        boolean t = true;
        boolean[][] arr = {
                {f,t,f,t,f},
                {f,t,f,t,f},
                {f,t,t,t,f},
                {f,f,f,f,f},
        };

        int[] expectedTail = {0,3,7};
        SnakeGame case1 = new SnakeGame(arr,0,1);
        assertEquals(expectedTail, case1.findTailExhaustive());
    }

    @Test
    public void snakeTest3(){
        boolean f = false;
        boolean t = true;
        boolean[][] arr = {
                {f,t,f,t,t,t,f},
                {f,t,f,t,f,t,f},
                {f,t,t,t,f,t,f},
                {f,f,f,f,f,t,f},
        };

        int[] expectedTail = {5,4,12};
        SnakeGame case1 = new SnakeGame(arr,0,1);
        assertEquals(expectedTail, case1.findTailExhaustive());
    }

    @Test
    public void snakeTest4(){
        boolean f = false;
        boolean t = true;
        boolean[][] arr = {
                {f,t,f,t,t,t,f},
                {f,t,f,t,f,t,f},
                {f,t,t,t,f,t,f},
                {f,f,f,f,f,t,f},
        };

        int[] expectedTail = {5,4,12};
        SnakeGame case1 = new SnakeGame(arr,0,1);
        assertEquals(expectedTail, case1.findTailExhaustive());
    }

    @Test
    public void snakeTest5(){
        boolean f = false;
        boolean t = true;
        boolean[][] arr = {
                {f,t,t,t,f,f,f},
                {f,f,f,f,f,f,f}
        };

        int[] expectedTail = {0,3,3};
        SnakeGame case1 = new SnakeGame(arr,0,1);
        assertEquals(expectedTail, case1.findTailExhaustive());
    }

    @Test
    public void snakeTest6(){
        boolean f = false;
        boolean t = true;
        boolean[][] arr = {
                {f,t,f,t,t,t,f},
                {f,t,f,t,f,t,f},
                {f,t,t,t,f,t,f},
                {f,f,f,f,f,t,f},
        };

        int[] expectedTail = {0,1,12};
        SnakeGame case1 = new SnakeGame(arr,3,5);
        assertEquals(expectedTail, case1.findTailExhaustive());
    }

    @Test
    public void snakeTest7(){
        boolean f = false;
        boolean t = true;
        boolean[][] arr = {
                {f,f,f,t,t,t,f},
                {f,f,f,t,f,t,f},
                {f,t,t,t,f,t,f},
                {f,f,f,f,f,t,f},
        };

        int[] expectedTail = {2,1,12};
        SnakeGame case1 = new SnakeGame(arr,3,5);
        assertEquals(expectedTail, case1.findTailExhaustive());
    }

    @Test
    public void snakeTest8(){
        boolean f = false;
        boolean t = true;
        boolean[][] arr = {
                {f,t,f,f,f},
                {f,t,f,f,f},
                {f,t,f,f,f},
                {f,f,f,f,f},
        };

        int[] expectedTail = {3,1,3};
        SnakeGame case1 = new SnakeGame(arr,0,1);
        assertEquals(expectedTail, case1.findTailRecursive());
    }

    @Test
    public void snakeTest9(){
        boolean f = false;
        boolean t = true;
        boolean[][] arr = {
                {f,t,f,t,f},
                {f,t,f,t,f},
                {f,t,t,t,f},
                {f,f,f,f,f},
        };

        int[] expectedTail = {0,3,7};
        SnakeGame case1 = new SnakeGame(arr,0,1);
        assertEquals(expectedTail, case1.findTailRecursive());
    }

    @Test
    public void snakeTest10(){
        boolean f = false;
        boolean t = true;
        boolean[][] arr = {
                {f,t,f,t,t,t,f},
                {f,t,f,t,f,t,f},
                {f,t,t,t,f,t,f},
                {f,f,f,f,f,t,f},
        };

        int[] expectedTail = {5,4,12};
        SnakeGame case1 = new SnakeGame(arr,0,1);
        assertEquals(expectedTail, case1.findTailRecursive());
    }

    @Test
    public void snakeTest11(){
        boolean f = false;
        boolean t = true;
        boolean[][] arr = {
                {f,t,f,t,t,t,f},
                {f,t,f,t,f,t,f},
                {f,t,t,t,f,t,f},
                {f,f,f,f,f,t,f},
        };

        int[] expectedTail = {5,4,12};
        SnakeGame case1 = new SnakeGame(arr,0,1);
        assertEquals(expectedTail, case1.findTailRecursive());
    }

    @Test
    public void snakeTest12(){
        boolean f = false;
        boolean t = true;
        boolean[][] arr = {
                {f,t,t,t,f,f,f},
                {f,f,f,f,f,f,f}
        };

        int[] expectedTail = {0,3,3};
        SnakeGame case1 = new SnakeGame(arr,0,1);
        assertEquals(expectedTail, case1.findTailRecursive());
    }

    @Test
    public void snakeTest13(){
        boolean f = false;
        boolean t = true;
        boolean[][] arr = {
                {f,t,f,t,t,t,f},
                {f,t,f,t,f,t,f},
                {f,t,t,t,f,t,f},
                {f,f,f,f,f,t,f},
        };

        int[] expectedTail = {0,1,12};
        SnakeGame case1 = new SnakeGame(arr,3,5);
        assertEquals(expectedTail, case1.findTailRecursive());
    }

    @Test
    public void snakeTest14(){
        boolean f = false;
        boolean t = true;
        boolean[][] arr = {
                {f,f,f,t,t,t,f},
                {f,f,f,t,f,t,f},
                {f,t,t,t,f,t,f},
                {f,f,f,f,f,t,f},
        };

        int[] expectedTail = {2,1,10};
        SnakeGame case1 = new SnakeGame(arr,3,5);
        assertEquals(expectedTail, case1.findTailRecursive());
    }

    ////////////////////
    @Test
    public void snakeTest15(){
        boolean f = false;
        boolean t = true;
        boolean[][] arr = {
                {f,t,f,f,f},
                {f,t,f,f,f},
                {f,t,f,f,f},
                {f,f,f,f,f},
        };

        int[] expectedTail = {3,1,3};
        SnakeGame case1 = new SnakeGame(arr,0,1);
        case1.findTailExhaustive();
        assertEquals(expectedTail[2], case1.getExhaustiveChecks());
    }

    @Test
    public void snakeTest16(){
        boolean f = false;
        boolean t = true;
        boolean[][] arr = {
                {f,t,f,t,f},
                {f,t,f,t,f},
                {f,t,t,t,f},
                {f,f,f,f,f},
        };

        int[] expectedTail = {0,3,7};
        SnakeGame case1 = new SnakeGame(arr,0,1);
        case1.findTailExhaustive();
        assertEquals(expectedTail[2], case1.getExhaustiveChecks());
    }

    @Test
    public void snakeTest17(){
        boolean f = false;
        boolean t = true;
        boolean[][] arr = {
                {f,t,f,t,t,t,f},
                {f,t,f,t,f,t,f},
                {f,t,t,t,f,t,f},
                {f,f,f,f,f,t,f},
        };

        int[] expectedTail = {5,4,12};
        SnakeGame case1 = new SnakeGame(arr,0,1);
        case1.findTailExhaustive();
        assertEquals(expectedTail[2], case1.getExhaustiveChecks());
    }

    @Test
    public void snakeTest18(){
        boolean f = false;
        boolean t = true;
        boolean[][] arr = {
                {f,t,f,t,t,t,f},
                {f,t,f,t,f,t,f},
                {f,t,t,t,f,t,f},
                {f,f,f,f,f,t,f},
        };

        int[] expectedTail = {5,4,12};
        SnakeGame case1 = new SnakeGame(arr,0,1);
        case1.findTailExhaustive();
        assertEquals(expectedTail[2], case1.getExhaustiveChecks());
    }

    @Test
    public void snakeTest19(){
        boolean f = false;
        boolean t = true;
        boolean[][] arr = {
                {f,t,t,t,f,f,f},
                {f,f,f,f,f,f,f}
        };

        int[] expectedTail = {0,3,3};
        SnakeGame case1 = new SnakeGame(arr,0,1);
        case1.findTailExhaustive();
        assertEquals(expectedTail[2], case1.getExhaustiveChecks());
    }

    @Test
    public void snakeTest20(){
        boolean f = false;
        boolean t = true;
        boolean[][] arr = {
                {f,t,f,t,t,t,f},
                {f,t,f,t,f,t,f},
                {f,t,t,t,f,t,f},
                {f,f,f,f,f,t,f},
        };

        int[] expectedTail = {0,1,12};
        SnakeGame case1 = new SnakeGame(arr,3,5);
        case1.findTailExhaustive();
        assertEquals(expectedTail[2], case1.getExhaustiveChecks());
    }

    @Test
    public void snakeTest21(){
        boolean f = false;
        boolean t = true;
        boolean[][] arr = {
                {f,f,f,t,t,t,f},
                {f,f,f,t,f,t,f},
                {f,t,t,t,f,t,f},
                {f,f,f,f,f,t,f},
        };

        int[] expectedTail = {2,1,12};
        SnakeGame case1 = new SnakeGame(arr,3,5);
        case1.findTailExhaustive();
        assertEquals(expectedTail[2], case1.getExhaustiveChecks());
    }
    /////////

    @Test
    public void snakeTest22(){
        boolean f = false;
        boolean t = true;
        boolean[][] arr = {
                {f,t,f,f,f},
                {f,t,f,f,f},
                {f,t,f,f,f},
                {f,f,f,f,f},
        };

        int[] expectedTail = {3,1,3};
        SnakeGame case1 = new SnakeGame(arr,0,1);
        case1.findTailRecursive();
        assertEquals(expectedTail[2], case1.getRecursiveChecks());
    }

    @Test
    public void snakeTest23(){
        boolean f = false;
        boolean t = true;
        boolean[][] arr = {
                {f,t,f,t,f},
                {f,t,f,t,f},
                {f,t,t,t,f},
                {f,f,f,f,f},
        };

        int[] expectedTail = {0,3,7};
        SnakeGame case1 = new SnakeGame(arr,0,1);
        case1.findTailRecursive();
        assertEquals(expectedTail[2], case1.getRecursiveChecks());
    }

    @Test
    public void snakeTest24(){
        boolean f = false;
        boolean t = true;
        boolean[][] arr = {
                {f,t,f,t,t,t,f},
                {f,t,f,t,f,t,f},
                {f,t,t,t,f,t,f},
                {f,f,f,f,f,t,f},
        };

        int[] expectedTail = {5,4,12};
        SnakeGame case1 = new SnakeGame(arr,0,1);
        case1.findTailRecursive();
        assertEquals(expectedTail[2], case1.getRecursiveChecks());
    }

    @Test
    public void snakeTest25(){
        boolean f = false;
        boolean t = true;
        boolean[][] arr = {
                {f,t,f,t,t,t,f},
                {f,t,f,t,f,t,f},
                {f,t,t,t,f,t,f},
                {f,f,f,f,f,t,f},
        };

        int[] expectedTail = {5,4,12};
        SnakeGame case1 = new SnakeGame(arr,0,1);
        case1.findTailRecursive();
        assertEquals(expectedTail[2], case1.getRecursiveChecks());
    }

    @Test
    public void snakeTest26(){
        boolean f = false;
        boolean t = true;
        boolean[][] arr = {
                {f,t,t,t,f,f,f},
                {f,f,f,f,f,f,f}
        };

        int[] expectedTail = {0,3,3};
        SnakeGame case1 = new SnakeGame(arr,0,1);
        case1.findTailRecursive();
        assertEquals(expectedTail[2], case1.getRecursiveChecks());
    }

    @Test
    public void snakeTest27(){
        boolean f = false;
        boolean t = true;
        boolean[][] arr = {
                {f,t,f,t,t,t,f},
                {f,t,f,t,f,t,f},
                {f,t,t,t,f,t,f},
                {f,f,f,f,f,t,f},
        };

        int[] expectedTail = {0,1,12};
        SnakeGame case1 = new SnakeGame(arr,3,5);
        case1.findTailRecursive();
        assertEquals(expectedTail[2], case1.getRecursiveChecks());
    }

    @Test
    public void snakeTest28(){
        boolean f = false;
        boolean t = true;
        boolean[][] arr = {
                {f,f,f,t,t,t,f},
                {f,f,f,t,f,t,f},
                {f,t,t,t,f,t,f},
                {f,f,f,f,f,t,f},
        };

        int[] expectedTail = {2,1,12};
        SnakeGame case1 = new SnakeGame(arr,3,5);
        case1.findTailRecursive();
        assertEquals(expectedTail[2], case1.getRecursiveChecks());
    }





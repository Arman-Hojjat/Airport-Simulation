/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arman
 */
public class Ball {
      private int ballX;
    private int ballY ;
    private int xChange = 10;// amount to change the position of each cycle
    private int yChange = 10;
    private int xDir = 1;// +1 means to move right, -1 means move left
    public static int yDir = -1; // +1 means go down, -1 means go up
    
    public Ball(int x, int y){
        ballX = x;
        ballY = y;
    }
    
    public int setBallX(){
     /*  if ((ballX + xChange * xDir < DrawingArea.sLeft) || (ballX + xChange * xDir > DrawingArea.sRight)){
            xDir = xDir * -1; // x-direction multiplier switches direction
        }*/
        ballX = ballX + xChange * xDir;// update the x and y coordinates for the next draw cycle 
        return ballX;
    }
    public int setBallY() {
      /* if ((ballY + yChange * yDir < DrawingArea.sTop) || (ballY + yChange * yDir > DrawingArea.sBottom)){
           yDir = yDir * -1; // y-direction multiplier switches direction
        }*/
        ballY = ballY + yChange * yDir; 
        return ballY;
    }
}

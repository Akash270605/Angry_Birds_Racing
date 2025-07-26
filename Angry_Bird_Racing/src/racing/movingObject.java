/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racing;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public abstract class movingObject implements Comparable{
    static double shift;
    Image img;
    int width;
    int height;
    int x;
    int y;
    int maxSpeed;
    int speed , speedL;
    int acceleration;
    int topY;
    int bottomY;
    Stance stance;
    Is who;
    
    abstract void go();
    abstract void drawParticipant(Graphics g);
    
    public Rectangle getRect(){
        return new Rectangle(x, y, width, height);
    }
    
    @Override
    public int compareTo(Object o){ //sort objects
        int res = 0;
        movingObject compared = (movingObject ) o;
        if(compared.x < this.x){
            res = 1;
        }
        if(compared.x > this.x){
            res = -1;
        }
        return res;
    }
}

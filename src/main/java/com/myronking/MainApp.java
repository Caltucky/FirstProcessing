package main.java.com.myronking;

import main.java.com.myronking.shapes.MyEllipse;
import main.java.com.myronking.shapes.MyPoint;
import main.java.com.myronking.shapes.MyRect;
import processing.core.PApplet;

import java.awt.*;

/**
 * Created by Myron on 8/24/2016.
 */
public class MainApp extends PApplet {

    MyEllipse theEllipse;
    MyRect theRect;
    MyPoint A;
    MyPoint B;

    public static void main(String[] args) {
        PApplet.main("main.java.com.myronking.MainApp", args);
    }

    public void settings() {
//        fullScreen(); // use fullScreen(2) to put on second monitor
        size(800,800);
    }


    public void setup() {
        frameRate(90);
        theEllipse = new MyEllipse(this);
        theRect = new MyRect(this);
        A = new MyPoint(width/4, height/4);
        B = new MyPoint(width/2, height/2);
    }

/*
    public void draw() {
        if (mousePressed) {
            theEllipse.doSomething();
//        } else {
//            rectMode(CENTER);
//            theRect.doSomething();
        }
    }
*/

    public void draw() {
        background(0);
        stroke(255,0,0);
        line(A.x,A.y,B.x,B.y);
        if(mousePressed &&
                mouseX > A.x - 20 &&
                mouseX < A.x + 20 &&
                mouseY < A.y + 20 &&
                mouseY > A.y - 20
                ) {
            A.x = mouseX;
            A.y = mouseY;
        }
        if(mousePressed &&
                mouseX > B.x - 20 &&
                mouseX < B.x + 20 &&
                mouseY < B.y + 20 &&
                mouseY > B.y - 20
                ) {
            B.x = mouseX;
            B.y = mouseY;
        }
    }

    public void keyPressed() {
        if(key=='c') {
            background(0);
        }
    }

}

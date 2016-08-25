package main.java.com.myronking;

import main.java.com.myronking.shapes.MyEllipse;
import main.java.com.myronking.shapes.MyRect;
import processing.core.PApplet;

/**
 * Created by Myron on 8/24/2016.
 */
public class MainApp extends PApplet {

    MyEllipse theEllipse;
    MyRect theRect;

    public static void main(String[] args) {
        PApplet.main("main.java.com.myronking.MainApp", args);
    }

    public void settings() {
//        fullScreen(); // use fullScreen(2) to put on second monitor
        size(800,600);
    }


    public void setup() {
        theEllipse = new MyEllipse(this);
        theRect = new MyRect(this);
        background(0);
    }

    public void draw() {
        if (mousePressed) {
            theEllipse.doSomething();
//        } else {
//            theRect.doSomething();
        }
    }

    public void keyPressed() {
        if(key=='c') {
            background(0);
        }
    }

}

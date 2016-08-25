package main.java.com.myronking.shapes;

import processing.core.PApplet;

/**
 * Created by Myron on 8/24/2016.
 */
public class MyEllipse {

    PApplet p;

    public MyEllipse(PApplet p){
        this.p = p;
    }

    public void doSomething(){
        int ellipseWidth = 10;
        int ellipseHeight = 10;
        p.stroke(255,0,0);
        p.fill(255,0,0);
        p.ellipse(p.mouseX, p.mouseY,ellipseWidth,ellipseHeight);
    }

}

package main.java.com.myronking.shapes;

import processing.core.PApplet;

/**
 * Created by Myron on 8/24/2016.
 */
public class MyRect {


    PApplet p;

    public MyRect(PApplet p){
        this.p = p;
    }

    public void doSomething(){
        int rectWidth = 60;
        int rectHeight = 120;
        p.stroke(0);
        p.fill(255,0,0);
        p.rect(p.mouseX, p.mouseY,rectWidth,rectHeight);
    }
}

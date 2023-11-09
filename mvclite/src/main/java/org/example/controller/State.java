package org.example.controller;

import org.example.controller.action.ActionDraw;
import org.example.controller.action.ActionInterface;
import org.example.model.Model;
import org.example.model.MyShape;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;

public class State {
    //  RectangularShape shape;
    MyShape myShape;
    Model model;
    ActionInterface actionInterface;

    public State(Model model) {
        this.model = model;
        actionInterface = new ActionDraw(model);
        myShape = new MyShape(Color.BLUE,new Ellipse2D.Double());
    }

    public void setRectangularShape(RectangularShape shape) {
        //this.shape = shape;
        myShape.setShape(shape);
        actionInterface.setSampleShape(myShape);
    }
    public void setActionInterface(ActionInterface b) {
        actionInterface = b;
        actionInterface.setModel(model);

    }



    public ActionInterface getActionInterface() {
        return actionInterface;
    }

    public void setColor(Color c) {
        myShape.setcolor(c);
        actionInterface.setSampleShape(myShape);
    }
}


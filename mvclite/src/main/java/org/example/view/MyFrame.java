package org.example.view;

import org.example.controller.State;

import javax.swing.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;


import org.example.view.menu.SwitchAction;
import org.example.view.menu.SwitchColor;
import org.example.view.menu.SwitchShape;
import org.example.view.menu.SwitchState;


public class MyFrame extends JFrame {
    MyPanel panel;
    State state;



    public MyFrame(MyPanel panel,State state) {
        this.state = state;
        /////////////////////////////// menu /////////////////////
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        ArrayList<Action> menuItems = new ArrayList<>();
        menuItems.add(new SwitchState("Rectangle",null,
                new SwitchShape(state,new Rectangle2D.Double())));
        menuItems.add(new SwitchState("Ellips",null,
                new SwitchShape(state,new Ellipse2D.Double())));
        JMenu menu = new JMenu("Shape");
        menu.add(menuItems.get(0));
        menu.add(menuItems.get(1));
        menuBar.add(menu);
        JMenu action = new JMenu("Action");
        JMenuItem Draw = new JMenuItem(new SwitchState("Draw",null,new SwitchAction(state,new org.example.controller.action.ActionDraw())));
        JMenuItem Move = new JMenuItem(new SwitchState("Move",null,new SwitchAction(state,new org.example.controller.action.ActionMove())));
        action.add(Draw);
        action.add(Move);
        menuBar.add(action);
        JMenu MenuColor = new JMenu("Color");
        menuItems.add(new SwitchState("Color", null, new SwitchColor(state)));
        MenuColor.add(menuItems.get(2));
        menuBar.add(MenuColor);


        this.panel = panel;
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);

    }
}

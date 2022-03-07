/**
 * This program is a Graphical Circle program.
 *
 * @author Sunday Jacob Nwanyim & Aanuoluwapo Orioke
 *
 * Andrew ID: snwanyim and aorioke
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *         
 *
 */


import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class GraphicalCircle extends JPanel
{
    private Color colorOfCircle;
    private Point center;
    private int diameter;
    
    public Color getColorOfCircle()
    {
        return colorOfCircle;
    }

    public void setColorOfCircle(Color color)
    {
        colorOfCircle = color;
    }

    public Point getCenter()
    {
        return center;
    }

    public void setCenter(Point centerPoint)
    {
        center = centerPoint;
    }

    public int getDiameter()
    {
        return diameter;
    }

    public void setDiameter(int diameterWidth)
    {
        diameter = diameterWidth;
    }

    public GraphicalCircle()
    {
        colorOfCircle = Color.WHITE;
        center = new Point(200, 200);
        diameter = 200;
    }
    
    public GraphicalCircle(Color color)
    {
        colorOfCircle = color;
        center = new Point(200, 200);
        diameter = 200;
    }
    
    public GraphicalCircle(Color color, Point centerPoint, int diameterWidth)
    {
        colorOfCircle = color;
        center = centerPoint;
        diameter = diameterWidth;
    }
    
    public GraphicalCircle(Color color, int centerX, int centerY, int diameterWidth)
    {
        colorOfCircle = color;
        center = new Point(centerX, centerY);
        diameter = diameterWidth;
    }
    
    public Rectangle calcRectCorner(int centerX, int centerY, int diameterWidth)
    {
        Rectangle rec;
        int radius, topLeftX, topLeftY;
        
        radius = diameterWidth / 2;
        topLeftX = centerX - radius;
        topLeftY = centerY - radius;
        
        rec = new Rectangle(topLeftX, topLeftY, diameterWidth, diameterWidth);
//        rec.
        return rec;
    }
    
    public void paintComponent (Graphics g)
    {
        super.paintComponent(g);
        
        g.setColor(colorOfCircle);
        fillCircle(g, center.x, center.y, diameter);
    }
    
    public void fillCircle(Graphics g, int centerX, int centerY, int diameterWidth)
    {
        int topLeftX, topLeftY;
        Rectangle boundedRect;
        
//        radius = diameterWidth / 2;
//        topLeftX = centerX - radius;
//        topLeftY = centerY - radius;
        
        boundedRect = calcRectCorner(centerX, centerY, diameterWidth);
        
        topLeftX = boundedRect.x;
        topLeftY = boundedRect.y;
        
        g.setColor(Color.BLACK);
        g.drawOval(topLeftX, topLeftY, diameterWidth, diameterWidth);
        g.setColor(colorOfCircle);
        g.fillOval(topLeftX, topLeftY, diameterWidth, diameterWidth);
    }
    
}

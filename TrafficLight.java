/**
 * This program is a GuessWord program.
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

public class TrafficLight extends JPanel
{
    private GraphicalCircle redCircle;
    private GraphicalCircle greenCircle;
    private GraphicalCircle yellowCircle;
    private boolean redOn;
    private boolean greenOn;
    private boolean yellowOn;
    private enum State {STOP, GO, CAUTION};
    private State status;
    
    public TrafficLight()
    {
        redCircle = new GraphicalCircle(Color.RED);
        greenCircle = new GraphicalCircle(new Color(0, 100, 0));
        yellowCircle = new GraphicalCircle(new Color(187, 187, 0));
        redOn = true;
        greenOn = false;
        yellowOn = false;
        status = State.STOP;
    }
    
    public TrafficLight(boolean rOn, boolean gOn, boolean yOn)
    {
        redCircle = new GraphicalCircle(Color.RED);
        greenCircle = new GraphicalCircle(new Color(0, 100, 0));
        yellowCircle = new GraphicalCircle(new Color(187, 187, 0));
        redOn = rOn;
        greenOn = gOn;
        yellowOn = yOn;
        status = State.STOP;
    }
    
    public TrafficLight(boolean rOn, boolean gOn, boolean yOn, State stats)
    {
        redCircle = new GraphicalCircle(Color.RED);
        greenCircle = new GraphicalCircle(Color.GREEN);
        yellowCircle = new GraphicalCircle(Color.YELLOW);
        redOn = rOn;
        greenOn = gOn;
        yellowOn = yOn;
        status = stats;
    }
    
    public TrafficLight(State stats)
    {
        redCircle = new GraphicalCircle(Color.RED);
        greenCircle = new GraphicalCircle(new Color(0, 100, 0));
        yellowCircle = new GraphicalCircle(new Color(187, 187, 0));
        redOn = true;
        greenOn = false;
        yellowOn = false;
        status = stats;
    }
    
    public GraphicalCircle getRedCircle() { return redCircle; }
    public GraphicalCircle getGreenCircle() { return greenCircle; }
    public GraphicalCircle getYellowCircle() { return yellowCircle; }
    
    public void setRedCircle(GraphicalCircle rCircle) { redCircle = rCircle; }
    public void setGreenCircle(GraphicalCircle gCircle) { greenCircle = gCircle; }
    public void setYellowCircle(GraphicalCircle yCircle) { yellowCircle = yCircle; }
    
    public boolean isRedOn() { return redOn; }
    public boolean isGreenOn() { return greenOn; }
    public boolean isYellowOn() { return yellowOn; }
    
    public void setRedOn() 
    { 
        redCircle.setColorOfCircle(Color.RED);
        greenCircle.setColorOfCircle(new Color(0, 100, 0));
        yellowCircle.setColorOfCircle(new Color(187, 187, 0));
        redOn = true;
        greenOn = false;
        yellowOn = false;
    }
    public void setGreenOn() 
    {
        redCircle.setColorOfCircle(new Color(187, 0, 0));
        greenCircle.setColorOfCircle(Color.GREEN);
        yellowCircle.setColorOfCircle(new Color(187, 187, 0));
        redOn = false;
        greenOn = true;
        yellowOn = false;
    }
    public void setYellowOn() 
    {
        redCircle.setColorOfCircle(new Color(187, 0, 0));
        greenCircle.setColorOfCircle(new Color(0, 100, 0));
        yellowCircle.setColorOfCircle(Color.YELLOW);
        redOn = false;
        greenOn = false;
        yellowOn = true;
    }

    public boolean isGo() { return status == State.GO; }
    public boolean isRed() { return status == State.STOP; }
    public boolean isYellow() { return status == State.CAUTION; }

    public void setGo()
    {
        setGreenOn();
        status = State.GO;
    }
    public void setStop()
    {
        setRedOn();
        status = State.STOP;
    }
    public void setCaution()
    {
        setYellowOn();
        status = State.CAUTION;
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
         //write methods to calculate center of the three cixlrres
        redCircle.fillCircle(g, 100, 100, 200);
        yellowCircle.fillCircle(g, 100, 320, 200);
        greenCircle.fillCircle(g, 100, 540, 200);
    }
    
    
    public void turnRedOff() 
    {
        redCircle.setColorOfCircle(new Color(187, 0, 0));
        redOn = false;
    }
    public void turnGreenOff() 
    {
        greenCircle.setColorOfCircle(new Color(0, 100, 0));
        greenOn = false;
    }
    public void turnYellowOff() 
    {
        yellowCircle.setColorOfCircle(new Color(187, 187, 0));
        yellowOn = false;
    }
    
    public void turnRedOn() 
    {
        redCircle.setColorOfCircle(Color.RED);
        redOn = true;
    }
    public void turnGreenOn() 
    {
        greenCircle.setColorOfCircle(Color.GREEN);
        greenOn = true;
    }
    public void turnYellowOn() 
    {
        yellowCircle.setColorOfCircle(Color.YELLOW);
        yellowOn = true;
    }
    
    
    public State change()
    {
        if (status == State.GO)
        {
            setYellowOn();
            status = State.CAUTION;
            return status;
        }
        if (status == State.CAUTION)
        {
            setRedOn();
            status = State.STOP;
            return status;
        }
//        return State.STOP;
        else
        {
            setGreenOn();
            status = State.GO;
            return status;
        }
    }
    
}

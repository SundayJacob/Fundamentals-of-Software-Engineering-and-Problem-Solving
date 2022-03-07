/**
 * This is HangmanGUI Class program.
 *
 * @author Sunday Jacob Nwanyim
 *
 * Andrew ID:  snwanyim
 * 
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *         
 *
 */

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.ArrayList;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HangmanGUI extends LayoutGUI implements StringHandler
{
    private int won = 0;
    private int lost = 0;
    private int noOfGames = 0;
    ArrayList<SingleUseButton> button = new ArrayList<SingleUseButton>();
    HangedMan man = new HangedMan(200, 200);
    JSecretString string;
    PhraseList phrases = new PhraseList();
    JPanel  namePanel = new JPanel();
    JPanel  namePane2 = new JPanel();
    JPanel  namePane3 = new JPanel();
    JPanel  namePane4 = new JPanel();

    
    JTextField numGames = new JTextField(10);
    JTextField wonGames = new JTextField(10);
    JTextField lostGames = new JTextField(10);
    JTextField secretString = new JTextField(20);
    
    JLabel  l1  = new JLabel("Number of Games: ");
    JLabel  l2  = new JLabel("WON: ");
    
    JLabel  l3  = new JLabel("LOST: ");
    JLabel  l4  = new JLabel("NAME: SUNDAY JACOB NWANYIM");
    JLabel  l5  = new JLabel("ANDREWID: snwanyim");
    JButton play = new JButton("Play");
    JButton reset = new JButton("Reset");


    public HangmanGUI()
    {
        PlayResetEventHandler event = new PlayResetEventHandler();
        play.addActionListener(event);
        reset.addActionListener(event);
    }
    
    public HangmanGUI(String filename)
    {
        PlayResetEventHandler event = new PlayResetEventHandler();
        play.addActionListener(event);
        reset.addActionListener(event);
        if (!filename.equals(""))
        {
            //filename = args[0];
           phrases.readInPhrases(filename);
        }
        else if (filename.equals(""))
        {
            //filename = args[0];
          System.out.println("Please Enter phrase");
        }
        
    }

    @Override
    public void processString(String text)
    {
        // TODO Auto-generated method stub
        if (secretString.getText().equals(string.uncover(text)))
        {
            man.addBodyPart();
           
        }
        
        else if (!secretString.getText().equals(string.uncover(text)))
        {
            secretString.setText(string.uncover(text));
           
        }
        
        if(man.isHanged())
        {
            noOfGames++;
            lost++;
            gameInfo(noOfGames, won);
            JOptionPane.showMessageDialog(getParent(), "You have lost the game");
        }
        
        else if(!man.isHanged() && string.equals(secretString.getText()))
        {
            noOfGames++;
            won++;
            gameInfo(noOfGames, won);
            JOptionPane.showMessageDialog(getParent(), "You have won the game");
        }
        
        //noOfGames = won + lost;
       
        
        //System.out.println(string.uncover(text));
        // uncovering letters

    }
    
    void gameInfo(int numOfGame, int numWon)
    {
        numGames.setText(String.valueOf(numOfGame));
        wonGames.setText(String.valueOf(numWon));
        String lostgames = String.valueOf(numOfGame - numWon);
        lostGames.setText(lostgames);
    }

    @Override
    public void addComponents(JFrame theFrame)
    {
        // TODO Auto-generated method stub
        Container c = theFrame.getContentPane();
        c.setLayout(new GridLayout(2,1,0,3));
        c.setBackground(Color.white);
        phrases.addPhrase("Hello World!");
        phrases.addPhrase("Hi World!");
        string = new JSecretString(phrases.getRandomPhrase());
        
        namePane2.setLayout(new GridLayout(1,2));
        namePane3.setLayout(new GridLayout(5,2,3,3));
        namePane4.setLayout(new GridLayout(1,1));
        
        
        namePane3.add(l4);
        namePane3.add(l5);


        namePane3.add(l1);
       

        
        numGames.setEnabled(false);
        numGames.setBackground(getBackground());
        numGames.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        numGames.setText("0");
        numGames.setDisabledTextColor(Color.black);
        
        wonGames.setEnabled(false);
        wonGames.setBackground(getBackground());
        wonGames.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        wonGames.setDisabledTextColor(Color.black);
        wonGames.setText("0");
        //wonGames.setDisabledTextColor(getBackground());
        
        lostGames.setEnabled(false);
        lostGames.setBackground(getBackground());
        lostGames.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lostGames.setDisabledTextColor(Color.black);
        lostGames.setText("0");
        //lostGames.setDisabledTextColor(getBackground());
        
        secretString.setEnabled(false);
        secretString.setBackground(getBackground());
        secretString.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        secretString.setText(string.toString());
        secretString.setHorizontalAlignment(JTextField.CENTER);
        secretString.setDisabledTextColor(Color.black);



        namePane4.add(secretString);
        namePane3.add(numGames);
        namePane3.add(l2);
//        namePane3.add("");
        namePane3.add(l3);
        namePane3.add(wonGames);
        //namePane3.add(new JTextField(10.setEnabled(false));
        namePane3.add(lostGames);
        namePane3.add(namePane4);

        
        
        
        
        
        
        
        namePane2.add(namePane3);

        namePane2.add(man);
        //namePane2.add(namePane4);




        button = SingleUseButton.getLetterButtons(this);
        namePanel.setLayout(new GridLayout(4,7));

        for(int i =0; i<button.size(); i++)
        {
            button.get(i).setEnabled(false);
            namePanel.add(button.get(i));
           
        }
        
        namePanel.add(play);
        namePanel.add(reset);
        c.add(namePane2);
        


        c.add(namePanel);
        
    }
    
    public void reset(JButton b)
    {
       if(b.getText().equals(play.getText()))
       {
           for(int i =0; i<button.size(); i++)
           {
               button.get(i).setEnabled(true);
              
              
           }
           b.setEnabled(false);
       }
       else
       {
           man.reset();
           string.setSecretString(phrases.getRandomPhrase());
           secretString.setText(string.toString());
           for(int i =0; i<button.size(); i++)
           {
               button.get(i).setEnabled(true); 
           }
//           numGames.setText("0");
//           wonGames.setText("0");
//           lostGames.setText("0");

           


       }
    }
    
    class   PlayResetEventHandler implements ActionListener
    {
   
    public void actionPerformed(ActionEvent e)
    {
        JButton b;
        b = (JButton) e.getSource();
        // Note: Why all the casting? Just to show you something interesting ...
        //       See if you can figure it out (optional).
        reset(b);
       
    }

    }
    
}
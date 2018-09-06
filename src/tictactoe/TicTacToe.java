package tictactoe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class TicTacToe extends JFrame 
{
    private int Player=1; // variable to know x or o will play and who won x or o.
    private int who=1; // variable to know will play single or multi play.
    private int winxl=0; //How many times X won?
    private int drawl=0; //How many times drawn?
    private int winol=0; //How many times O won?
    
    
    private JButton sq1,sq2,sq3,sq4,sq5,sq6,sq7,sq8,sq9; //The Border.
    private JRadioButton OnePlayer,TwoPlayers; //to choose single or multi play.
    private ButtonGroup group; // for the radio button.
    private JLabel space,winx,wino,draw,wonx,wono,draw1; //the resault.
    
 
    public TicTacToe()
    {
        super("Tic Tac Toe"); //title.
        setLayout(new GridLayout(6,3)); //the components will located as 6 rows and 3 column.
        
        OnePlayer = new JRadioButton("One Player",true); // "true" to make single (one) player the default choose.
        OnePlayer.setFont(new Font("Arial", Font.PLAIN, 20)); //the font of text in radio button.
        add(OnePlayer); //add radio button.
        
        space = new JLabel(" "); //just for the design.
        add(space); //add it.
        
        TwoPlayers = new JRadioButton("Two Players"); 
        TwoPlayers.setFont(new Font("Arial", Font.PLAIN, 20)); //the font of text in radio button.
        add(TwoPlayers); //add it.
        
        group = new ButtonGroup();  //must choose just one.
        group.add(OnePlayer); //add oneplayer radio button to the group.
        group.add(TwoPlayers); //add Twoplayer radio button to the group.       
        
        OnePlayer.addItemListener(new HandlerOne()); //add an itemlistener to oneplayer radio button.
        TwoPlayers.addItemListener(new HandlerTwo()); //add an itemlistener to twoplayer radio button.
        
        sq1 = new JButton("1"); //first square in the border.
        sq1.setFont(new Font("Arial", Font.PLAIN, 40)); //font of the text.
        add(sq1); // add it.
        sq1.addActionListener(
                                new ActionListener()
                                {
                                    public void actionPerformed(ActionEvent e)
                                    { 
                                        if(sq1.getText().equals("1"))
                                        {
                                            if(who==2)
                                            {
                                                if(Player==1)
                                                    sq1.setText("X");
                                                else
                                                    sq1.setText("O");
                                        
                                                CheckWin();
                                                
                                            }else if(who==1)    
                                            {
                                                sq1.setText("X");
                                                CheckWin(); 
                                                CheckToWin();
                                            }
                                        }
                                        else
                                        {
                                            JOptionPane.showMessageDialog(null, "Invalid Move");
                                        }
                                    }                                              
                                }
                             );
        
        sq2 = new JButton("2");
        sq2.setFont(new Font("Arial", Font.PLAIN, 40));
        add(sq2);
        sq2.addActionListener(
                                new ActionListener()
                                {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        if(sq2.getText().equals("2"))
                                        {
                                            if(who==2)
                                            {
                                                if(Player==1)
                                                    sq2.setText("X");
                                                else
                                                    sq2.setText("O");
                                        
                                                CheckWin();
                                                
                                            }else if(who==1)    
                                            {
                                                sq2.setText("X");
                                                CheckWin(); 
                                                CheckToWin();
                                            }
                                        }
                                        else
                                        {
                                            JOptionPane.showMessageDialog(null, "Invalid Move");
                                        }
                                    }                                              
                                }
                             );
        
        sq3 = new JButton("3");
        sq3.setFont(new Font("Arial", Font.PLAIN, 40));
        add(sq3);
         sq3.addActionListener(
                                new ActionListener()
                                {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        if(sq3.getText().equals("3"))
                                        {
                                            if(who==2)
                                            {
                                                if(Player==1)
                                                    sq3.setText("X");
                                                else
                                                    sq3.setText("O");
                                        
                                                CheckWin();
                                                
                                            }else if(who==1)    
                                            {
                                                sq3.setText("X");
                                                CheckWin(); 
                                                CheckToWin();
                                            }
                                        }
                                        else
                                        {
                                            JOptionPane.showMessageDialog(null, "Invalid Move");
                                        }
                                    }                                              
                                }
                             );
        
        sq4 = new JButton("4");
        sq4.setFont(new Font("Arial", Font.PLAIN, 40));
        add(sq4);
         sq4.addActionListener(
                                new ActionListener()
                                {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        if(sq4.getText().equals("4"))
                                        {
                                            if(who==2)
                                            {
                                                if(Player==1)
                                                    sq4.setText("X");
                                                else
                                                    sq4.setText("O");
                                        
                                                CheckWin();
                                                
                                            }else if(who==1)    
                                            {
                                                sq4.setText("X");
                                                CheckWin(); 
                                                CheckToWin();
                                            }
                                        }
                                        else
                                        {
                                            JOptionPane.showMessageDialog(null, "Invalid Move");
                                        }
                                    }                                              
                                }
                             );
        
        sq5 = new JButton("5");
        sq5.setFont(new Font("Arial", Font.PLAIN, 40));
        add(sq5);
         sq5.addActionListener(
                                new ActionListener()
                                {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        if(sq5.getText().equals("5"))
                                        {                                           
                                           if(who==2)
                                            {
                                                if(Player==1)
                                                    sq5.setText("X");
                                                else
                                                    sq5.setText("O");
                                        
                                                CheckWin();
                                                
                                            }else if(who==1)    
                                            {
                                                sq5.setText("X");
                                                CheckWin(); 
                                                CheckToWin();
                                            }
                                        }
                                        else
                                        {
                                            JOptionPane.showMessageDialog(null, "Invalid Move");
                                        }
                                    }                                              
                                }
                             );
        
        sq6 = new JButton("6");
        sq6.setFont(new Font("Arial", Font.PLAIN, 40));
        add(sq6);
         sq6.addActionListener(
                                new ActionListener()
                                {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        if(sq6.getText().equals("6"))
                                        {
                                             if(who==2)
                                            {
                                                if(Player==1)
                                                    sq6.setText("X");
                                                else
                                                    sq6.setText("O");
                                        
                                                CheckWin();
                                                
                                            }else if(who==1)    
                                            {
                                                sq6.setText("X");
                                                CheckWin(); 
                                                CheckToWin();
                                            }
                                        }
                                        else
                                        {
                                            JOptionPane.showMessageDialog(null, "Invalid Move");
                                        }
                                    }                                              
                                }
                             );
        
        sq7 = new JButton("7");
        sq7.setFont(new Font("Arial", Font.PLAIN, 40));
        add(sq7);
         sq7.addActionListener(
                                new ActionListener()
                                {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        if(sq7.getText().equals("7"))
                                        {
                                             if(who==2)
                                            {
                                                if(Player==1)
                                                    sq7.setText("X");
                                                else
                                                    sq7.setText("O");
                                        
                                                CheckWin();
                                                
                                            }else if(who==1)    
                                            {
                                                sq7.setText("X");
                                                CheckWin(); 
                                                CheckToWin();
                                            }
                                        }
                                        else
                                        {
                                            JOptionPane.showMessageDialog(null, "Invalid Move");
                                        }
                                    }                                              
                                }
                             );
        
        sq8 = new JButton("8");
        sq8.setFont(new Font("Arial", Font.PLAIN, 40));
        add(sq8);
         sq8.addActionListener(
                                new ActionListener()
                                {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        if(sq8.getText().equals("8"))
                                        {
                                             if(who==2)
                                            {
                                                if(Player==1)
                                                    sq8.setText("X");
                                                else
                                                    sq8.setText("O");
                                        
                                                CheckWin();
                                                
                                            }else if(who==1)    
                                            {
                                                sq8.setText("X");
                                                CheckWin(); 
                                                CheckToWin();
                                            }
                                        }
                                        else
                                        {
                                            JOptionPane.showMessageDialog(null, "Invalid Move");
                                        }
                                    }                                              
                                }
                             );
        
        sq9 = new JButton("9");
        sq9.setFont(new Font("Arial", Font.PLAIN, 40));
        add(sq9);
         sq9.addActionListener(
                                new ActionListener()
                                {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        if(sq9.getText().equals("9"))
                                        {
                                             if(who==2)
                                            {
                                                if(Player==1)
                                                    sq9.setText("X");
                                                else
                                                    sq9.setText("O");
                                        
                                                CheckWin();
                                                
                                            }else if(who==1)    
                                            {
                                                sq9.setText("X");
                                                CheckWin(); 
                                                CheckToWin();
                                            }
                                        }
                                        else
                                        {
                                            JOptionPane.showMessageDialog(null, "Invalid Move");
                                        }
                                    }                                              
                                }
                             );  
                             
         winx = new JLabel("      X");
         winx.setFont(new Font("Arial", Font.PLAIN, 40));
         add(winx);
         
         draw = new JLabel("   draw ");
         draw.setFont(new Font("Arial", Font.PLAIN, 40));
         add(draw);
         
         wino = new JLabel("      O");
         wino.setFont(new Font("Arial", Font.PLAIN, 40));
         add(wino);
         
         wonx = new JLabel("      "+winxl);
         wonx.setFont(new Font("Arial", Font.PLAIN, 40));
         add(wonx);
         
         draw1 = new JLabel("      "+drawl);
         draw1.setFont(new Font("Arial", Font.PLAIN, 40));
         add(draw1);
         
         wono = new JLabel("      "+winol);
         wono.setFont(new Font("Arial", Font.PLAIN, 40));
         add(wono);
    }
    
    private class HandlerOne implements ItemListener
    {
        public void itemStateChanged(ItemEvent event)
        {
            who=1;
            Reset();
        }
    }
    
    private class HandlerTwo implements ItemListener
    {
        public void itemStateChanged(ItemEvent event)
        {
            who=2;
            Reset();  
        }
    }
    
    public void Reset()
    {
        sq1.setText("1");
        sq2.setText("2");
        sq3.setText("3");
        sq4.setText("4");
        sq5.setText("5");
        sq6.setText("6");
        sq7.setText("7");
        sq8.setText("8");
        sq9.setText("9");
        
        Player=1;
    }
    
    public void CheckWin()
    {
        if(Player==1)
            Player=2;
        else
            Player=1;
        
        if(sq1.getText().equals(sq2.getText()) && sq1.getText().equals(sq3.getText()))
        {
            if(sq1.getText().equals("X"))
            {
                if(who==2)
                {
                    JOptionPane.showMessageDialog(null, "Player 1 WON!");
                    
                }else if(who==1)
                {
                    JOptionPane.showMessageDialog(null, "Human WON!");
                }
                winxl++;
                wonx.setText("      "+winxl);
            }
            else
            {
                if(who==2)
                {
                    JOptionPane.showMessageDialog(null, "Player 2 WON!");
                    
                }else if(who==1)
                {
                    JOptionPane.showMessageDialog(null, "Computer WON!");
                }
                winol++;
                wono.setText("      "+winol);
            }
            
            Reset();  
        }
        else if(sq1.getText().equals(sq5.getText()) && sq1.getText().equals(sq9.getText()))
        {
           if(sq1.getText().equals("X"))
            {
                if(who==2)
                {
                    JOptionPane.showMessageDialog(null, "Player 1 WON!");
                    
                }else if(who==1)
                {
                    JOptionPane.showMessageDialog(null, "Human WON!");
                }
                winxl++;
                wonx.setText("      "+winxl);
            }
           else
            {
                if(who==2)
                {
                    JOptionPane.showMessageDialog(null, "Player 2 WON!");
                    
                }else if(who==1)
                {
                    JOptionPane.showMessageDialog(null, "Computer WON!");
                }
                winol++;
                wono.setText("      "+winol);
            }
            
            Reset();
            
        }    
        else if(sq1.getText().equals(sq4.getText()) && sq1.getText().equals(sq7.getText()))
        {
            if(sq1.getText().equals("X"))
            {
                if(who==2)
                {
                    JOptionPane.showMessageDialog(null, "Player 1 WON!");
                    
                }else if(who==1)
                {
                    JOptionPane.showMessageDialog(null, "Human WON!");
                }
                winxl++;
                wonx.setText("      "+winxl);
            }
            else
            {
                if(who==2)
                {
                    JOptionPane.showMessageDialog(null, "Player 2 WON!");
                    
                }else if(who==1)
                {
                    JOptionPane.showMessageDialog(null, "Computer WON!");
                }
                winol++;
                wono.setText("      "+winol);
            }
            
            Reset();
        }
        else if(sq5.getText().equals(sq4.getText()) && sq5.getText().equals(sq6.getText()))
        {
            if(sq5.getText().equals("X"))
            {
                if(who==2)
                {
                    JOptionPane.showMessageDialog(null, "Player 1 WON!");
                    
                }else if(who==1)
                {
                    JOptionPane.showMessageDialog(null, "Human WON!");
                }
                winxl++;
                wonx.setText("      "+winxl);
            }
            else
            {
                if(who==2)
                {
                    JOptionPane.showMessageDialog(null, "Player 2 WON!");
                    
                }else if(who==1)
                {
                    JOptionPane.showMessageDialog(null, "Computer WON!");
                }
                winol++;
                wono.setText("      "+winol);
            }
            
            Reset();
        }
        
        else if(sq5.getText().equals(sq2.getText()) && sq5.getText().equals(sq8.getText()))
        {
           if(sq5.getText().equals("X"))
            {
                if(who==2)
                {
                    JOptionPane.showMessageDialog(null, "Player 1 WON!");
                    
                }else if(who==1)
                {
                    JOptionPane.showMessageDialog(null, "Human WON!");
                }
                winxl++;
                wonx.setText("      "+winxl);
            }
            else
            {
                if(who==2)
                {
                    JOptionPane.showMessageDialog(null, "Player 2 WON!");
                    
                }else if(who==1)
                {
                    JOptionPane.showMessageDialog(null, "Computer WON!");
                }
                winol++;
                wono.setText("      "+winol);
            }
            
            Reset();
        }
        else if(sq5.getText().equals(sq3.getText()) && sq5.getText().equals(sq7.getText()))
        {
            if(sq5.getText().equals("X"))
            {
                if(who==2)
                {
                    JOptionPane.showMessageDialog(null, "Player 1 WON!");
                    
                }else if(who==1)
                {
                    JOptionPane.showMessageDialog(null, "Human WON!");
                }
                winxl++;
                wonx.setText("      "+winxl);
            }
            else
            {
                if(who==2)
                {
                    JOptionPane.showMessageDialog(null, "Player 2 WON!");
                    
                }else if(who==1)
                {
                    JOptionPane.showMessageDialog(null, "Computer WON!");
                }
                winol++;
                wono.setText("      "+winol);
            }
            
            Reset();
        }
        else if(sq3.getText().equals(sq6.getText()) && sq3.getText().equals(sq9.getText()))
        {
            if(sq3.getText().equals("X"))
            {
                if(who==2)
                {
                    JOptionPane.showMessageDialog(null, "Player 1 WON!");
                    
                }else if(who==1)
                {
                    JOptionPane.showMessageDialog(null, "Human WON!");
                }
                winxl++;
                wonx.setText("      "+winxl);
            }
            else
            {
                if(who==2)
                {
                    JOptionPane.showMessageDialog(null, "Player 2 WON!");
                    
                }else if(who==1)
                {
                    JOptionPane.showMessageDialog(null, "Computer WON!");
                }
                winol++;
                wono.setText("      "+winol);
            }
            
            Reset();
        }
        
        else if(sq7.getText().equals(sq8.getText()) && sq7.getText().equals(sq9.getText()))
        {
            if(sq7.getText().equals("X"))
            {
                if(who==2)
                {
                    JOptionPane.showMessageDialog(null, "Player 1 WON!");
                    
                }else if(who==1)
                {
                    JOptionPane.showMessageDialog(null, "Human WON!");
                }
                winxl++;
                wonx.setText("      "+winxl);
            }
            else
            {
                if(who==2)
                {
                    JOptionPane.showMessageDialog(null, "Player 2 WON!");
                    
                }else if(who==1)
                {
                    JOptionPane.showMessageDialog(null, "Computer WON!");
                }
                winol++;
                wono.setText("      "+winol);
            }
            
            Reset();
            
        }else if(!"1".equals(sq1.getText())
                && !"2".equals(sq2.getText()) 
                && !"3".equals(sq3.getText()) 
                && !"4".equals(sq4.getText()) 
                && !"5".equals(sq5.getText()) 
                && !"6".equals(sq6.getText())
                && !"7".equals(sq7.getText())
                && !"8".equals(sq8.getText())
                && !"9".equals(sq9.getText()))
        {
            JOptionPane.showMessageDialog(null, "It's DRAW!");
            Reset();
            drawl++;
            draw1.setText("      "+drawl);
        }
        
    }
    
    
    public void Computer()
    {
       if(sq1.getText().equals("1"))
           sq1.setText("O");
       
       else if(sq2.getText().equals("2"))
           sq2.setText("O");

       else if(sq3.getText().equals("3"))
           sq3.setText("O");

       else if(sq4.getText().equals("4"))
           sq4.setText("O");

       else if(sq5.getText().equals("5"))
           sq5.setText("O");

       else if(sq6.getText().equals("6"))
           sq6.setText("O");

       else if(sq7.getText().equals("7"))
           sq7.setText("O");

       else if(sq8.getText().equals("8"))
           sq8.setText("O");

       else if(sq9.getText().equals("9"))
           sq9.setText("O"); 
       
       CheckWin();
    }
    
    public void CheckToWin()
    {
        CheckWin();
        
        if(sq1.getText().equals(sq2.getText()) && sq3.getText().equals("3"))
        {
            sq3.setText("O");
        }
        else if(sq1.getText().equals(sq3.getText()) && sq2.getText().equals("2"))	
        {
            sq2.setText("O");
        }
        else if(sq2.getText().equals(sq3.getText()) && sq1.getText().equals("1") )
        {
            sq1.setText("O");
        }
         

        else if(sq1.getText().equals(sq4.getText()) && sq7.getText().equals("7"))
        {
            sq7.setText("O");
        }
        else if(sq1.getText().equals(sq7.getText()) && sq4.getText().equals("4"))
        {
            sq4.setText("O");
        }
        else if(sq4.getText().equals(sq7.getText()) && sq1.getText().equals("1"))
	{
            sq1.setText("O");
        }

        else if(sq1.getText().equals(sq5.getText()) && sq9.getText().equals("9"))
	{
            sq9.setText("O");
        }
        else if(sq1.getText().equals(sq9.getText())&& sq5.getText().equals("5"))
        {
            sq5.setText("O");
        }
        else if(sq9.getText().equals(sq5.getText()) && sq1.getText().equals("1"))
	{
            sq1.setText("O");
        }

        else if(sq4.getText().equals(sq5.getText()) && sq6.getText().equals("6"))
        {
            sq6.setText("O");
        }
        else if(sq4.getText().equals(sq6.getText()) && sq5.getText().equals("5"))
	{
            sq5.setText("O");
        }
        else if(sq5.getText().equals(sq6.getText()) && sq4.getText().equals("4"))
	{
            sq4.setText("O");
        }

        else if(sq2.getText().equals(sq5.getText()) && sq8.getText().equals("8"))
	{
            sq8.setText("O");
        }
        else if(sq2.getText().equals(sq8.getText()) && sq5.getText().equals("5"))
	{
            sq5.setText("O");
        }
        else if(sq5.getText().equals(sq8.getText()) && sq2.getText().equals("2"))
	{
            sq2.setText("O");
        }

        else if(sq3.getText().equals(sq5.getText()) && sq7.getText().equals("7"))
	{
            sq7.setText("O");
        }
	else if(sq3.getText().equals(sq7.getText()) && sq5.getText().equals("5"))
	{
            sq5.setText("O");
        }
        else if(sq5.getText().equals(sq7.getText()) && sq3.getText().equals("3"))
	{
            sq3.setText("O");
        }

        else if(sq7.getText().equals(sq8.getText()) && sq9.getText().equals("9"))
	{
            sq9.setText("O");
        }
        else if(sq7.getText().equals(sq9.getText()) && sq8.getText().equals("8"))
	{
            sq8.setText("O");
        }
        else if(sq8.getText().equals(sq9.getText()) && sq7.getText().equals("7"))
	{
            sq7.setText("O");
        }

        else if(sq3.getText().equals(sq6.getText()) && sq9.getText().equals("9"))
	{
            sq9.setText("O");
        }
        else if(sq3.getText().equals(sq9.getText()) && sq6.getText().equals("6"))
	{
            sq6.setText("O");
        }
        else if(sq6.getText().equals(sq9.getText()) && sq3.getText().equals("3"))
	{
            sq3.setText("O");
        }
        else 
            Computer();
        
        CheckWin();
    }

    
    public static void main(String[] args) 
    {
        TicTacToe obj = new TicTacToe();
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.pack();
        obj.setLocationRelativeTo(null);
        obj.setSize(500,600);
        obj.setResizable(false);
        obj.setVisible(true);
    }   
}

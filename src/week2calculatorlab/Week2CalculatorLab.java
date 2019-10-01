//testdskfjdsklfjdslkfjdlskfjdklsfjdklsjfdlksjfklsjfkldsjfkldsjflkdsjflkdsjfkldjsfkljdsfkljdslfk
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2calculatorlab;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author jeancastro
 */
public class Week2CalculatorLab extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        new Week2CalculatorLab ();
        // TODO code application logic here
    }
    
    
    public Week2CalculatorLab () {
        
        this.setVisible(true);
        this.setSize(400,500);
        this.setTitle("CalculatorLab");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        
        BorderLayout border = new BorderLayout();
        this.setLayout(border);
        
        JTextField text = new JTextField (10);
        text.setFont(new Font("Verdana", Font.BOLD, 50));
        this.add(text, BorderLayout.NORTH);
        
        
        JPanel panelcenter = new JPanel();
        this.add(panelcenter, BorderLayout.CENTER);
        
        BorderLayout border2 = new BorderLayout ();
        panelcenter.setLayout(border2);
        
        JPanel panelnorth = new JPanel ();
        panelcenter.add(panelnorth, BorderLayout.NORTH);
        
        JButton mc = new JButton ("MC");
        panelnorth.add(mc);
        
         JButton mr = new JButton ("MR");
        panelnorth.add(mr);
        
         JButton mplus = new JButton ("M +");
        panelnorth.add(mplus);
        
         JButton mmenos = new JButton ("M -");
        panelnorth.add(mmenos);
       
         JButton ms = new JButton ("MS");
        panelnorth.add(ms);
        
        JButton mpower = new JButton ("M *");
        panelnorth.add(mpower);
        
        
        JPanel panelcenter2 = new JPanel ();
        panelcenter.add(panelcenter2, BorderLayout.CENTER);
        
        GridLayout grid = new GridLayout(6,4);
        panelcenter2.setLayout(grid);
        
      JButton percentage = new JButton("%");
        panelcenter2.add(percentage);
        JButton root = new JButton("√");
        panelcenter2.add(root);
        JButton square = new JButton("²");
        panelcenter2.add(square);
        JButton onedivide = new JButton("1/x");
        panelcenter2.add(onedivide);
        JButton CE = new JButton("CE");
        panelcenter2.add(CE);
        JButton C = new JButton("C");
         panelcenter2.add(C);
        JButton erase = new JButton("<");
         panelcenter2.add(erase);
        JButton division = new JButton("/");
         panelcenter2.add(division);
        JButton n7 = new JButton("7");
         panelcenter2.add(n7);
        JButton n8 = new JButton("8");
         panelcenter2.add(n8);
        JButton n9 = new JButton("9");
         panelcenter2.add(n9);
        JButton X = new JButton("X");
         panelcenter2.add(X);
        JButton n4 = new JButton("4");
         panelcenter2.add(n4);
        JButton n5 = new JButton("5");
         panelcenter2.add(n5);
        JButton n6 = new JButton("6");
         panelcenter2.add(n6);
        JButton minus = new JButton("-");
         panelcenter2.add(minus);
        JButton n1 = new JButton("1");
         panelcenter2.add(n1);
        JButton n2 = new JButton("2");
         panelcenter2.add(n2);
        JButton n3 = new JButton("3");
         panelcenter2.add(n3);
        JButton addition = new JButton("+");
         panelcenter2.add(addition);
        JButton posneg = new JButton("+-");
         panelcenter2.add(posneg);
        JButton n0 = new JButton("0");
         panelcenter2.add(n0);
        JButton point = new JButton(".");
         panelcenter2.add(point);
        JButton equals = new JButton("=");
         panelcenter2.add(equals);
       
        
       
   
                
                
        
        
        
        


        
        
        
        
        
        
        
        
        this.validate();
        this.repaint();
        
 
    }
    
    
}

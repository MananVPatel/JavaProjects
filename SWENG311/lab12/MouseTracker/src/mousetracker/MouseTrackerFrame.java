/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mousetracker;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.GridLayout;

/**
 *
 * @author mvp5542
 */
public class MouseTrackerFrame extends JFrame { 
    //JPanel instance variables
    private final JPanel mousePanel; 
    private final JPanel listPanel;
    
    //JLabel instance variables
    private final JLabel statusBar;
    private final JLabel statusBar2;
    
    //JList Instance variables
    private final JList<Integer> rowJList; 
    private final JList<Integer> columnJList;
    
    //Arrays for rows and columns
    private static final Integer[] rows = { 1, 2, 3, 4 };
    private static final Integer[] columns = {1, 2, 3, 4};
    
    //lay out the grid
    private GridLayout gridLayout;
    
    //counter 
    private int counter;
    
//    private static final int[][] matrix = new int[4][4];
    
    public MouseTrackerFrame()
    {
        super("LAB 12: Creating JFrame & BorderLayout!");
       
        //initialize counter
        counter = 0;
        //create JPanel Objects 
        mousePanel = new JPanel();
        listPanel = new JPanel();
        mousePanel.setBackground(Color.WHITE);
        add(mousePanel, BorderLayout.CENTER); //add label to JPanel
        add(listPanel, BorderLayout.WEST);//add label to JPanel
        
        //Part 1 - exit and enter JFRAME to change color
        statusBar = new JLabel("Move over to Change Color");//create JLabel object
        statusBar.setOpaque(true);
        add(statusBar, BorderLayout.SOUTH);//add label to JFrame
        
        //PART 2 - create a JLabel, once clicked should change color. 
        statusBar2 = new JLabel("Click to change Color");//create JLabel object
        statusBar2.setOpaque(true);
        add(statusBar2, BorderLayout.NORTH);//add label to JFrame
        
        //PART 3 - add two JLists each with 4 elements on the West side of JFRAME
        rowJList = new JList<Integer>(rows); // list of rows
        rowJList.setVisibleRowCount(3); //shows first 3 elements in the JList

        columnJList = new JList<Integer>(columns); // list of rows
        columnJList.setVisibleRowCount(3); //shows first 3 elements in the JList
                  
        //add a JScrollPane containing JList to Frame
        listPanel.add(new JScrollPane(rowJList));
        listPanel.add(new JScrollPane(columnJList));
        
        //create selectionListHandler objects
        SelectionListHandler listHandler = new SelectionListHandler();
        rowJList.addListSelectionListener(listHandler); // add a JList selection Listener        
        columnJList.addListSelectionListener(listHandler);// add a JList selection Listener 
        
        //create and register Listeners for mouse and mouse motion events
        MouseHandler handler = new MouseHandler();
        MouseHandler1 handler1 = new MouseHandler1();
        statusBar.addMouseListener(handler); 
        statusBar.addMouseMotionListener(handler);
        statusBar2.addMouseListener(handler1);
        statusBar2.addMouseMotionListener(handler1);
    }
    
    private class MouseHandler extends MouseAdapter
    {
        //change color to green when mouse enters JLabel
        @Override
        public void mouseEntered(MouseEvent e)
        {
            statusBar.setText("Mouse Entered");
            statusBar.setBackground(Color.GREEN); 
        }
         //change color to red when mouse exits JLabel
        @Override
        public void mouseExited(MouseEvent e)
        {   
            statusBar.setText("Mouse outside JPanel");
            statusBar.setBackground(Color.RED);
        }

    }
    private class MouseHandler1 extends MouseAdapter
    {
        //change color of the JLabel: statusBar2, everytime its clicked
     @Override
        public void mouseClicked(MouseEvent e)
        {
              switch(counter){
                  case 0:
                      statusBar2.setBackground(Color.ORANGE);
                      counter++;
                      break;
                  case 1:
                      statusBar2.setBackground(Color.MAGENTA);
                      counter++;
                      break;
                  case 2:
                      statusBar2.setBackground(Color.PINK);
                      counter++;
                      break;
                  case 3:
                      statusBar2.setBackground(Color.CYAN);
                      counter = 0;
                      break;
              }
         
    }
    }

    // Handler for the SelectionListHandler declared in MouseTrackerFrame which implements ListSeletionListener
    private class SelectionListHandler implements ListSelectionListener
    {
            @Override
            public void valueChanged(ListSelectionEvent event)
            {
                mousePanel.removeAll(); //removes all components from the container
                int row = rowJList.getSelectedIndex()+1; 
                int column = columnJList.getSelectedIndex()+1;
                gridLayout= new GridLayout(row, column); // create a gridLayout based on selected JList Values
                mousePanel.setLayout(gridLayout); //set gridLayout
                
                //display the position of the grid in the format(x,y)
                for (int i = 1; i <= row; i++)
                {
                    for(int j = 1; j <= column; j++)
                    {
                        mousePanel.add(new JButton(String.format("(%d,%d)", i, j))); //add (x,y) to JPanel
                    }
                }
                mousePanel.validate();  // updates the screen
            }

    }
}
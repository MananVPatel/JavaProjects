/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
/**
 *
 * @author hea113
 */
public class GUI extends JFrame{
    private final JLabel moveColor, clickColor;
    private final Color[] colors = {Color.BLUE, Color.GREEN, Color.YELLOW, Color.RED};
    private int counter=0,row,col, rowAmount, colAmount;
    private final JList<Integer> rows, columns;
    private final Integer[] numbers = {1,2,3,4};
    private final JPanel lists, buttonGrid;
    
    public GUI(){
        // the name at the top
        super("Lab12");
        rows = new JList<Integer>(numbers);
        columns = new JList<Integer>(numbers);
        
        // creates new lists jpanel
        lists = new JPanel();
        buttonGrid = new JPanel();
        
        // adds the components to the JFrame
        add(lists, BorderLayout.WEST);
        add(buttonGrid, BorderLayout.CENTER);
        
        // sets the layout of the components
        lists.setLayout(new FlowLayout());
        buttonGrid.setLayout(new GridLayout(3,3));
        
        // Initializes the button grid
        for (int i = 0; i < 9; i++) {
            buttonGrid.add(new JButton());
        }
        
        // the default selection is 1, the first index
        rows.setSelectedIndex(0);
        columns.setSelectedIndex(0);
        
        // allows you to only see 3 at a time
        rows.setVisibleRowCount(3);
        columns.setVisibleRowCount(3);
      
        // single selection only 
        rows.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        columns.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        // adds the Jlists to the JFrame
        lists.add(new JScrollPane(rows), BorderLayout.WEST);
        lists.add(new JScrollPane(columns), BorderLayout.WEST);
        
        // label component that you move over to change the color
        moveColor = new JLabel("Move over to Change Color");
        add(moveColor, BorderLayout.SOUTH);
        
        // label component that if you click it changes color
        clickColor = new JLabel("Click to Change Color");
        add(clickColor, BorderLayout.NORTH);
        
        
        //Mouse click Handler
        MouseClickHandler mouseHandler = new MouseClickHandler();
        clickColor.addMouseListener(mouseHandler);
        
        // Mouse Motion Handler
        MouseHandler mouseMotionHandler = new MouseHandler();
        moveColor.setForeground(Color.RED); //defaule red color
        moveColor.addMouseListener(mouseMotionHandler);
        
        //creates the list selection handler
        SharedListSelectionHandler sharedlistener = new SharedListSelectionHandler();
        rows.addListSelectionListener(sharedlistener);
        columns.addListSelectionListener(sharedlistener);
      
    }
        // handles what happens when you click the clickColor component
        private class MouseClickHandler extends MouseAdapter
        {
            @Override
            public void mouseClicked(MouseEvent event){
                        clickColor.setBackground(colors[counter]);
                        clickColor.setOpaque(true);
                        counter++;
                        if(counter ==4){
                            counter=0; // resets counter back to 0 so you the colors continuously change without stopping
                        }
            }
        }
        
        // handles what happens when you hover over the the moveColor component
        private class MouseHandler extends MouseAdapter
        {
            @Override
            public void mouseEntered(MouseEvent event){
                        moveColor.setForeground(Color.BLUE);                      
            }
            @Override
            public void mouseExited(MouseEvent event){
                        moveColor.setForeground(Color.RED);                      
            }
        
        }
     
    // changes the grid to whatever the selected values are    
    public void changeGrid() {
        buttonGrid.removeAll();
        int row = rows.getSelectedValue();
        int col = columns.getSelectedValue();
        buttonGrid.setLayout(new GridLayout(row, col));
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                buttonGrid.add(new JButton(String.format("(%d,%d)",i+1,j+1)));
            }
        }
       
}
    // handles when the user clicks on a number on the list
    private class SharedListSelectionHandler implements ListSelectionListener
    {
        @Override
        public void valueChanged(ListSelectionEvent event){
            rowAmount = rows.getSelectedIndex() + 1;
            colAmount = columns.getSelectedIndex() + 1;
            System.out.println(rowAmount);
            System.out.println(colAmount);
            changeGrid();
            getContentPane().revalidate();  // updates the screen
        }
    }
}

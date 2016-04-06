/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mousetracker;

import javax.swing.JFrame;

/**
 *
 * @author mvp5542
 */
public class MouseTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MouseTrackerFrame mouseTrackerFrame = new MouseTrackerFrame();
        mouseTrackerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mouseTrackerFrame.setSize(500,200);
        mouseTrackerFrame.setVisible(true);
    }
    
}

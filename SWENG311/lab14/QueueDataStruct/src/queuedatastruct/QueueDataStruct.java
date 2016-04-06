/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuedatastruct;


/**
 *
 * @author mvp5542
 */
public class QueueDataStruct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
        Integer[] integerElements = {1, 2, 3, 4, 5};
        String[] stringElements = {"Hello", "Car", "Java", "Pepsi", "Christmas"};
        
        Queue<Double> doubleQueue = new Queue<>(5);
        Queue<Integer> integerQueue = new Queue<>(5);
        Queue<String> stringQueue = new Queue<>(5);
        
        // Double Queue Displaying contents
        System.out.println("  Double Queue!!!  ");
        System.out.printf("Enqueue Objects to Queue!\n");
        for(int i = 0; i < 3; i++) 
        {
        doubleQueue.enqueue(doubleElements[i]); //add value to queue
        doubleQueue.printQueue();
        System.out.println();
        }
        
        System.out.printf("\nDequeue Objects from Queue!\n");
        try
        {
            double removeElement;
            for(int i = 0; i < 2; i++)
            {
            removeElement = doubleQueue.dequeue();           
            System.out.printf("   Element Being Dequeued: %.1f\nRemaining Queue: ", removeElement);
            doubleQueue.printQueue();
            System.out.println();
            System.out.printf("\nSize of the Queue now: ");
            System.out.println(doubleQueue.size());
            }
        }
        catch(EmptyQueueException e)
        {
            System.err.println("Error!");
        }
        
        System.out.printf("\nEnqueue Objects to Queue!\n");
        for(int i = 3; i < 5; i++) 
        {
        doubleQueue.enqueue(doubleElements[i]); //add value to queue
        doubleQueue.printQueue();
        System.out.println();
        }
        
        System.out.printf("\nDisplaying the element at the front of the array!\n");
        System.out.println(doubleQueue.front());
        
        System.out.printf("\nDisplaying the size of the Queue\n");
        System.out.println(doubleQueue.size());
        
        
        System.out.printf("\n\n");
        System.out.println(" **************************************************************** ");

        
//----------------------------------------------------------------------------------------------        
        
        //Integer Queue Displaying contents
        System.out.println("  Integer Queue!!!  ");
        System.out.printf("Enqueue Objects to Queue!\n");
        for(int i = 0; i < 3; i++) 
        {
        integerQueue.enqueue(integerElements[i]); //add value to queue
        integerQueue.printQueue();
        System.out.println();
        }
        
        System.out.printf("\nDequeue Objects from Queue!\n");
        try
        {
            int removeElement;
            for(int i = 0; i < 2; i++)
            {
            removeElement = integerQueue.dequeue();           
            System.out.printf("   Element Being Dequeued: %d\nRemaining Queue: ", removeElement);
            integerQueue.printQueue();
            System.out.println();
            }
            System.out.printf("\nSize of the Queue now: ");
            System.out.println(integerQueue.size());
        }
        catch(EmptyQueueException e)
        {
            System.err.println("Error!");
        }
        
        System.out.printf("\nEnqueue Objects to Queue!\n");
        for(int i = 3; i < 5; i++) 
        {
        integerQueue.enqueue(integerElements[i]); //add value to queue
        integerQueue.printQueue();
        System.out.println();
        }
        
        System.out.printf("\nDisplaying the element at the front of the array!\n");
        System.out.println(integerQueue.front());
        
        System.out.printf("\nDisplaying the size of the Queue\n");
        System.out.println(doubleQueue.size());
        
        System.out.printf("\n\n");
        System.out.println(" **************************************************************** ");

//----------------------------------------------------------------------------------------------        
        
        //String Queue Displaying contents
        System.out.println("  String Queue!!!  ");
        System.out.printf("Enqueue Objects to Queue!\n");
        for(int i = 0; i < 3; i++) 
        {
        stringQueue.enqueue(stringElements[i]); //add value to queue
        stringQueue.printQueue();
        System.out.println();
        }
        
        System.out.printf("\nDequeue Objects from Queue!\n");
        try
        {
            String removeElement;
            for(int i = 0; i < 2; i++)
            {
            removeElement = stringQueue.dequeue();           
            System.out.printf("   Element Being Dequeued: %s\nRemaining Queue: ", removeElement);
            stringQueue.printQueue();
            System.out.println();
            }
            System.out.printf("\nSize of the Queue now: ");
            System.out.println(stringQueue.size());
        }
        catch(EmptyQueueException e)
        {
            System.err.println("Error!");
        }
        
        System.out.printf("\nEnqueue Objects to Queue!\n");
        for(int i = 3; i < 5; i++) 
        {
        stringQueue.enqueue(stringElements[i]); //add value to queue
        stringQueue.printQueue();
        System.out.println();
        }
        
        System.out.printf("\nDisplaying the element at the front of the array!\n");
        System.out.println(stringQueue.front());
        
        System.out.printf("\nDisplaying the size of the Queue\n");
        System.out.println(doubleQueue.size());
        
        

    }
   
    
    
}

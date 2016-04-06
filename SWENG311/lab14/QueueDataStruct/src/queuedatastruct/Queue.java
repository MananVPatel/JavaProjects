/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuedatastruct;
import java.util.ArrayList;
/**
 *
 * @author mvp5542
 * @param <T>
 */
public class Queue<T> {

  private final ArrayList<T> elements; // arraylist of elements that will be queued and dequeued
  
  //no arguement constructor
  public Queue()
  {
      this(10); //default queue size
  }
  
  // constructor to validate the capacity of the arraylist
  public Queue(int capacity)
  {
    //if capacity greater than 10 then use it else set capacity to 10
    int startingCapacity = capacity > 0 ? capacity : 10; 
    elements = new ArrayList<>(startingCapacity); // create ArrayList
  }
  
  //add elements to the queue
  public void enqueue(T enterInQueue)
  {
      elements.add(enterInQueue);
  }
  
  //dequeue elements from the queue
  public T dequeue()
  {
      
      return elements.remove(0);
  }
  
  public class EmptyQueueException extends RuntimeException
  {
	  public EmptyQueueException()
	  {
		  this("Queue is Empty!");
	  }
	 
	  public EmptyQueueException(String Message)
	  {
		  super(message);
	  }
	  
	  
  }
  //returns the size of the queue
  public int size(){
      return this.elements.size();
  }
  
  //tells if the array is empty or not
  public boolean isEmpty()
  {
      boolean emptyOrNot = this.elements.isEmpty();
      return emptyOrNot;    
  }
  
  // returns the front element of the queue
  public T front()
  {
      return elements.get(0);   
  }
  
  //prints the queue when called
  public void printQueue()
  {
      for(int i = 0; i < elements.size(); i++)
      {
          System.out.print(" ");
          System.out.print(elements.get(i));
      }
  }
  
    
}

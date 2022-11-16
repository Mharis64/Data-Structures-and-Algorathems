/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doubleended_queue;

/**
 *
 * @author OK
 */
public class DoubleEnded_Queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        DE_Queue <Integer> a= new DE_Queue<>(10);
        a.enQueueAtTail(3);
        a.enQueueAtTail(4);
        a.enQueueAtTail(5);
        a.enQueueAtHead(0);

        a.print();
        
        
    }
    
}

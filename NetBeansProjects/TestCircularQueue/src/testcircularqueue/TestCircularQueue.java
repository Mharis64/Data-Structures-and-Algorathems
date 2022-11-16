
package testcircularqueue;


public class TestCircularQueue {

    
    
    
    public static void main(String[] args) {
        
CircularQueue <Integer> a= new CircularQueue<>();
a.enQueue(1);
a.enQueue(2);
a.enQueue(3);
a.enQueue(4);
a.enQueue(5);
a.enQueue(6);

a.enQueue(7);

a.enQueue(8);
a.enQueue(9);
a.enQueue(10);
a.deQueue();
a.enQueue(11);
a.deQueue();
a.enQueue(12);



a.print();

    }
    
}

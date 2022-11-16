
package testcirculerqueue;



public class QueueByLL <T> {

class Node{
    Node next;
   
    T data;
}
       Node start;
    Node end; 
    int count=0;
    
    
    public boolean isEmpty(){
 return start==null;
    }
    
    
    
    
    
public void enQueue(T value){
    Node n=new Node();
    n.data=value;
    if(start==null){
        
        start=end=n;
        return;
        
    }else
    {
end.next=n;
end=n;
    end.next=start;
 count++;
}
}

public T deQueue(){
    if(isEmpty()){
        System.out.println("Queue is Empty");
        return null;
    }else
    {
        if(start==end){
            T val=start.data;
            start=end=null;
            count--;
            return val;
        }else
        {
            T val=end.data;
          start=start.next;
          end.next=start;
          count--;
            return val;
        }
    }
}   

public int size()
{
    return count;
}
public T peek()
{
   
    return start.data;
}

    public void print(){

    Node _t=start; 
        System.out.println("start<=");
        
     
        do
        {
            System.out.println(_t.data+"<=");
            _t=_t.next;
        }
        while(_t!=start);
        System.out.println("End");
        
        
    
    }

    
    
   

  
}

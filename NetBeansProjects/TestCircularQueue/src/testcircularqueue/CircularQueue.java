
package testcircularqueue;




public class CircularQueue <T>
        
{
    int head=-1;
    int tail=-1;
    T[] arr=(T[]) new Object[10];
    int n=10;
    
    public boolean isEmpty(){
        return head==tail;
    }
        
    public boolean isFull(){
        return head +n==tail;
            
    }
    public void enQueue(T value){
        if(isFull()){
            System.out.println("Queue is full");
        }else{
            tail++;
            arr[tail%n]=value;
            
        } 
    }
  
    public void print(){
       
        for (int i=0;i<arr.length;i++) {
             if(arr[i]==null){
                continue;
        }
            System.out.print(arr[i]+"=>");
            
        }
    }
    
    public T deQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }else
           
       head++;
            return arr[head%n];
            
        
    }
    
}

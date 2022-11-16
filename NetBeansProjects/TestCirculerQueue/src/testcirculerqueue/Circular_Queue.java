

package testcirculerqueue;



public class Circular_Queue <T>
{
T[] arr;
int head=-1, tail=-1;
int size;
public Circular_Queue (int a){
    size=a;
    arr= (T[]) new Object[a];
}

public boolean isFull(){
    return head+size==tail;
   
}
public boolean isEmpty(){
    return tail==head;
}

public void enQueue(T value){
    if(isFull()){
        System.out.println("queue is full");
        
    }else
    {
        tail++;
        arr[tail%size]=value;
        
    }
}
public T deQueue(){
    if(isEmpty()){
        System.out.println("Queue is Empty");
        return null;
    }else{
        head++;
        return arr[head%size];
    }
}

public T peek(){
    if(isEmpty()){
        System.out.println("queue is Empty");
        return null;
    }else
    {
        return arr[(head+1)% size];
    }
}
    
public void print(){
    if(isEmpty()){
        System.out.println("Queue is Empty");
        
}else
    {
        System.out.print("Start<=");
        for (int i=head+1;i<=tail;i++){
            System.out.print(arr[i%size]+"<=");
        }
        System.out.print("End");
     }
    }


}
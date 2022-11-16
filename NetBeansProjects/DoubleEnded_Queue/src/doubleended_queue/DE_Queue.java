package doubleended_queue;

/**
 *
 * @author Hp
 */
public class DE_Queue<T>
{
    T [] arr;
    int tail=-1;
    public DE_Queue(int a)
    {
        arr= (T[]) new Object[a];
    }
    public boolean isEmpty(){
        if (tail==-1){
            return true;
                    
        }else
            return false;
    }
    
    
    public boolean isFull(){
        if(tail==arr.length-1){
            return true;
        }else
            return false;
    }
    
    public int size(){
        return tail+1;
    }
    public void enQueueAtTail(T value){
        if(isFull()){
            System.out.println("Queue is Full");
        }else
            tail++;
        
        arr[tail]=value;
        
    }
    
    public T deQueueAtTail(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return null;
        }else{
            T val= arr[tail];
        tail--;
        return val;
        }
        
    }
    
    public void enQueueAtHead(T value){
        if(isFull()){
            System.out.println("Queue is Full");
           
        }else
        {
            this.moveBackward();
            arr[0]= value;
        }
        
        
        
        
    }
    public void moveBackward(){
        for (int i=tail;i<0;i--){
            arr[i+1]= arr[i];
        }
        tail++;
    }
    
    
    public T deQueueAtHead(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return null;
        }else
        {
                       T val= arr[0];

            this.moveFarward();
           return val;
        }
    }
    
    
    public void moveFarward(){
        for (int i=0;i<tail;i++){
            arr[i]=arr[i+1];
        }
    }
    
    
    public void print(){
        for(int i=0;i<=tail;i++){
            System.out.print(arr[i]+"=>");
        }
    }
    
    
}

package doublylinklist;



public class LinkList <T>
{
 class Node{
     
T data;
Node next;     
    Node previous;
 }
 Node start;
 Node end;
    
   

public void insertAtStart(T value){
Node n=new Node();
n.data=value;
if(start==null){
    start=end=n;
}
else
{
    n.next=start;

    start.previous=n;
        start=n;
        start.previous=null;
    
}
} 

public T deleteAtStart(){
    if(start==null){
        return null;
        
    }else
        if(start==end){
            T value =start.data;
            start=end=null;
            return value;
        }
    else
        {
            T value=start.data;
            start=start.next;
            return value;
        }
}

public void insertAtEnd(T Value)
    {
        Node n = new Node();
        n.data = Value;
        n.next = null;
        n.previous = null;
        if (start == null)
        {
            start = end = n;
        } else if (start == end)
        {
            end.next = n;
            end = n;
            end.previous = start;
        } else
        {
            Node _t1 = start, _t2 = null;
            while (_t1.next != null)
            { 
                _t2 = _t1;
                _t1 = _t1.next;
            }
            end.next = n;
            n.previous = end;
            end = n;
        }

    }


public boolean search(T key){
    if(start==null){
        return false;
        
    }else
    {
         Node t= start;
         while(t!=null){
             if(t.data==key){
                 return true;
             }
             t=t.next;
         }
         return false;
    }
}
public T deleteAtEnd(){
    if(start==null){
        System.out.println("List is Empty");
        return null;
    }else
        if(start==end)
        {
            T value=end.data;
            start=end=null;
            return value;
        }else
        {
            T value=end.data;
            end=end.previous;
            end.next=null;
            return value;
        }
}
public void insertAfter(T key, T value){
    if(start==null){
        return;
    }else
    {
        Node _t1= start;
        while(_t1 != null){
            if(_t1.data==key){
                Node n= new Node();
                n.data=value;
                if(_t1==end){
                    end.next=n;
                    n.previous=end;
                    end=n;
                    end.next=null;
                }else
                {
                    n.next=_t1.next;
                    _t1.next.previous=n;
                    _t1.next=n;
                    n.previous=_t1;
                }
            }
            _t1=_t1.next;
        }
    }
}
public T deleteNode(T key){
    if(start==null)
    {
        return null;
    }else
    {
        Node _t1=start;
        while(_t1.data==key){
            if(_t1==start){
                T value=start.data;
                start=start.next;
                start.previous=null;
                return value;
                
            }else
                if(_t1==end){
                    T value= end.data;
                    end=end.previous;
                    end.next=null;
                    return value;
                }else
                {
                    T value= _t1.data;
                    _t1.previous.next=_t1.next;
                    _t1.next.previous=_t1.previous;
                    _t1=null;
                }
        }
        _t1=_t1.next;
    }
    return null;
}
public void print(){
    if(start==null){
        System.out.println("List is Empty");
    }else{
        Node _t=start;
        while(_t !=null){
            System.out.print(_t.data+"=>");
            _t=_t.next;
        }
//        System.out.println("null");
    }
}

}


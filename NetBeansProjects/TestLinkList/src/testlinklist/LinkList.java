/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testlinklist;

/**
 *
 * @author OK
 */
public class LinkList <T>
{

class Node{
    T data;
    Node next;
    Node previous;
}

Node Start;
Node End;
    public void insertAtStart(T Value){

        Node n =new Node();
        n.data=Value;
        if(Start==null){
            Start=End=n;
            
        }else
        if(Start==End){
            n.next=Start;
            Start.previous=n;
            n.previous=Start;
            Start=n;
        }else
        {
            n.next=Start;
            Start.previous=n;
            Start=n;
            Start.previous=End;
            End.next=Start;
        }
        
        
}

    public void insertAtEnd(T Value)
    {
        Node n=new Node();
        n.data=Value;
        if(Start==null){
            Start=n;
            End=n;
            
        }
        
        else{
            End.next=n;
            n.previous=End;
            n.next=Start;
            End=n;
            Start.previous=End;
        }
                
        
    }
    
    public void insertAfter(T key, T Value)
    {
        if(Start==null){
            System.out.println("List is Empty");
        }
        else
        {
            Node _t1=Start;
            do
            {
                if(_t1.data==key){
                    Node n=new Node();
                    n.data= Value;
                    if(_t1==Start){
                        if(Start==End){
                            Start.next=n;
                            n.previous=Start;
                            n.next=Start;
                            Start.previous=n;
                            End = n;
                            
                        }
                        else{
                            n.next=Start.next;
                            Start.next.previous=n;
                            Start.next=n;
                            n.previous=Start;
                        }
                        return;
                        
                    }else
                    if(_t1==End){
                        End.next=n;
                        n.previous=End;
                        n.next=Start;
                        Start.previous=n;
                        End=n;
                }    
                    else{
                        n.next=_t1.next;
                        _t1.next.previous=n;
                        _t1.next=n;
                        n.previous=_t1;
                    }
                    return;
            }
                _t1=_t1.next;
        }
            while(_t1!=Start);
            System.out.println("Key not Found");
    }
    
    
    
}
    public T deleteAtStart(){
        if(Start==null){
            System.out.println("List is Empty");
            return null;
        }else if(Start==End){
            T val=Start.data;
            Start=End=null;
            return val;
        }else{
            T val= Start.data;
            Start=Start.next;
            Start.previous=End;
            End.next=Start;
            return val;
            
        }
    }
    
    public T deleteAtEnd(){
        
        if(Start==null){
            System.out.println("List is Empty");
            
        return null;
        }
        else if(Start==End){
            T val=Start.data;
            Start=End=null;
            return val;
        }
        else{
            T val= End.data;
            End.previous.next=Start;
            End=End.previous;
            Start.previous=End;
            return val;
        }
        
    }
    public T deleteNode(T key){
        if(Start==null){
            System.out.println("List is Empty");
            return null;
        }
        else {
            Node _t=Start;
            do{
                if(_t.data==key){
                    if(key==Start.data) {
                        Start=Start.next;
                        Start.previous=End;
                        End.next=Start;
                        return key;
                    } else if(key==End.data){
                        End.previous.next=Start;
                        End=End.previous;
                        Start.previous=End;
                        return key;
                    }else{
                        _t.previous.next=_t.next;
                        _t.next.previous=_t.previous;
                        _t=null;
                        return key;
                    }
                }
                _t=_t.next;
                
            }
            while (_t!=Start);
            System.out.println("List not Found");
            return null;
        }
    }
    public boolean search(T key){
        if(Start == null){
            
            return false;
        }else{
            Node _t =Start;
            do
            {
                if (_t.data== key){
                    return true;
            }
                _t= _t.next;
            }
            while (_t !=Start);
            return false;
        }
    }
    public void print(){
        if (Start== null){
            System.out.println("list is Empty");
            return;
        }else if (Start==End){
            System.out.print(Start.data +"=>");
        }else{
            Node _t1= Start;
            do{
                System.out.print(_t1.data+"=>");
                _t1=_t1.previous;
            }while (_t1 !=Start);
            System.out.print("null");
        }
    }
    
}



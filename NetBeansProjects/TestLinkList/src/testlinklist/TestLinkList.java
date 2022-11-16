

package testlinklist;


public class TestLinkList {

    
    public static void main(String[] args) 
    {
    LinkList <Integer> a= new LinkList<>();
    a.insertAtStart(1);
     a.insertAtStart(2);
      a.insertAtStart(3); 
      a.insertAtStart(4); 
      a.insertAtStart(5);
      a.insertAtStart(6);
      a.insertAtStart(7);
      a.insertAfter(7,8);
      a.insertAtEnd(9);
      a.print();
      
      
      
      
    }
    
}

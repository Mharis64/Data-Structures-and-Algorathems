/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublylinklist;

/**
 *
 * @author OK
 */
public class DoublyLinkList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkList <Integer> a=new LinkList<>();
        a.insertAtStart(1);
        a.insertAfter(1, 2);

        a.insertAtEnd(3);
    a.deleteNode(3);
                a.print();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressionconversionusingstack;

/**
 *
 * @author OK
 */
public class ExpressionConversionUsingStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
               String a="((((K+L)-(M*N))+(((((O^P)*W)/U)/V)*T))+Q)";
       Expression e = new Expression(a.length());
       e.infixToPostFix(a);
       e.infixToPrefix(a);
       e.printPostfix();
       e.printPrefix();
       
    }
        
    }
    


package expressionconversionusingstack;

/**
 *
 * @author Hp
 */
public class Expression
{
    Stack<Character> s;
    String solpost="";
    String solpre="";
    public Expression(int a){
    s= new Stack<>(a);
    }
    public void infixToPostFix(String a){
        
      for(int i = 0;i<a.length();i++){
        if(a.charAt(i)=='('){
           s.push(a.charAt(i));
        }
        else if(a.charAt(i)==')'){
            char ch = s.pop();
            while(ch!='('){
            solpost=solpost+ch;
             ch=s.pop();
            } 
        }
        else if(Character.isDigit(a.charAt(i))||Character.isLetter(a.charAt(i))){
            solpost=solpost+a.charAt(i);
        }
        else{
            if(this.prec(s.peek())>=this.prec(a.charAt(i))){
                while(this.prec(s.peek())>=this.prec(a.charAt(i))){
                    solpost=solpost+s.pop();
                }
            }
            else{
                s.push(a.charAt(i));
            }
        }
      }
      
    }
    public void infixToPrefix(String a){
        a=this.reverse(a);
      for(int i = 0;i<a.length();i++){
        if(a.charAt(i)=='('){
           s.push(a.charAt(i));
        }
        else if(a.charAt(i)==')'){
            char ch = s.pop();
            while(ch!='('){
            solpre=solpre+ch;
             ch=s.pop();
            } 
        }
        else if(Character.isDigit(a.charAt(i))||Character.isLetter(a.charAt(i))){
            solpre=solpre+a.charAt(i);
        }
        else{
            if(this.prec(s.peek())>=this.prec(a.charAt(i))){
                while(this.prec(s.peek())>=this.prec(a.charAt(i))){
                    solpre=solpre+s.pop();
                }
            }
            else{
                s.push(a.charAt(i));
            }
        }
      }
      solpre=this.reverse(solpre);
    }
    public int prec(char a){
        switch (a) {
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return 0;
        }
    }
    public String reverse(String a){
        String b = "";
     for(int i = a.length()-1;i>=0;i--){
            switch (a.charAt(i)) {
                case '(':
                    b=b+')';
                    break;
                case ')':
                    b=b+'(';
                    break;
                default:
                    b=b+a.charAt(i);
                    break;
            }
     }
     return b;
    }
    public void printPrefix(){
        System.out.println("Prefix: "+solpre);
    }
    public void printPostfix(){
        System.out.println("Postfix: "+solpost);
    }
   
}


import java.util.Stack;
public class infixToPostfix {
    public static void main(String[] args) {
        String str="9-5+3*4/6";
        Stack<String> val=new Stack<>();
        Stack<Character> op=new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            int ascii=(int) ch;
            if (ascii>=48 && ascii<=57) 
                val.push(ch+"");
            else if (op.size()==0) 
                op.push(ch);
            else if (ch=='+' || ch=='-') {
                String v2=val.pop();
                String v1=val.pop();
                if (op.peek()=='*') val.push(v1+v2+"*");
                if (op.peek()=='/') val.push(v1+v2+"/");
                if (op.peek()=='+') val.push(v1+v2+"+");
                if (op.peek()=='-') val.push(v1+v2+"-");
                op.pop();
                op.push(ch);                
            }
            else if(ch=='*' || ch=='/'){
                if (op.peek()=='*' || op.peek()=='/') {
                    String v2=val.pop();
                    String v1=val.pop();
                    if (op.peek()=='*') val.push(v1+v2+"*");
                    if (op.peek()=='/') val.push(v1+v2+"/");
                    op.pop();
                    op.push(ch);                    
                }
                else
                    op.push(ch);
            }
            
        }

        while (op.size() !=0) {
            String v2=val.pop();
            String v1=val.pop();
            if (op.peek()=='*') val.push(v1+v2+"*");
            if (op.peek()=='/') val.push(v1+v2+"/");
            if (op.peek()=='+') val.push(v1+v2+"+");
            if (op.peek()=='-') val.push(v1+v2+"-");
            op.pop();
        }
        System.out.println(val);

        
    }

    
}

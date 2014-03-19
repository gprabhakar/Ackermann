
package ackermann;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;


/**
 *
 * @author prabh_000
 */
public class Ackermann {
    
    static HashMap<String,BigInteger> ackMap= new HashMap(); 
    static BigInteger actcall=BigInteger.ZERO;  // to count the number of recursive calls reduced by using dynamic programming
    static BigInteger call=BigInteger.ZERO;     // to count the number of recursive calls
    
    public static BigInteger Ackerman(BigInteger m, BigInteger n)
{
   
    String key=m.toString()+"+"+n.toString();

    if (ackMap.containsKey(key))
    {
        actcall = actcall.add(BigInteger.ONE);   //using solution of a smaller problem
  
        return ackMap.remove(key);

   
    }
    else if (m.compareTo(BigInteger.ZERO) == 0)   // case m=0
    {
        return n.add(BigInteger.ONE);
    }
    else if(m.compareTo(BigInteger.ZERO)>0 && n.compareTo(BigInteger.ZERO)==0) // case m>0 && n=0
    { 
        call = call.add(BigInteger.ONE);
        ackMap.put(key, Ackerman(m.subtract(BigInteger.ONE), BigInteger.ONE));
        return ackMap.get(key);
    }
    else                                    //case m>0 && n>0
    {   call = call.add(BigInteger.ONE);
        call = call.add(BigInteger.ONE);
        ackMap.put(key,Ackerman(m.subtract(BigInteger.ONE), Ackerman(m, n.subtract(BigInteger.ONE))));
        return ackMap.get(key);
    }

       
}

    public static void main(String[] args) {
 
        BigInteger m=null,n=null;
        
        System.out.println("Enter values of m and n:\n");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            m=BigInteger.valueOf(Integer.parseInt(br.readLine()));
            n=BigInteger.valueOf(Integer.parseInt(br.readLine()));
            
        }
        catch(IOException e)
        {
            System.out.println("\nException!!");
          }
        System.out.println("Ackermann function says: "+Ackerman(m,n)+"\n Number of recursive calls: "+call+"\n Saved calls: "+actcall);
        
            
    }
}

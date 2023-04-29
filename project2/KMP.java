package project2;
import java.util.*;

public class KMP {
  
  public int[] failureFunction(String P)
  {
    int i=1,j=0;
    int[] ff = new int[P.length()];
    ff[0]=0;
    while(i<P.length())
    {
      if(P.charAt(i)==P.charAt(j))
      {
        j++;
        ff[i]=j;
        i++;
      }
      else
      {
        if(j!=0)
        {
          j=ff[j-1];
        }
        else
        {
          ff[i]=j;
          i++;
        }
      }
    }
    return ff;
  }
  
  public int match(String T, String P) {
    /** Your code goes here */
    int tlen = T.length();
    int plen = P.length();

    int[] ff= failureFunction(P);
    int i=0;
    int j=0;
    while((tlen-i)>=(plen-j))
    {
      if(P.charAt(j)==T.charAt(i))
      {
        i++;
        j++;
      }
      if(j==plen)
      {
        
        //System.out.println(Arrays.toString(ff));
        return i-j;
      }
      else if(i<tlen && P.charAt(j)!=T.charAt(i))
      {
        if(j!=0)
        {
          j = ff[j-1];
        }
        else
        {
          i = i+1;
        }
      }
    }
    return -1;
  }

}
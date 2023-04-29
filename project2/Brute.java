package project2;

public class Brute {

  public int match(String T, String P) {
    /** Your code goes here */
    int tlen = T.length();
    int plen = P.length();
    for(int i=0;i<tlen-plen+1;i++)
    {
      int j=0;
      for(;j<plen;j++)
      {
        if(T.charAt(i+j)!=P.charAt(j))
        {
          break;
        }   
      }
      if(j==plen)
      {
        return i;
      }
    }
    return -1;
  }
  
}

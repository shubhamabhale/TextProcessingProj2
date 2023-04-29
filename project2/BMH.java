package project2;
import java.util.*;
public class BMH {
  
  public int match(String T, String P) {
    /** Your code goes here */
    int m = P.length();
    int n = T.length();
    char[] text = T.toCharArray();
    char[] pattern = P.toCharArray();
    if (m == 0) return 0;  
    Map<Character, Integer> hmap = new HashMap<>();  
    for (int i = 0; i < n; i++)   
    {     
      hmap.put(text[i], -1);     
    }          
    for (int i = 0; i < m; i++)   
    {      
      hmap.put(pattern[i], i);   
    }    
    int i = m - 1;    
    int k = m - 1;    
    while (i < n)   
    {   
      if (text[i] == pattern[k])   
      {  
        if (k == 0)   
        {  
          return i;   
        }  
      i--;
      k--;  
      }   
      else   
      { 
        i += m - Math.min(k, 1 + hmap.get(text[i]));    
        k = m - 1;   
      }  
    }    
    return -1;   
  }
}

package ivtl;
import java.util.*;
public class swapoestring {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		// TODO Auto-generated method stub
      String s="";
      int i=0,j=0,p=0,q=0,c1=0,c2=0,k=0;
      s=x.next();
      char c[]=s.toCharArray();
      int l=c.length;
      char e[]=new char[100];
      char o[]=new char[100];
      char out[]=new char[1000];
      for(i=0;i<l;i++)
      {
    	  if(i%2==0)
    	  {
    		  e[c1]=c[i];
    		  c1++;
    	  }
    	  else
    	  {
    		  o[c2]=c[i];
    		  c2++;
    	  }
      }
      int len=c1+c2;
      
      for(i=0;i<len;i++)
      {
    	if(i%2==0)
    	{
    		out[i]=o[j];
    		j++;
    	}
    	else
    	{
    		out[i]=e[k];
    		k++;
    	}
	}
    p=j+k;
	for(i=0;i<p;i++)
	{
	System.out.print(out[i]);
	}
      
	}
}

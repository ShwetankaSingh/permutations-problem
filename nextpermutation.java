import java.io.*;
import java.util.*;
class nextpermutation
{
	public static void main(String args[])throws IOException
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			//int tt=Integer.parseInt(br.readLine()); 
			//String s=Integer.toString(tt);
			String ss[]=br.readLine().split("");
			int l=ss.length;
			int aa[]=new int[l];
			for(int i=0;i<l;i++)
				aa[i]=Integer.parseInt(ss[i]);
			int j=0;
            for(j=l-1;j>0;j--)
            {
              if(aa[j]>aa[j-1])
              	break;
            }
            if(j==0)
            	System.out.println("Not Possible");
            else
            {
            int le=j-1;
            int sa=j;
            for(int u=sa;u<l;u++)
            {
            	if(aa[u]>aa[le] && aa[u]<aa[sa])
            		sa=u;
            }
             int t=0;
             t=aa[le];
             aa[le]=aa[sa];
             aa[sa]=t;
             Arrays.sort(aa,j,l);
            for(int g=0;g<l;g++)
            	System.out.print(aa[g]);
		}
	}
}

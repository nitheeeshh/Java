public class Question2 
{
    public static void main(String args[])
    {
       char ar1[]={'a','b','c','d'};
       char ar2[]={'e','f','g'};
	   int z=ar1.length+ar2.length;
       char ar3[]=new char [z];
				
				for(int i=0;i<ar1.length;i++)
                {
                    ar3[i]=ar1[i];
                }
               
			   for(int j=0;j<ar2.length;j++)
                {
                    ar3[ar1.length+j]=ar2[j];
                }
               
			   for(int i=0;i<ar3.length;i++)
				{
					System.out.print(ar3[i]+" ");
				}
    }   
}
public class KthNumber
{
   public int findKth(int k)
   {
	   if(k <= 0)
	   {
		   return 0;
	   }
	   int[] array = new int[100];
	   array[0] = 3;
	   array[1] = 5;
	   array[2] = 7;
	   if(k <= 3)
	   {
		   return array[k-1];
	   }
	   int t3,t5,t7,t31,t51,t71;
	   t31=t51=t71=0;
       for(int i=3;i<100;i++)
       {
           t3 = 3 * array[t31];
           t5 = 5 * array[t51];
           t7 = 7 * array[t71];
           if(t3<t5 && t3<t7)
           {
               array[i]=t3;
               t31++;
           }else{
               if(t5<t7)
               {
                   array[i]=t5;
                   t51++;
               }else
               {
                   array[i]=t7;
                   t71++;
               }
           }
             if(array[i]==array[i-1])
              i--;
       }
       return array[k-1];
   }
   public static void main(String[] args)
  {
	KthNumber test = new KthNumber();
	System.out.println(test.findKth(3)); 
  }
}

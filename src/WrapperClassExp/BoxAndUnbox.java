/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WrapperClassExp;

/**
 *
 * @author shk123
 */
public class BoxAndUnbox 

{

        public static void main(String[] args)
        {
                 primitiveType();
                 wrapper_auto_boxing();
        }

         public static void primitiveType()
        {
                 long start = System.currentTimeMillis();
		 sumOfIntegerUptoN(1000000000);
		 long end = System.currentTimeMillis();
		 System.out.println((end - start));
        }
           public static void wrapper_auto_boxing()
        {
        
                     long start = System.currentTimeMillis();
                    sumOfIntegerUptoN(1000000000);
                    long end = System.currentTimeMillis();
                    System.out.println((end - start));
        }
         
         private static int sumOfIntegerUptoN(int N) {
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += i;
		}
		return sum;
	}

      

	private static Integer sumOfIntegerUptoN(Integer N) {
		Integer sum = 0;
		for (Integer i = 0; i < N; i++) {
			sum += i;
		}
		return sum;
	}

	

}

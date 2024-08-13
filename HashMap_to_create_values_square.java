//1.Create hash map whose key are 1 to 15 and its values square of keys. 

package problem;

import java.util.HashMap;
import java.util.Map;


public class HashMap_to_create_values_square {

	public static void main(String[] args) {
		
		        Map<Integer, Integer> squareMap = new HashMap<>();

		        for (int i = 1; i <= 15; i++) {
		            squareMap.put(i, i * i);
		        }

		        System.out.println(squareMap);
		 }
}

	



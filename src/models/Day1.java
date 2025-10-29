package models;

import java.util.HashMap;
import java.util.Arrays;


public class Day1 {
	
	public static void test() {
		    Jour01_TwoSum algo = new Jour01_TwoSum();
	        algo.tester();		

}


class Jour01_TwoSum extends SolutionBase {
    public Jour01_TwoSum() {
    	
        super("Two Sum", 
              "Trouver deux indices dont la somme égale la cible",
              "Facile",
              "Array & HashMap");
    }

    public int[] twoSum(int[] nums, int target) throws InvalidInputException {
    	
    	  if (nums == null || nums.length < 2) {
              throw new InvalidInputException("Il doit y avoir au moins deux éléments dans le tableau.");
          }
    
    	  HashMap<Integer, Integer> numMap = new HashMap<>();
    	  
    	  for (int i = 0; i < nums.length; i++) {
              int reste = target - nums[i];

              if (numMap.containsKey(reste)) {
                  
                  return new int[]{numMap.get(reste), i};
              }

            
              numMap.put(nums[i], i);
          }
    	
        return new int[0];
    }

    
    
    @Override
    public void tester() {
        System.out.println("\n=== JOUR 1: " + nom + " ===");
        try {
            int[] result1 = twoSum(new int[]{2, 7, 11, 15}, 9);
            System.out.println("Test 1: " + Arrays.toString(result1));

            int[] result2 = twoSum(new int[]{3, 2, 4}, 6);
            System.out.println("Test 2: " + Arrays.toString(result2));
        } catch (InvalidInputException e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }
}
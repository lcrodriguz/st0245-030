//Titulo: CodingBat: Java. Recursion-2

//Autor:Gregor Ulm

//Fecha:Marzo 2014

//Disponible:http://gregorulm.com/codingbat-java-recursion-2/

public boolean groupNoAdj(int start, int[] nums, int target) {
    
if (start >= nums.length) return target == 0;
    
return groupNoAdj(start + 2, nums, target - nums[start])
 || groupNoAdj(start + 1, nums, target);

}
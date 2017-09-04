//Titulo: CodingBat: Java. Recursion-2

//Autor:Gregor Ulm

//Fecha:Marzo 2014

//Disponible:http://gregorulm.com/codingbat-java-recursion-2/

public boolean groupSum6(int start, int[] nums, int target) {
    
if (start >= nums.length) return target == 0;
    
if (nums[start] == 6)
        
return groupSum6(start + 1, nums, target - nums[start]);
    
return groupSum6(start + 1, nums, target - nums[start])
 || groupSum6(start + 1, nums, target);

}
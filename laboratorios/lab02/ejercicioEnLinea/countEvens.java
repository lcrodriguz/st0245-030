public int countEvens(int[] nums) {
  
int cont = 0;
   
for (int i = 0; i < nums.length; i++)
    
if (nums[i] % 2 == 0) cont++;
     
return cont;

}
//Titulo: CodingBat: Java. Array-3
//Autor:Gregor Ulm

//Fecha:Marzo 2013

//Disponible:http://gregorulm.com/codingbat-java-array-3/

public int maxSpan(int[] nums) {
    if (nums.length > 0) {
        int maxSpan = 1;
        for (int i = 0; i < nums.length; i++)
            for (int j = nums.length - 1; j > i; j--)
                if (nums[j] == nums[i]) {
                    int count = (j - i) + 1;
                    if (count > maxSpan) maxSpan = count;
                    break;
                }
        return maxSpan;
    } else return 0;
}
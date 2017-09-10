//Titulo: CodingBat: Java. Array-3
//Autor:Gregor Ulm

//Fecha:Marzo 2013

//Disponible:http://gregorulm.com/codingbat-java-array-3/

public int countClumps(int[] nums) {
    int count = 0;
    for (int i = 0; i &lt; nums.length - 1; i++)
        if (nums[i] == nums[i + 1]) {
            count++;
            for (int j = i + 1; j &lt; nums.length; j++)
                if (nums[j] == nums[i]) i++;
                else break;
        }
    return count;
}
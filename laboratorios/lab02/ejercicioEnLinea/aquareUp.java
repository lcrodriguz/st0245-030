//Titulo: CodingBat: Java. Array-3
//Autor:Gregor Ulm

//Fecha:Marzo 2013

//Disponible:http://gregorulm.com/codingbat-java-array-3/

public int[] squareUp(int n) {
    int[] result = new int[n * n];
    int pos = 0;
 
    for (int i = 1; i &lt;= n; i++) {
        for (int k = 1; k &lt;= n - i; k++) result[pos++] = 0;
        for (int j = i; j &gt; 0; j--) result[pos++] = j;
    }
    return result;
}
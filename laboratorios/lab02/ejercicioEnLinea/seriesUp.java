//Titulo: CodingBat: Java. Array-3
//Autor:Gregor Ulm

//Fecha:Marzo 2013

//Disponible:http://gregorulm.com/codingbat-java-array-3/

public int[] seriesUp(int n) {
    int[] result = new int[n * (n + 1) / 2];
    int pos = 0;
    int i = 1;
    while (i &lt;= n + 1) {
        for (int j = 1; j &lt; i; j++) result[pos++] = j;
        i++;
    }
    return result;
}
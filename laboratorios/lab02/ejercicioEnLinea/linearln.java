//Titulo: CodingBat: Java. Array-3
//Autor:Gregor Ulm

//Fecha:Marzo 2013

//Disponible:http://gregorulm.com/codingbat-java-array-3/

public boolean linearIn(int[] outer, int[] inner) {
    int indexInner = 0;
    int indexOuter = 0;
    while (indexInner < inner.length && indexOuter < outer.length) {
        if (outer[indexOuter] == inner[indexInner]) {
            indexOuter++;
            indexInner++;
        } else indexOuter++;
    }
    return (indexInner == inner.length);
}
public int bunnyEars2(int b) {

    if (b == 0) return 0;
   
 if (b % 2 == 1) return 2 + bunnyEars2(b - 1);
    
else return 3 + bunnyEars2(b - 1);

}
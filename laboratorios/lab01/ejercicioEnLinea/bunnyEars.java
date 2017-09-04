public int bunnyEars(int b) {
  
if (b == 0) return 0;
  
else return 2 + bunnyEars(b - 1);

}
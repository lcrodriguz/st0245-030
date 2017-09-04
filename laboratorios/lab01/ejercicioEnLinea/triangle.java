public int triangle(int r) {

  if (r == 0) return 0;
  
  else return r + triangle(r- 1);

}
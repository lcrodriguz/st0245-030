public boolean has22(int[] n) {
  boolean r=false;
    for (int i = 0; i < n.length-1; i++){
        if (n[i] == 2 && n[i + 1] == 2) r=true;
    }
    return r;
}
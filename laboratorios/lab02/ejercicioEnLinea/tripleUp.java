public boolean tripleUp(int[] n) {
  
boolean r=false;
  
for(int i=0;i<n.length-2;i++){
  
if(n[i+1]==n[i]+1 && n[i+2]==n[i]+2)r=true;
  
}
  
return r;

}
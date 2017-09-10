public boolean modThree(int[] n) {
  
boolean r=false;
    
for (int i = 0; i < n.length -2; i++) {
if(n[i]%2==0&&n[i+1]%2==0&&n[i+2]%2==0)r=true;
    
if(n[i]%2==1&&n[i+1]%2==1&&n[i+2]%2==1)r=true;
    
}
    
return r;

}
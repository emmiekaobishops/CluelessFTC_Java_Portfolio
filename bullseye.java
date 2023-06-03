
void setup() {
  size(500, 500);
}

void draw() {
  int x=250;
  for (int i = 0; i<8; i++){
    
    if(i%2==0){
      fill(255, 0, 0);
      ellipse(250, 250, x, x);
    }
    
    else{
      fill(0, 0, 0);
      ellipse(250, 250, x, x);
    }
    
    x=x-30;
  }
}
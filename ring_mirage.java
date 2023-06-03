void setup() {
  size(600,600);
}

int x1=0;
int x2=600;

void draw() {
  background(255,0,255);

  int size1=250;
  for (int i = 0; i<24; i++){

  if(i%2==0){
    noFill();
    ellipse(x1, 300, size1, size1);
  }
  
  else{
    noFill();
    ellipse(x1, 300, size1, size1);}
    size1=size1-10;
    
  }


int size2=250;
for (int i = 0; i<24; i++){

  if(i%2==0){
    noFill();
    ellipse(x2, 300, size2, size2);
  }
  
  else{
    noFill();
    ellipse(x2, 300, size2, size2);}
    size2=size2-10;
  }
  if(x1>600){
    x1=0;
  }
  else{
    x1=x1+1;
  }
  if (x2<0){
    x2=600;
  }
  else{
    x2=x2-1;
  }

}
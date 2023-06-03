int x;
int y;

void setup() {
   size(800, 200);
   x=50;
   y = 50;
}

void draw() {
	background(200,200,200);

  fill(0,0,0);
  textSize(16);
  text("Click to make the dots race!", 20, 20);
 
  fill(255, 0, 0);
  ellipse(x, 150, 50, 50);
  fill(0, 255, 0);
  ellipse(y, 50, 50, 50);

  if (mousePressed){
    x+=random(1, 5);
    y+=random(1, 5);
  }

  if (x>800) {
    fill(0,0,0);
    textSize(16);
    text("Red wins!", 700, 20);
    
    try {
      Thread.sleep(3000);
    } 
    catch(InterruptedException e) {
      System.out.println("interrupted");
    }
    
    exit();
  }
  
  else if (y>800) {
    fill(0,0,0);
    textSize(16);
    text("Green wins!", 700, 20);
    
    try {
      Thread.sleep(3000);
    } 
    catch(InterruptedException e) {
      System.out.println("interrupted");
    }
    
    exit();
  }

}

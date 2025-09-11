size(300, 300);
background(255);

int i = 0;

while(i < 100){
  float x = random(width);
  float y = random(height);
  float r = random(5, 70);

  
  fill (random(255),random(255),random(255));
  stroke(0);
  ellipse(x, y, r, r);
  i++;
}

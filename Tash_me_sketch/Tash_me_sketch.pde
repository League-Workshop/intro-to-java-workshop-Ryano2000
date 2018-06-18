  PImage mustache;
  PImage friend;
void setup(){
size(800,800);
friend = loadImage("friend.jpg");
friend.resize(width,height);
mustache = loadImage ("mustache.png");
}
void draw(){
 background(friend);
 if(mousePressed) {
 image (mustache,mouseX,mouseY);
}
}
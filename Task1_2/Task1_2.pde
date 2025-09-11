//2.a
void setup (){
  String name = "Viktoria";
  //println(name);
  
  //2.b 
  int age = 37;
  //println(age);
  
  //2.c 
  boolean happy = true;
  //println(happy);
  
  //2.d 
  String prefix = "";
  if(!happy){
    prefix = "don`t ";
  }
  println("Hi, my name is. " + name + " " + "I am " + age + "years old. " + "I " + prefix + "clap my hands.");
}

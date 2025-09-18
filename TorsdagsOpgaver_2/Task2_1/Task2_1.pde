
void setup(){
  sayHello();
  printNameAndAge("Viktoria", 37);

}
void sayHello(){
  println("Hello from the method");
}

void printNameAndAge(String name, int age){
  println("My name is " + name + ", I am " + age + " years old.");
}

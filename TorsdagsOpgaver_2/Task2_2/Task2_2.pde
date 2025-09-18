boolean happy = true;


 void setup() {
   if (iAmHappy()){
     println("I clap my hands");
     
   }else{
     println("I don't clap my hands"); 
   }
   
int sumResult = sum (467, 876);
  println(sumResult);
    
String upper = toUpperCase("god weekend!");
  println(upper);

boolean startsWithUpper = startsWithUpperCase("God");
  println (startsWithUpper);
}

boolean iAmHappy(){
  // fill out what is missing here: 
  return happy;
}

int sum(int a, int b){ 
  return a + b;  
}

String toUpperCase(String text){
  return text;
}

boolean startsWithUpperCase(String text){
  return Character.isUpperCase(text.charAt(0));
}

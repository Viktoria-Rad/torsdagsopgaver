
void setup(){
  divisible(10);  
  
}
void divisible(int number){
  for(int i = 1; i <= 100; i++){
    if(i % number == 0){
      println(i); 
    }
    
  }
}

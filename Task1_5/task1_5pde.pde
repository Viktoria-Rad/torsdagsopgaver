void setup() {
  methodOne(); 
  methodTwo(); 
}

/*
  The following method has an error in it. Fix the error and run it. 
*/

void methodOne(){
  int i = 1000; // You are not allowed to change this line. 
  
  int max = 10;
  String output;
  
  if (i > max)
  {
    output ="i is greater than "+max+"."; 
   println(output);
  }
    
}

/* 
  Finish the following method so that we can change the number assigned 
  to the weekday and it prints the correct output.  
*/

void methodTwo(int dayNum){
  int weekDay = 0; // 0 = Monday, 6 = Sunday. 
  boolean weekend = false;
  String weekDay_str;
  
  
  // Print the name of the weekday here: 
  switch(weekDay){
    case 1: weekDay_str = "Monday";break;
    case 2: weekDay_str = "Tuesday";break;
    case 3: weekDay_str = "Wednesday";break;
    case 4: weekDay_str = "Thursday"; break;
    case 5: weekDay_str = "Friday"; break;  
    case 6: weekDay_str = "Saturday"; break;
    case 7: weekDay_str = "Sunday"; break;
    default:weekDay_str = "Unknown";break;
  } 
  println("Today is " + weekDay_str);
  if (weekDay < 5){
  }else {
  }
  
}

//1.a Lav en variabel month af typen String og en anden variabel days til at holde antal dage i en måned. 
void setup(){
  String month = "Januar";
  int days = 0;
  
  //1.b Lav en switch-case konstruktion.
  
  switch (month){
    case "Januar":
    case "Marts":
    case "Maj":
    case "Juli":
    case "August":
    case "Oktober":
    case "Desember":
      days = 31;
      break;
      
    case "April":
    case "Juni":
    case "September":
    case "Nivember":
      days = 30;
      break;
      
    case "Februar":
      days = 28;
      break;
  }
  //1.c Efter switch-case konstruktionen, udskrives en besked til brugeren, f.eks. "Januar har 31 dage"
  println(month + " har " + days + " dage.");
}

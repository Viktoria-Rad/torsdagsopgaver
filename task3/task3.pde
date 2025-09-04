String address = "Strandgade 21";
int sum = 2+2;
float divisionResult = 10/3;
String output = "sum:2+2=" + sum + "   divisionResult:10/3=" + divisionResult;
String userMessage = "God weekend";


void setup() {
 address = "Havnegade 10";
 println("Adresse: "+address);
 sum = 5+7;
 divisionResult = 15/4;
 output = "5+7=" + sum + "   15/4=" + divisionResult;
 println(output);
 
 //Tæl alle de numeriske variable op med 1.
 sum +=1;
 divisionResult+=1;
 output = ("sum+=1=" + sum +"   divisionResult+1=" + divisionResult);
 println(output);
 
 //Tæl alle de numeriske variable op med 3.
 sum +=3;
 divisionResult+=3;
 output = ("sum+=3=" + sum +"   divisionResult+3=" + divisionResult);
 println(output);

//Tæl alle de numeriske variable ned med 1.
sum -=1;
 divisionResult-=1;
 output = ("sum-=1=" + sum +"   divisionResult-1=" + divisionResult);
 println(output);

}

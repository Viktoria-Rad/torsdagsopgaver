 
void setup(){
  Teacher myTeacher = new Teacher ("Jannie", 42, true);
  
  Student student1 = new Student ("Viktoria", 37, true, "Team A");
  Student student2 = new Student ("Peter", 35, false, "Team B");
  
  println("Teacher: " + myTeacher.name);
  println("Student 1: " + student1.name + ", Team: " + student1.datamatikerTeam);
  println("Student 2: " + student2.name + ", Team: " + student2.datamatikerTeam);
}

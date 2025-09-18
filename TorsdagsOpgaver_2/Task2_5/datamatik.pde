void setup(){
  //Teacher myTeacher = new Teacher ("Jannie", 42, true);
  
  Student student1 = new Student ("Viktoria", 37, true, "Team B");
  Student student2 = new Student ("Peter", 35, false, "Team B");
  
  boolean classmates = isClassmates (student1, student2);
  
  //println("Teacher: " + myTeacher.name);
  //println("Student 1: " + student1.name + ", Team: " + student1.datamatikerTeam);
  //println("Student 2: " + student2.name + ", Team: " + student2.datamatikerTeam);
  
  if(classmates){
    println(student1.name + " and " + student2.name + " are classemates");
  }else{
    println(student1.name + " and " + student2.name + " are not classemates");
  }
}  
  boolean isClassmates(Student s1, Student s2){
    return s1.datamatikerTeam.equals(s2.datamatikerTeam);
  }

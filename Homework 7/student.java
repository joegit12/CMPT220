/*
for this problem you need to:
1. create 5 different students in your main
2. create a method in this file that returns if they're an honor roll student or not (gpa > 3.6) then
check each of the students in main
3. create a method to see if they get "free lunch" (this is a weird school, every day they generate a random student id
and see if any students match that id, if they do they get free lunch that day, yay!) compare a randomly generated id and the
id of the student to print the appropriate response.
 */

public class Student {
    String name;
    String year;
    double gpa;
    int id;
  


    public Student(String n, String y, double g, int i){
        name = n;
        year = y;
        gpa = g;
        id = i;
    }
    
    //new method
    public void honorRoll(){
        if(this.gpa > 3.6){
            System.out.println(this.name + " is an honor student");
        } else {
            System.out.println(this.name + " is not an honor student");
        }
    }
    
    //new method
    public void freeLunch(){
        if(this.id == 2017){
            System.out.println(this.name + " you get a free lunch");
        } else {
            System.out.println(this.name + " you do not get a free lunch");
        }
    }
}

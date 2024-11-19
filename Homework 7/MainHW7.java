// I gave a working example of a student!

public class MainHW7 {
    public static void main(String[] args){

            Student MelC = new Student("Melissa","Senior",3.4,1343);
            Student joeN = new Student("Joe", "Grad", 4.0, 2017);
            Student sebastian = new Student("Sebastian", "Junior", 3.5, 1111);
            Student taj = new Student("Taj", "Sophmore", 3.0, 1212);
            Student brian = new Student("Brian", "Freshmen", 2.0, 2231);
            Student jasmine = new Student("Jasmine", "Sophmore", 3.8, 1515);


            joeN.honorRoll();
            taj.honorRoll();
            sebastian.honorRoll();
            brian.honorRoll();
            jasmine.honorRoll();
            MelC.honorRoll();
            
            joeN.freeLunch();
            taj.freeLunch();
            sebastian.freeLunch();
            brian.freeLunch();
            jasmine.freeLunch();
            MelC.freeLunch();

    }
}









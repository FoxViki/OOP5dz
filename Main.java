import Controler.Controler;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Controler controler = new Controler();

        controler.createTeacher("kus", "kus", "kus");
        controler.createStudent("ann", "ann", "ann");
        controler.createStudent("ben", "ben", "ben");
        controler.createStudent("ksu", "ksu", "ksu");
        controler.createStudent("mum", "mum", "mum");
        controler.createTeacher("sun", "sun", "sun");
        controler.createStudent("gum", "gum", "gum");
        controler.createStudent("dzo", "dzo", "dzo");
        controler.createStudent("axe", "axe", "axe");
        //controler.printStudentsList(controler.getStudentsList());

        System.out.println();

        controler.printGroupLearn(controler.createGroupLearn(1, 1, 3, 5, 7));
    
        System.out.println();
    }
}
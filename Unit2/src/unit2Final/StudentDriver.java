package unit2Final;

import java.util.ArrayList;

/*
    Kai Harrelson, Sep 21, 2022
 */

public class StudentDriver {

    static ArrayList<Student> students = new ArrayList<Student>();

    public static void main(String[] args) {

        students.add(new Student("Kai", "Comp Sci A", 99));
        students.add(new Student("Eric", "Physics", 83));
        students.add(new Student());
        students.add(new Student());

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            String studentName = student.getName();
            String studentCourse = student.getCourse().substring(6);
            int studentGrade = student.getGrade();
            int numScores = student.getNumScores();
            int totalPoints = student.getPoints();
            double studentGPA;
            if (!(numScores == 0)){
                studentGPA = totalPoints / numScores;
            } else {
                studentGPA = 0;
            }

            System.out.println(
                            "\n"+studentName+"\n"+
                            studentCourse+"\n"+
                            "Grade: "+studentGrade+"\n"+
                            "Number of scores: "+numScores+"\n"+
                            "Total points: "+totalPoints+"\n"+
                            "GPA: "+studentGPA+"\n"
            );
        }

        students.get(0).addScore(90);
        students.get(0).addScore(100);

        students.get(1).addScore(83);
        students.get(1).addScore(70);
        students.get(1).addScore(63);
        students.get(1).addScore(90);

        students.get(2).addScore(47);
        students.get(2).addScore(80);
        students.get(2).addScore(65);
        students.get(2).addScore(70);

        students.get(3).addScore(90);
        students.get(3).addScore(85);
        students.get(3).addScore(100);
        students.get(3).addScore(78);
        students.get(3).addScore(96);
        students.get(3).addScore(81);

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            String studentName = student.getName();
            String studentCourse = student.getCourse().substring(6);
            int studentGrade = student.getGrade();
            int numScores = student.getNumScores();
            int totalPoints = student.getPoints();
            double studentGPA;
            if (!(numScores == 0)){
                studentGPA = totalPoints / numScores;
                studentGPA = (studentGPA / 100) * 4;
            } else {
                studentGPA = 0;
            }

            System.out.println(
                    "\n"+studentName+"\n"+
                            studentCourse+"\n"+
                            "Grade: "+studentGrade+"\n"+
                            "Number of scores: "+numScores+"\n"+
                            "Total points: "+totalPoints+"\n"+
                            "GPA: "+studentGPA+"\n"
            );
        }
    }
}

package unit2Final;

public class Student {
    private String name;
    private String courseName;
    private int grade;
    private int numScores;
    private int totalPoints;

    public Student(){
        name = "Student";
        courseName = "BHS:  Course";
        grade = 0;
        numScores = 0;
        totalPoints = 0;
    }

    public Student (String sName, String sClass, int sGrade) {
        name = sName;
        courseName = "BHS:  " + sClass;
        grade = sGrade;
        numScores = 0;
        totalPoints = 0;
    }

    public String getName () {
        return name;
    }

    public String getCourse () {
        return courseName;
    }

    public int getGrade () {
        return grade;
    }

    public int getNumScores () {
        return numScores;
    }

    public int getPoints () {
        return totalPoints;
    }

    public void setName (String sName) {
        name = sName;
    }

    public void setCourse (String sCourse) {
        courseName = "BHS:  " + sCourse;
    }

    public void setGrade (int sGrade) {
        grade = sGrade;
    }

    public void addScore (int score) {
        numScores ++;
        totalPoints = totalPoints + score;
    }

}

import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }
    public double getGradeAverage(ArrayList<Integer>grades){
        double total = 0;
        for (int grade:grades){
            total += grade;
        }
        return total;
    }

    public Student(long id, String name, ArrayList<Integer>grades){
        setId(id);
        setName(name);
        setGrades(grades);
    }


}

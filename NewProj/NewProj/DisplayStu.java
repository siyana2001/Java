package NewProj;

class stuid
{
    int studentID;
    String studentName;


    void setStudentInfo(int id, String name) {
        studentID = id;
        studentName = name;
    }

    void displayStudentInfo() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
    }
}

public class DisplayStu {
    public static void main(String[] args) {
        
        stuid student1 = new stuid();

        
        student1.setStudentInfo(1001, "Arun.J");

      
        student1.displayStudentInfo();
    }
}

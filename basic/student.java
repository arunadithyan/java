package arun.basic;

class Subject {
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtains;

    public Subject(String subID, String name, int maxMarks) {
        this.subID = subID;
        this.name = name;
        this.maxMarks = maxMarks;
    }

    public String getSubID() {
        return subID;
    }

    public String getName() {
        return name;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public int getMarksObtains() {
        return marksObtains;
    }

    public void setMaxMarks(int mm) {
        maxMarks = mm;
    }

    public void setMarksObtain(int m) {
        marksObtains = m;
    }

    String isQualified() {
        if (marksObtains >= maxMarks / 10 * 4)
        return "Pass";
        else{
            return "Fail";
        }
    }

    public String toString() {
        return "\nSubjectID: " + subID + "\nName: " + name + "\nMarksObtained: " + marksObtains + "\nQulaified: "+ isQualified ();
    }
}

class Student {
    private String rollNo;
    private String dept;
    private Subject[] subjects;

    public Student(String rollNo, String dept, Subject[] subjects) {
        this.rollNo = rollNo;
        this.dept = dept;
        this.subjects = subjects;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getDept() {
        return dept;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Roll Number: ").append(rollNo)
                .append("\nDepartment: ").append(dept)
                .append("\nSubjects: ");
        for (Subject subject : subjects) {
            sb.append(subject.getName()).append(": ").append(subject.getMarksObtains()).append("=").append(subject.isQualified ()).append(" ");
        }
        return sb.toString();
    }
}

public class student {
    public static void main(String[] args) {
        Subject[] subs = new Subject[3];
        subs[0] = new Subject("s101", "DS", 100);
        subs[1] = new Subject("s102", "Algorithms", 100);
        subs[2] = new Subject("s103", "Operating Systems", 100);

        Student student = new Student("2023001", "Computer Science", subs);

        subs[0].setMarksObtain(70);
        subs[1].setMarksObtain(60);
        subs[2].setMarksObtain(10);

        System.out.println(student);
    }
}


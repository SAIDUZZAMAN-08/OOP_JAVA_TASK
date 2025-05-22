

import java.util.Date;

class Student {
    private int ID;
    private String name;
    private String program;

    public Student(int ID, String name, String program) {
        this.ID = ID;
        this.name = name;
        this.program = program;
    }

    public int getID() { return ID; }
    public String getName() { return name; }
    public String getProgram() { return program; }

    public void setID(int ID) { this.ID = ID; }
    public void setName(String name) { this.name = name; }
    public void setProgram(String program) { this.program = program; }
}

class Instructor {
    private int ID;
    private String name;
    private String department;
    private String title;

    public Instructor(int ID, String name, String department, String title) {
        this.ID = ID;
        this.name = name;
        this.department = department;
        this.title = title;
    }


    public int getID() { return ID; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public String getTitle() { return title; }

    public void setID(int ID) { this.ID = ID; }
    public void setName(String name) { this.name = name; }
    public void setDepartment(String department) { this.department = department; }
    public void setTitle(String title) { this.title = title; }
}

class Course {
    private int ID;
    private String syllabus;
    private String title;
    private String credits;
    private String prerequisite;

    public Course(int ID, String syllabus, String title, String credits, String prerequisite) {
        this.ID = ID;
        this.syllabus = syllabus;
        this.title = title;
        this.credits = credits;
        this.prerequisite = prerequisite;
    }

    public int getID() { return ID; }
    public String getSyllabus() { return syllabus; }
    public String getTitle() { return title; }
    public String getCredits() { return credits; }
    public String getPrerequisite() { return prerequisite; }

    public void setID(int ID) { this.ID = ID; }
    public void setSyllabus(String syllabus) { this.syllabus = syllabus; }
    public void setTitle(String title) { this.title = title; }
    public void setCredits(String credits) { this.credits = credits; }
    public void setPrerequisite(String prerequisite) { this.prerequisite = prerequisite; }
}

class CourseOffering {
    private int studentID;
    private int instructorID;
    private int courseID;
    private Date time;
    private int sectionNo;
    private int roomId;
    private int year;
    private String semester;

    public CourseOffering(int studentID, int instructorID, int courseID, Date time,
                          int sectionNo, int roomId, int year, String semester) {
        this.studentID = studentID;
        this.instructorID = instructorID;
        this.courseID = courseID;
        this.time = time;
        this.sectionNo = sectionNo;
        this.roomId = roomId;
        this.year = year;
        this.semester = semester;
    }

    public int getStudentID() { return studentID; }
    public int getInstructorID() { return instructorID; }
    public int getCourseID() { return courseID; }
    public Date getTime() { return time; }
    public int getSectionNo() { return sectionNo; }
    public int getRoomId() { return roomId; }
    public int getYear() { return year; }
    public String getSemester() { return semester; }

    public void setStudentID(int studentID) { this.studentID = studentID; }
    public void setInstructorID(int instructorID) { this.instructorID = instructorID; }
    public void setCourseID(int courseID) { this.courseID = courseID; }
    public void setTime(Date time) { this.time = time; }
    public void setSectionNo(int sectionNo) { this.sectionNo = sectionNo; }
    public void setRoomId(int roomId) { this.roomId = roomId; }
    public void setYear(int year) { this.year = year; }
    public void setSemester(String semester) { this.semester = semester; }
}
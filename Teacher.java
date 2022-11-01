public class Teacher {
    String teachername;
    int teacherID;

    public Teacher(String teachername,int teacherID )
    {
        this.teachername = teachername;
        this.teacherID = teacherID;
    }
    public void display()
    {
        System.out.println("\n Name = " +teachername);
        System.out.println("ID = " +teacherID);
    }

}
class Professor extends Teacher  {
    String teacherName;
    int teacherId;

    public Professor(String teacherName, int teacherId)
    {
        super(teacherName, teacherId);
        this.teacherName = teacherName;
        this.teacherId = teacherId;
    }
    public void display()
    {
        System.out.println("\n Name = "+teacherName);
        System.out.println("\n Id = "+teacherId);
    }
}
class Assistant_Professor extends Teacher  {
    String teacherName;
    int teacherId;

    public Assistant_Professor(String teacherName, int teacherId)
    {
        super(teacherName, teacherId);
        this.teacherName = teacherName;
        this.teacherId = teacherId;
    }
    public void display()
    {
        System.out.println("\n Name = "+teacherName);
        System.out.println("\n Id = "+teacherId);
    }
}
class Associate_Professor extends Teacher  {
    String teacherName;
    int teacherId;

    public Associate_Professor(String teacherName, int teacherId)
    {
        super(teacherName, teacherId);
        this.teacherName = teacherName;
        this.teacherId = teacherId;
    }
    public void display()
    {
        System.out.println("\n Name = "+teacherName);
        System.out.println("\n Id = "+teacherId);
    }
}
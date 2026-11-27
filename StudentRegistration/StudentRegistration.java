import java.util.ArrayList;

public class StudentRegistration
{
    static class Student
    {
        private final String name;
        private final int age;
        private final double grade;

        Student(String name, int age, double grade)
        {
            if (name==null||name.trim().isEmpty())
            {
                throw new IllegalArgumentException("Name cannot be empty.");
            }
            if (age <1|| age >120)
            {
                throw new IllegalArgumentException("Age must be between 1 and 120.");
            }
            if (grade <0 || grade >100)
            {
                throw new IllegalArgumentException("Grade must be between 0 and 100.");
            }
            this.name = name.trim();
            this.age = age;
            this.grade = grade;
        }

        public String getName()
        {
            return name;
        }
        
        public int getAge()
        {
            return age;
        }

        @Override
        public String toString()
        {
            return "Name: " + name + " , Age: " + age + " , Grade: " + grade;
        }
    }
    private static final ArrayList<Student> students = new ArrayList<>();

    public static void registerStudent(String name, int age, double grade)
    {
        Student newStudent = new Student(name, age, grade);

        for (Student existing : students)
        {
            if (existing.getName().equalsIgnoreCase(newStudent.getName()) && existing.getAge() == newStudent.getAge())
            {
                throw new IllegalArgumentException("This student is already registered.");
            }
        }
        students.add(newStudent);
    }
    public static void displayStudents()
    {
        for (Student student : students)
        {
            System.out.println(student);
        }
    }

    private static void tryToRegister(String name, int age, double grade)
    {
        try
        {
            registerStudent(name, age, grade);
            System.out.println("Student added: " + name);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Could not add student: " + e.getMessage());
        }
    }

    public static void main(String[] args)
    {
        tryToRegister("", -5, 150);
        tryToRegister("John", 20, 85);
        tryToRegister("John", 20, 85);

        System.out.println("--- Registered Students ---");
        displayStudents();
    }
}
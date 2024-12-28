import classes.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        University university = new University("Example University");
        university.setFaculties(new ArrayList<>());

        Staff dean = new Administrator(123456, "John Doe", "john.doe@example.com");

        Faculty faculty = new Faculty("Faculty of Science", dean);
        faculty.setInstitutes(new ArrayList<>());
        university.addFaculty(faculty);

        Institute institute = new Institute("Institute of Physics", "123 Science St");
        institute.setResearchers(new ArrayList<>());
        faculty.addInstitute(institute);

        Researcher researcher = new Researcher(654321, "Jane Smith", "jane.smith@example.com", "Quantum Physics");
        researcher.setProjects(new ArrayList<>());
        institute.addResearchEmployee(researcher);

        Project project = new Project("Quantum Computing", 100, 20230101, 20231231);
        researcher.addProject(project);

        Lecturer lecturer = new Lecturer(789123, "Alice Johnson", "alice.johnson@example.com", "Computer Science");
        Course course = new Course(101, "Introduction to Computer Science", 3);

        System.out.println("University: " + university.getName());
        System.out.println("Faculties:");
        for (Faculty f : university.getFaculties()) {
            System.out.println(" - " + f.getName());
            System.out.println("   Dean: " + f.getDean().getName());
            System.out.println("   Institutes:");
            for (Institute i : f.getInstitutes()) {
                System.out.println("    - " + i.getName());
                System.out.println("      Address: " + i.getAddress());
                System.out.println("      Researchers:");
                for (Researcher r : i.getResearchEmployees()) {
                    System.out.println("       - " + r.getName());
                    System.out.println("         Field of Study: " + r.getFieldOfStudy());
                    System.out.println("         Projects:");
                    for (Project p : r.getProjects()) {
                        System.out.println("          - " + p.getName());
                    }
                }
            }
        }
    }
}

class ProjectManager{
    String yourName;
    int teamSize;

    ProjectManager(String yourName, int teamSize) {
        this.yourName = yourName;
        this.teamSize = teamSize;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + yourName);
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends ProjectManager{
    String programmingLanguage;

    Developer(String yourName, int teamSize, String programmingLanguage) {
        super(yourName, teamSize);
        this.programmingLanguage = programmingLanguage;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("I am the Developer in the team ");
        System.out.println("Programming Language used : " + programmingLanguage);
    }
}

class Tester extends ProjectManager{
    String testingTool;

    Tester(String yourName, int teamSize, String testingTool) {
        super(yourName, teamSize);
        this.testingTool = testingTool;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("I am the Tester in the team");
        System.out.println("Testing Tool used: " + testingTool);
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {

        Developer dev = new Developer("Sujal", 3, "Java");
        Tester tester = new Tester("Yash", 3, "Selenium");

        dev.displayDetails();
        tester.displayDetails();

    }
}

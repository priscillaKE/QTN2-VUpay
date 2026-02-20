import java.util.Scanner;

public class VUCourses {
    public static void main(String[] args) {
        // Variable declarations
        String moduleCode;
        String module;
        int tuition;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter ModuleCode (BSF, BIT, BCS, BCE): ");
        moduleCode = input.nextLine().trim().toUpperCase();

        switch (moduleCode) {
            case "BSF":
                module = "BSc. Software Engineering";
                tuition = 900000;
                break;
            case "BIT":
                module = "BSc. Information Technology";
                tuition = 750000;
                break;
            case "BCS":
                module = "BSc. Computer Science";
                tuition = 800000;
                break;
            case "BCE":
                module = "BSc. Computer Engineering";
                tuition = 950000;
                break;
            default:
                System.out.println("Wrong Module Code details");
                input.close();
                return;
        }

        System.out.println("Module: " + module);
        System.out.println("ModuleCode: " + moduleCode);
        System.out.println("Tuition: " + String.format("%,d", tuition));

        input.close();
    }
}

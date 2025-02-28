public class Help {
    public static void main(String[] args)
        throws java.io.IOException {
        int ch;
        System.out.println("Help on");
        System.out.println("1. if ");
        System.out.println("2. switch");
        System.out.print("Choose one: ");
        ch =(char) System.in.read();

        switch (ch) {
            case '1':
                System.out.println("The if: \n");
                System.out.println("if(conditional) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch (expression) {");
                System.out.println("case option:");
                System.out.println("statment sequence...");
                System.out.println("    break;");
                System.out.println("    // ...");
                System.out.println("}");
                break;
            default:
                System.out.println("Selection not found");
        }
    }
}

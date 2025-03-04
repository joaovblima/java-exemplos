public class Phone {
    public static void main(String[] args) {
        String[][] numbers = {
                {"Tom", "555-555"},
                {"Mary", "333-333"},
                {"Jon", "444-444"},
                {"Doe", "000-000"}
        };

        int i;

        if(args.length != 1) {
            System.out.println("uso correto: java phone <nome>");
        } else {
            for (i = 0; i < numbers.length; i++) {
                if(numbers[i][0].equals(args[0])) {
                    System.out.println(numbers[i][0] + ": " + numbers[i][1]);
                    break;
                }
            }
            if(i == numbers.length) {
                System.out.println("Nome nao encontrado.");
            }
        }
    }
}

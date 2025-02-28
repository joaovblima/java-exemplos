public class IfDemo {
    public static void main(String[] args) {
        int a, b, c;

        a = 2;
        b = 3;

        if(a < b) {
            System.out.println("a menor que b");
        }
        if (a ==b) {
            System.out.println("Você nao verá isso");
        }
        System.out.println();
        c = a - b;
        System.out.println("c contém "+ c);

        if (c >= 0){
            System.out.println("c é não-negativo");
        } else {
            System.out.println("c é negativo.");
        }

        System.out.println();

        c = b - a;
        System.out.println("c contém "+ c);
        if(c>=0){
            System.out.println("c é não negativo");
        } else {
            System.out.println("c é negativo");
        }
    }

}

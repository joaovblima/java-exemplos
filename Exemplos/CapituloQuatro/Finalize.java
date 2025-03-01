public class Finalize {
    public static void main(String[] args) {
        int count;
        FDemo ob = new FDemo(0);

        for(count = 1; count<1000; count ++) {
            ob.generator(count);
        }
    }

}

class FDemo {
    int x;

    FDemo(int i) {
        x = i;
    }


    protected void finalize() {
        System.out.println("finalizando "+ x);
    }

    void generator(int i) {
        FDemo o = new FDemo(i);
    }
}

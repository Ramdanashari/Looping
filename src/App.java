public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 7; i = i + 1) {
            System.out.println("Saya Semangat Belajar Java");
        }
        
        System.out.println("\t");
        
        int oddNumber = 1;
        for (int i = 0; i < 6; i++) {
            System.out.println(oddNumber);
            oddNumber += 2;
        }

        System.out.println("\t");

        int loopMin3 = 9;
        for (int i = 0; i < 6; i++) {
            System.out.println(loopMin3);
            loopMin3 -= 3;
        }

        System.out.println("\t");

        int base = 4;
        int loop_count = 4;
        int start = 1;
        int hasil = 0;

        for (int i = 0; i < loop_count; i = i + 1) {
            int by = start + i;
            hasil = base * by;
            System.out.println(base + " x " + by + " = " + hasil );
        }

        System.out.println("\t");

        Looping loopingA = new Looping(99, 20, 5);
        loopingA.Loop();
    }
}
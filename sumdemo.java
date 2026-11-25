class SumDemo {
    public static void main (String agrs []){
        Summation s1 = new Summation(5);
        Summation s2 = new Summation(10);
        System.out.println("Summation of 5 is " + s1.sum());
        System.out.println("Summation of 10 is " + s2.sum());
    }
}

class Summation {
    private final int number;

    Summation(int number) {
        this.number = number;
    }

    int sum() {
        int total = 0;
        for (int i = 1; i <= number; i++) {
            total += i;
        }
        return total;
    }
}

class Overload {
    public static void main (String args[]){
        Overload ob = new Overload();
        ob.ovlDemo();
        ob.ovlDemo(2);
        ob.ovlDemo(3,4);
        ob.ovlDemo(1.1, 2.2);
    }
    void ovlDemo(){
        System.out.println("No parameters");
    }
    void ovlDemo(int a) {
        System.out.println("One integer parameter: " + a);
    }
    int ovlDemo(int a, int b) {
        System.out.println("Two integer parameters: " + a + " and " + b);
        return a + b;
    }
    double ovlDemo(double a, double b) {
        System.out.println("Two double parameters: " + a + " and " + b);
        return a + b;
    }
}

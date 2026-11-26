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
class SumsDemo {
    public static void main (String args[]){
        Summation s1 = new Summation(5);
        Summation s2 = new Summation(10);
        System.out.println("Summation of 5 is " + s1.sum());
        System.out.println("Summation of 10 is " + s2.sum());
    }
}
class Bubble {
    public static void main (String args[]){
        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int a, b, t;
        int size;
        size = nums.length;
        System.out.println("Original array:");
        for (int i = 0; i < size; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        for (a = 1; a < size; a++) {
            for (b = size - 1; b >= a; b--) {
                if (nums[b-1] > nums[b]) {
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
        }
        System.out.println("Sorted array:");
        for (int i = 0; i < size; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
class Assign {
    public static void main (String args[]){
        int i;
        int nums1[] = new int[10];
        int nums2[] = new int[10];
        for (i = 0; i < 10; i++) {
            nums1[i] = i;
        }
        for (i = 0; i < 10; i++) {
            nums2[i] = nums1[i];
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
    }
}
class LengthDemo {
    public static void main (String args[]){
        int list[] = new int[10];
        int nums[] = {1, 2, 3, 4, 5};
        int table[][] = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };
        System.out.println("Length of list: " + list.length);
        System.out.println("Length of nums: " + nums.length);
        System.out.println("Length of table: " + table.length);
        System.out.println("Length of table[0] is " + table[0].length);
        System.out.println("Length of table[1] is " + table[1].length);
        System.out.println("Length of table[2] is " + table[2].length);
        System.out.println();
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
class STrops {
    public static void main (String args[]) {
        String str1 =
        "When it comes to web programing, Java is #1.";
        String str2 = new String(str1);
        String str3 = "Java strings are powerful.";
        int result, idx;
        result = str1.compareTo(str2);
        System.out.println("result of str1.compareTo(str2) is " + result);
        result = str1.compareTo(str3);
        System.out.println("result of str1.compareTo(str3) is " + result);
        idx = str1.indexOf("Java");
        System.out.println("Index of Java in str1 is " + idx);
        idx = str1.indexOf("java");
        System.out.println("Index of java in str1 is " + idx);
    }
}
class StringArray {
    public static void main (String args []){
        String str[] = {"This", "is", "a", "test."};
        System.out.println ("Original array:");
        for (String s : str)
            System.out.print(s + " ");
            System.out.println("\n");
        str[1] = "was";
        str[3] = "test!";
        System.out.println("Modified array:");
        for (String s : str)
            System.out.print(s + " ");
    }
}
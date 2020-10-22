class Students{
    String name = "sato";

    public void calculatedAvg(int math, int english) {
        System.out.println((math + english)/2);
    }
}

public class Student {
    public static void main(String[] args) {
        Students a001 = new Students();
        a001.name = "sato";

        System.out.println(a001.name);
    }
}
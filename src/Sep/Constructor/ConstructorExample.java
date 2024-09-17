package Sep.Constructor;

class coaching {
    int id;
    String name;
    String batch;
    boolean isPass;

    coaching() { //Name of cunstructor should be same as class name
        System.out.println("Welcome to our coaching");
    }

}


public class ConstructorExample {
    public static void main(String[] args) {

        coaching c = new coaching();


    }
}

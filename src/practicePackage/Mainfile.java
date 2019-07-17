package practicePackage;

public class Mainfile {
    public static void main(String[] args) {
        Bookclass b1 = new Bookclass();
        System.out.println("1st java program");
        b1.setName("Java modified");
        b1.setPrice(500);
        System.out.println(b1.getName());
        System.out.println(b1.getPrice());
        System.out.println("modified program for branching");


        /*System.out.println('name of the book',b1.getName());*/
    }
}

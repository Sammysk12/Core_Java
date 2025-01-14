package Functions;

public class Function_1 {

    public static void greetUser(String name){
        System.out.println("Hello! "+name);
    }
    public static void main(String[] args) {
        System.out.println("In main method");
        System.out.println("Good morning!");
        greetUser("Sam");
        System.out.println("Method calling complete");
    }
}

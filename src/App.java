public class App {
    public static void main(String[] args) {
        System.out.println("Welcome!!");
        System.out.println("Stuff Happens...");
        System.out.println("More stuff happens");

        contador();
    }

    private static void contador() {
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
}

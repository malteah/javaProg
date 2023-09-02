public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        
        int a = 10;
        int b = 15;
        assert (a == b) == false;

        int c = 10;
        assert (a == c) == true;

        int d = a;
        assert (a == d) == true;

        
    }
}

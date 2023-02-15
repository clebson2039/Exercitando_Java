/*public class App {
    public static void main(String[] args) throws Exception {
        
        int num1 = 300;
        int num2 = 2000;
        int resultado = num1 + num2;

        System.out.println(resultado);
    }
}*/

/*public class App {
    public static void main(String[] args) throws Exception {
        int num1 = 300;
        int num2 = 2000;

        if (num1 > num2) {
            System.out.println("**true**");
        } else {
            System.out.println("**false**");
        }
    }
}*/

/*public class App {
    public static void main(String[] args) {
        String[] carros = { "Fusca", "Brasilia", "Gurgel" };
        System.out.println(carros[0]); //Pegando por index
    }
}*/

public class App {
    public static void main(String[] args) {

        String[] carros = { "Fusca", "Brasilia", "Gurgel" };
        for (String element : carros) {
            System.out.println(element);
        }
    }
}

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una constraseña, si son iguales a los datos dados imprimirá en terminal: Acceso concedido, si no son iguales imprimirá en terminal: Nombre de usuario o contraseña incorrecta.
        //Averigua como hacer para poder ingresar el dato justo al lado de lo que termine la pregunta, es decir, que no haga un salto de línea.
        Scanner myObj = new Scanner(System.in);
        System.out.print("Escribe tu usuario ");
        String userName = myObj.nextLine();
        System.out.print("Escribe tu contraseña ");
        String password = myObj.nextLine();
        String rightUserName = "Eva";
        String rightPassword = "Kitty";
        if( userName.compareTo(rightUserName) == 0 && password.compareTo(rightPassword) == 0 ){
                System.out.println("Acceso Concedido");

        } else {
            System.out.println("Nombre de usuario o contraseña incorrecta");
        }
    }
}

import java.util.Scanner;
class MainPersona{

public static void main(String[] args) {
    Scanner op= new Scanner(System.in);
    String a, b;
    int c;
    Paciente x = new Paciente();
    System.out.println("tu nombre es ");
    a= op.next();
    x.nombre = a;
    System.out.println("cual es tu apellido");
    b = op.next();
    x.apellido = b;
    System.out.println("cual es tu nss");
    c = op.nextInt();
    x.nss= c;
  
    x.mostrarNombre();
    x.mostrarApellido();
    x.mostrarNss();

}


}
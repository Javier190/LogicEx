public class Recursividad {

    public static void main(String[] args) {

        System.out.println("Ejercicio Recursividad " );

        Recursividad recursividad = new Recursividad();
        recursividad.recursiv(5);
    }

    public void recursiv (int n){
        if (n != 0){
            System.out.println("bien");
            recursiv(n-1);
        }else {
            System.out.println("Programa Terminado");
        }
    }
}

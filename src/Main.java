import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Float> notas = new ArrayList<>();
    public static void main(String[] args) {
        IngresarNotas();
    }
    public static void IngresarNotas(){
        Scanner scanner = new Scanner(System.in);
        Float nota;
        do{
            System.out.println("Ingrese una nota o si no quiere agregar notas ingrese -1");
            nota = scanner.nextFloat();
            if(nota!=-1){
                notas.add(nota);
            }
        }while(nota != -1);
        System.out.println(nota);
    }
}
//Hola
//Que onda cracks
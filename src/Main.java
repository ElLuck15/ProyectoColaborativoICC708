import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

    }
    public static Float PromedioNotas(List<Float> notas){
        float avg = 0;
        for (int i = 0;i<notas.size();i++){
            avg+= notas.get(i);
        }
        return avg/notas.size();
    }
}
//Hola
//Que onda cracks
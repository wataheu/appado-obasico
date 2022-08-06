package petrescuesaga;
import adoção.animais;
import adoção.cachorros;
import adoção.gatos;
import java.util.ArrayList;

public class petrescuesaga {
    public static Object cachorros1;

    public static void main(String[] args) {
//cahorros
        cachorros cachorros1 = new cachorros();
        cachorros1.setNome("Thor");
        cachorros1.setCor("caramelo");
        cachorros1.setIdade("dois anos");
        cachorros1.setLocalização("itaquera, São Paulo");
        cachorros1.setRaça("vira lata");
        System.out.println(cachorros1.getNome());
        System.out.println(cachorros1.getCor());
        System.out.println(cachorros1.getRaça());
        System.out.println(cachorros1.getLocalização());
        System.out.println(cachorros1.getIdade());

        //gatos
        gatos gatos1 = new gatos();
        gatos1.setNome("floquinho");
        gatos1.setCor("castanho escuro");
        gatos1.setIdade("seis meses");
        gatos1.setLocalização("vila mariana, São Paulo");
        gatos1.setRaça("siamês");
        System.out.println(gatos1.getNome());
        System.out.println(gatos1.getCor());
        System.out.println(gatos1.getRaça());
        System.out.println(gatos1.getLocalização());
        System.out.println(gatos1.getIdade());



    }
}
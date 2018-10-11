import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Automovel[] arrayauto = new Automovel[3];
        arrayauto[0] = new Automovel("BMW", "I3", "31-27-AB");
        arrayauto[1] = new Automovel("BMW", "I5", "45-43-BB");
        arrayauto[2] = new Automovel("Opel", "Astra", "21-ZZ-45");

         for(int i = 0; i < 3; i++){
            System.out.println(arrayauto[i]);
        }

        ArrayList<Automovel> autoList = new ArrayList<>();
        autoList.add(arrayauto[0]);
        autoList.add(arrayauto[1]);
        autoList.add(arrayauto[2]);
         for (int i = 0; i < 3; i++){
            System.out.println(autoList.get(i));
        }
        HashMap<String, Integer> carros = new HashMap<>();
         for(int i = 0; i<3; i++) {
            if(carros.containsKey(autoList.get(i).marca)){
                int nmr = carros.get(autoList.get(i).marca);
                carros.put(autoList.get(i).marca, nmr + 1);
            } else {
                carros.put(autoList.get(i).marca, 1);
            }

        }


        HashMap<String,ArrayList<Automovel>> carros2 = new HashMap<>();


        for(Type) {


        }

    }
}

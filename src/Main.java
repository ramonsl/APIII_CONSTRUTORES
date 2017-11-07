import java.util.ArrayList;

/**
 * Created by ramon on 07/11/17.
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<String> agenda = new ArrayList<>();
        String valor= "Ramon";

        System.out.println(agenda.size());
        agenda.add(0,valor);
        agenda.add("Gilto");
        agenda.add(1,"Artur");
        agenda.add(0,"Artur");
        System.out.println(agenda.size());
        agenda.remove("Artur");
        System.out.println(agenda.size());
        agenda.remove(0);
        agenda.set(0, "RAMON");

        for(String a:agenda   ){
            System.out.println(a);
        }

        for(int i =0;i<agenda.size();i++){
            System.out.println(agenda.get(i));
        }

        System.out.println(agenda.contains("Gilto"));

        System.out.println(agenda.indexOf("Gilto"));


        ArrayList<Pizza> minhasPizzas = new ArrayList<>();


        Pizza p1 = new Pizza();
        minhasPizzas.add(p1);
    }

}

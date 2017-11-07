import java.security.SecureRandom;
import java.util.Scanner;

/**
 * Created by ramon on 07/11/17.
 */
public class Pizza {
    int tamanho;
    String sabor;
    double valor;

    @Override
    public String toString() {
        return "Pizza{" +
                "tamanho=" + tamanho +
                ", sabor='" + sabor + '\'' +
                ", valor=" + valor +
                '}';
    }

    public Pizza(){
    }

    public Pizza(Double v){
        valor=v;
        System.out.println("Contruindo uma pizza com valor");
    }
    public Pizza(int t,Double v, String a){


        Scanner tc = new Scanner(System.in);
        System.out.println("Tamanho");
        tamanho=   tc.nextInt();
        sabor=a;
        valor=v;
        System.out.println("Contruindo uma pizza com valor");
    }


    public boolean equals(Pizza p){
        if (this.sabor.equals(p.sabor) && this.valor==p.valor && this.tamanho==p.tamanho){
            return true;
        }else{
            return false;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pizza pizza = (Pizza) o;

        if (tamanho != pizza.tamanho) return false;
        if (Double.compare(pizza.valor, valor) != 0) return false;
        return sabor != null ? sabor.equals(pizza.sabor) : pizza.sabor == null;
    }

}



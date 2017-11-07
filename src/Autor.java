import java.util.Scanner;

/**
 * Created by ramon on 07/11/17.
 */
public class Autor {
    String nome;
    String email;
    Scanner tc= new Scanner(System.in);

    public Autor(){
        System.out.println("Digite nome");
        this.nome=tc.next();
        System.out.println("Digite email");
        this.email=tc.next();

    }

}

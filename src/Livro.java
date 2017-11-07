import java.util.Scanner;

/**
 * Created by ramon on 07/11/17.
 */
public class Livro {
    public String titulo;
    public int nPag;
    public Autor autor;
    Scanner tc= new Scanner(System.in);

    public Livro(String t, int p, Autor a){
        this.titulo=t;
        this.autor=a;
        this.nPag=p;
    }

    public Livro(Autor a){
        System.out.println("Digite titulo");
        this.titulo=tc.nextLine();
        System.out.println("Digite Paginas");
        this.nPag= tc.nextInt();
        this.autor=a;
    }
    public Livro(){
        System.out.println("Digite titulo");
        this.titulo=tc.nextLine();
        System.out.println("Digite Paginas");
        this.nPag= tc.nextInt();
        this.autor=new Autor();

    }



}

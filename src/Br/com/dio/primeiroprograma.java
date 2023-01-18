package Br.com.dio;

import Br.com.dio.model.Gato;
import com.sun.management.UnixOperatingSystemMXBean;

public class primeiroprograma {

    public static <livro> void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);


        Object nome;
        Livro livro1 = new Livro(nome:"O problema dos 3 corpos",300)
        System.out.println(livro1);
        /* int a = 5;
        int b = 3;
        System.out.println("Hello mundo!" + (a+b));*/
    }

    private static class Livro {
        }
    }
}

class Livros {
    private String nome;
    private Integer numpaginas;

    public Livros(String nome, Integer numpaginas) {
        this.nome = nome;
        this.numpaginas = numpaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumpaginas() {
        return numpaginas;
    }

    public void setNumpaginas(Integer numpaginas) {
        this.numpaginas = numpaginas;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "nome='" + nome + '\'' +
                ", numpaginas=" + numpaginas +
                '}';
    }
}
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        List<Aluno> lista = new ArrayList<>();
        lista.add(new Aluno(50000, "cristiano ronaldo", "Engenharia"));
        lista.add(new Aluno(60000, "lionel messi", "Adm"));
        lista.add(new Aluno(70000, "neymar junior", "Sistemas"));
        lista.add(new Aluno(80000, "lamine yamal", "Jornalismo"));
        lista.add(new Aluno(90000, "trolimero trulitchina", "Ads"));



        lista.forEach(aluno -> System.out.println(aluno));

        lista.sort(Comparator.comparing(Aluno::getCurso));

        System.out.println();
        lista.forEach(aluno -> System.out.println(aluno));
    }
}

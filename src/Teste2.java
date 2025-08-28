import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Teste2 {
    public static void main(String[] args) {
        List<Aluno> lista = new ArrayList<>();
        lista.add(new Aluno(50000, "cristiano ronaldo", "Engenharia"));
        lista.add(new Aluno(60000, "lionel messi", "Adm"));
        lista.add(new Aluno(70000, "neymar junior", "Sistemas"));
        lista.add(new Aluno(80000, "lamine yamal", "Jornalismo"));
        lista.add(new Aluno(90000, "trolimero trulitchina", "Ads"));
        lista.add(new Aluno(90000, "balerina putina", "Ads"));


        lista.forEach(aluno -> System.out.println(aluno));

    }
}

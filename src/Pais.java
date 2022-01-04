
import java.util.ArrayList;
import java.util.List;


public class Pais implements Humano{


    private String nome;
    private String sobrenome;
    private List<Humano> filhos = new ArrayList<>();
    private List<Humano> avos = new ArrayList<>();

    public Pais(String nome, String sobrenome)
    {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public void addFilho(Humano filho) {

    }

    @Override
    public void addPais(Humano parente) {
        avos.add(parente);
    }
}

import java.util.ArrayList;
import java.util.List;


public class Filho implements Humano {

    private String nome;
    private String sobrenome;
    private List<Humano> pais = new ArrayList<>();

    public Filho(String nome, String sobrenome)
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
    public void addPais(Humano pais) {
            this.pais.add(pais);
    }

    public String getMae()
    {
        return this.pais.get(0).getNome();
    }

    public String getPai()
    {
        return this.pais.get(1).getNome();
    }

    public boolean getPais(String nome)
    {
        boolean ehFamiliar = false;
        for(int i = 0; i < pais.stream().count(); i++)
        {
            if((this.pais.get(i).getNome()).equals(pais))
            {
                ehFamiliar = true;
            }
        }
        return ehFamiliar;
    }
}

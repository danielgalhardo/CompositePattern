
import java.util.ArrayList;
import java.util.List;

public class Avos implements  Humano{

    private String nome;
    private String sobrenome;
    private List<Humano> filhos = new ArrayList<>();

    public Avos(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }


    @Override
    public String getNome() {
        return null;
    }

    @Override
    public String getSobrenome() {
        return null;
    }


    @Override
    public void addPais(Humano pais) {

    }


    @Override
    public void addFilho(Humano filho) {
        filhos.add(filho);
    }

    public String getFilho(String nomeFilho)
    {
        String temFilho = "";
        for(int i = 0; i < filhos.stream().count(); i++)
        {
            if((this.filhos.get(i).getNome()).equals(nomeFilho))
            {
                temFilho = this.filhos.get(i).getNome();
            }
         }
        return temFilho;
        }



}

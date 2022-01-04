import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class CompositeTest
{
    @Test
    void retornaSucessoCriacaoPais()
    {
        Filho joao =  new Filho("Joao", "da Silva");
        Pais  maria = new Pais("Maria", "da Silva");
        Pais  lucas = new Pais("Lucas", "da Silva");

        joao.addPais(maria);
        joao.addPais(lucas);
        Assert.assertEquals(joao.getMae(), "Maria");

    }

    @Test
    void retornaSucessoAvoPai()
    {
        Filho joao =  new Filho("Joao", "da Silva");
        Pais  maria = new Pais("Maria", "da Silva");
        Pais  lucas = new Pais("Lucas", "da Silva");

        joao.addPais(maria);
        joao.addPais(lucas);


        Avos jose = new Avos("Jose", "da Silva");
        jose.addFilho(lucas);

        Assert.assertEquals(joao.getPai(), jose.getFilho("Lucas"));

    }


    @Test
    void retornaFalso()
    {
        Filho joao =  new Filho("Joao", "da Silva");
        Pais  maria = new Pais("Maria", "da Silva");
        Pais  lucas = new Pais("Lucas", "da Silva");

        joao.addPais(maria);
        joao.addPais(lucas);


        Avos jose = new Avos("Jose", "da Silva");
        jose.addFilho(lucas);

        Assert.assertNotEquals(joao.getPai(), jose.getFilho("Joao"));

    }

    @Test
    void retornaFalsoFilho()
    {
        Filho joao =  new Filho("Joao", "da Silva");
        Pais  maria = new Pais("Maria", "da Silva");
        Pais  lucas = new Pais("Lucas", "da Silva");

        joao.addPais(maria);
        joao.addPais(lucas);


        Avos jose = new Avos("Jose", "da Silva");
        jose.addFilho(lucas);

        Assert.assertNotEquals(joao.getMae(), jose.getFilho("Maria"));

    }

}

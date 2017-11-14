package hello;

public class Greeting {

    /**
     * Essa classe é a classe modelo(MODEL), ou seja, o JSON a ser cosumido
     * através do serviço REST será do tipo Greeting
     **/

    private final long id;
    private final String content;

    public Greeting(long id, String content)
    {
        this.id = id;
        this.content = content;
    }

    public long getId()
    {
        return id;
    }

    public String getContent(){
        return content;
    }

}

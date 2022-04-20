package projagendaarraylist;

public class Contato {
    private String nome;
    private String fone;
    private Data objdata;

    public Contato() {
        this.objdata=new Data();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public Data getObjdata() {
        return objdata;
    }

    public void setObjdata(Data objdata) {
        this.objdata = objdata;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n"
                + "Fone: " + fone + "\n"
                + "Data: " + objdata;
    }
    
    
    
}

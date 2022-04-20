package projagendaarraylist;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> listaDeContatos;

    public Agenda() {
        this.listaDeContatos=new ArrayList<>();
    }

    public ArrayList<Contato> getListaDeContatos() {
        return listaDeContatos;
    }

    public void setListaDeContatos(ArrayList<Contato> listaDeContatos) {
        this.listaDeContatos = listaDeContatos;
    }
    
    public ArrayList<Contato> pesquisarAniversariantesMes(byte mes){
        ArrayList<Contato> Aniversariantes = new ArrayList<>();
        for (int i = 0; i < this.listaDeContatos.size(); i++) {
            if (this.listaDeContatos.get(i).getObjdata().getMes()==mes) {
                Aniversariantes.add(this.listaDeContatos.get(i));
            }
        }
        return Aniversariantes;
        
    }
    
    public Contato pesquisarContatoNome(String nome){
        Contato nomes = new Contato();
        for (int i = 0; i < this.listaDeContatos.size(); i++) {
            if (this.listaDeContatos.get(i).getNome()==nome) {
                nomes = this.listaDeContatos.get(i);
            }
        }
        return nomes;
    }

    @Override
    public String toString() {
        return "Lista de contatos: " + this.mostrarListaDeContatos();
    }    
    
    public String mostrarListaDeContatos() {
        String carros = "Lista de todos os carros";
        for (int i = 0; i < this.listaDeContatos.size(); i++) {
            carros += "\n::::::::::::::::CARRO " + (i + 1) + " :::::::::::::::::" + this.listaDeContatos.get(i) + "\n";
        }
        return carros;
    }
    
}

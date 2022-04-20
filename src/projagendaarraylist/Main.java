package projagendaarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        Agenda objAgenda=new Agenda();
        ArrayList<Contato> contatos = objAgenda.getListaDeContatos();
        
        byte op;
        
        do{
            System.out.println(":::::::::::::::::::::SISTEMA DE AGENDA:::::::::::::::::::::::\n" +
                    "::  1 - CADASTRAR CONTATO	                           ::\n" +
                    "::  2 - MOSTRAR TODOS OS CONTATOS                          ::\n" +
                    "::  3 - MOSTRAR QUANTIDADE DE CONTATOS                     ::\n" +
                    "::  4 - PESQUISAR ANIVERSARIANTES DO MÊS                   ::\n" +
                    "::  5 - PESQUISAR CONTATO POR NOME                         ::\n" +
                    "::  6 - ALTERAR TELEFONE DO CONTATO PESQUISANDO POR NOME   ::\n" +
                    "::  7 - REMOVER CONTATO PESQUISANDO POR NOME               ::\n" +
                    "::  8 - EXCLUIR TODOS OS CONTATOS                          ::\n" +
                    "::  0 - SAIR                                               ::\n" +
                    ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n" +
                    "DIGITE A OPÇÃO:   ");
            op=leia.nextByte();
            switch(op){
                case 1:
                    Contato objContato=new Contato();
                    System.out.println(":::::Informe os dados do contato:::::");
                    System.out.println("Nome: ");
                    objContato.setNome(leia.next());
                    System.out.println("Fone: ");
                    objContato.setFone(leia.next());
                    System.out.println(":::::Data:::::");
                    System.out.println("Dia: ");
                    objContato.getObjdata().setDia(leia.nextByte());
                    System.out.println("Mês: ");
                    objContato.getObjdata().setMes(leia.nextByte());
                    System.out.println("Ano: ");
                    objContato.getObjdata().setAno(leia.nextInt());
                    objAgenda.getListaDeContatos().add(objContato);
                    break;
                case 2:
                    System.out.println(":::::Todos os contatos:::::");
                    System.out.println(objAgenda);
                    break;
                case 3:
                    System.out.println(":::::Quantidade de contatos:::::");
                    contatos.size();
                    break;
                case 4:
                    System.out.print("Digite o mês que deseja pesquisar: ");
                        ArrayList<Contato> mes = objAgenda.pesquisarAniversariantesMes(leia.nextByte());

                        if (contatos.isEmpty()) {
                            System.err.println("Nenhum aniversariante encontrado");
                        } else {
                            System.out.println("Lista de aniversariantes do mês encontrados: " + mes);
                        }
                        break;
                case 5:
                case 6:
                case 7:
                    if (contatos.isEmpty()) {
                            System.err.println("!!!Nenhum nome encontrado!!!");
                        } else {
                            System.out.println("Digite o nome que deseja pesquisar: ");
                            Contato nome=objAgenda.pesquisarContatoNome(leia.next());
                            if(nome==null){
                                System.out.println("Nome não encontrado");
                            }else{
                                System.out.println("O nome encontrado é: " + nome);
                                if (op == 6) {
                                    System.out.print("Digite o novo telefone: ");
                                    nome.setFone(leia.next());
                                    System.out.println("Telefone alterado com sucesso!");
                                }else if(op == 7){
                                    do {
                                    System.out.print("::::Exclusão do contato::::\n"
                                            + "Você tem certeza que deseja excluir o contato?\n"
                                            + "Se sim digite 1\n"
                                            + "Se não digite 2\n"
                                            + "Digite aqui: ");
                                    op = leia.nextByte();
                                    switch (op) {
                                        case 1:
                                            contatos.remove(nome);
                                            System.out.println("Contato excluído com sucesso!");
                                            break;
                                        case 2:
                                            System.out.println("Exclusão cancelada!");
                                            break;
                                        default:
                                            System.out.println("Opção inválida\nDigite novamente");
                                    }
                                }while(op<1 || op>2);
                            }
                        }
                    }
                case 8:
                    objAgenda.getListaDeContatos().clear();
                    System.out.println("Contatos excluidos com sucesso");
                    break;
                case 0:
                    System.out.println("!!!SISTEMA ENCERRADO!!!");
                    break;
                default:
                    System.out.println("Opção inválida\n"
                            + "Digite novamente: ");
            }
        }while(op!=0);
    }
    
}

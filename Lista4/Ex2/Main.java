package Lista4.Ex2;

import javax.swing.JOptionPane;

import Lista4.Ex2.Agenda.Agenda;
import Lista4.Ex2.Agenda.Types.Fisic;
import Lista4.Ex2.Agenda.Types.Legal;

public class Main {

    public static void order(Agenda[] agenda){


        for(int i = 0; i < agenda.length - 1; i++){
            if(agenda[i] instanceof Fisic){
                if(((Fisic) agenda[i]).getCpf() > ((Fisic) agenda[i + 1]).getCpf()){
                    Agenda temp = agenda[i];
                    agenda[i+ 1] = agenda[i];
                    agenda[i] = temp;
                } 
            }
            if(agenda[i] instanceof Legal){
                if(((Legal) agenda[i]).getCnpj() > ((Legal) agenda[i + 1]).getCnpj()){
                    Agenda temp = agenda[i];
                    agenda[i+ 1] = agenda[i];
                    agenda[i] = temp;
                } 
            }
        }    
    }

    public static void addContact(Agenda[] agenda, int id) {
        agenda[id].add();
    }

    public static void removeContact(Agenda[] agenda) {

        int choose;
        choose = Integer.parseInt(JOptionPane.showInputDialog(null,
                "[0] Pessoa física\n[1] Pessoa jurídica\nInsira o tipo: "));
        switch (choose) {
            case 0:
                choose = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Insira o cpf: "));
                        for(int i = 0; i < agenda.length; i++){
                            if (agenda[i] instanceof Fisic){
                                if (((Fisic) agenda[i]).getCpf() == choose){
                                    agenda[i].delete();;
                                }
                            }
                        }
                break;
            case 1:
            choose = Integer.parseInt(JOptionPane.showInputDialog(null,
            "Insira o cnpj: "));
            for(int i = 0; i < agenda.length; i++){
                if (agenda[i] instanceof Legal){
                    if (((Legal) agenda[i]).getCnpj() == choose){
                        agenda[i].delete();
                    }
                }
            }
            default:
                JOptionPane.showMessageDialog(null, "ERROR - ENTRADA INVÁLIDA");
                break;
        }
    }

    public static void searchContact(Agenda[] agenda){
        int choose;
        String show = "";
        choose = Integer.parseInt(JOptionPane.showInputDialog(null,
                "[0] Pessoa física\n[1] Pessoa jurídica\nInsira o tipo: "));
        switch (choose) {
            case 0:
                choose = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Insira o cpf: "));
                        for(int i = 0; i < agenda.length; i++){
                            if (agenda[i] instanceof Fisic){
                                if (((Fisic) agenda[i]).getCpf() == choose){
                                    show = agenda[i].show();
                                }
                            }
                        }
                break;
            case 1:
            choose = Integer.parseInt(JOptionPane.showInputDialog(null,
            "Insira o cnpj: "));
            for(int i = 0; i < agenda.length; i++){
                if (agenda[i] instanceof Legal){
                    if (((Legal) agenda[i]).getCnpj() == choose){
                        show = agenda[i].show();
                    }
                }
            }
            default:
                JOptionPane.showMessageDialog(null, "ERROR - ENTRADA INVÁLIDA");
                break;
        }
        JOptionPane.showMessageDialog(null, show);
    }

    public static void showContacts(Agenda[] agenda) {
        int choose;
        String show = "";
        choose = Integer.parseInt(JOptionPane.showInputDialog("[1] Todos\n[2] Físico \n[3] Jurídico\n"));
        switch (choose) {
            case 1:
            for(int i = 0; i < agenda.length; i++){
                if (agenda[i] instanceof Fisic){
                        show += agenda[i].show();
                    }
                }
                for(int i = 0; i < agenda.length; i++){
                    if (agenda[i] instanceof Legal){
                            show += agenda[i].show();
                        }
                    }
                break;

            case 2:
            for(int i = 0; i < agenda.length; i++){
                if (agenda[i] instanceof Fisic){
                        show += agenda[i].show();
                    }
                }
            
                break;

            case 3:
            for(int i = 0; i < agenda.length; i++){
                if (agenda[i] instanceof Legal){
                        show += agenda[i].show();
                    }
                }
                break;

            default:
                JOptionPane.showMessageDialog(null, "ERROR - ENTRADA INVÁLIDA");
                break;
        }
        JOptionPane.showMessageDialog(null, show);
    }

    public static void main(String[] args) {
        int choose, id = 0;
        JOptionPane.showMessageDialog(null, "Bem-vindo à sua agenda pessoal");
        Agenda agenda[] = new Agenda[20];

        // Não é para separar o array, ele tem que ser um obj agenda
        /*
         * for (int i = 0; i < 10; i++) {
         * agenda[i] = new Fisic();
         * ((Fisic) agenda[i]).setCpf(0); //MUITO IMPORTANTE
         * agenda[i + 10] = new Legal();
         * ((Legal) agenda[i + 10]).setCnpj(0);
         * }
         */

        while (true) {
            choose = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "[1] Adicionar contato\n[2] Remover contato\n[3] Pesquisar Contato\n[4] Vizualizar contato\n[5] Sair\nDigite a opção desejada:"));
            switch (choose) {
                case 1:
                    if (id == 19) {
                        JOptionPane.showMessageDialog(null, "ERRO - Agenda cheia");
                    } else {
                        choose = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "[0] Pessoa física\n[1] Pessoa jurídica\nInsira o tipo: "));
                        switch (choose) {
                            case 0:
                                agenda[id] = new Fisic();

                                break;
                            case 1:
                                agenda[id] = new Legal();

                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "ERROR - ENTRADA INVÁLIDA");
                        }
                    }
                    addContact(agenda, id);
                    id++;
                    break;

                case 2:
                    removeContact(agenda);

                    break;

                    case 3:
                    searchContact(agenda);
                    break;
                case 4:
                    showContacts(agenda);
                    break;
                case 5:
                    return;

                default:
                    JOptionPane.showMessageDialog(null, "ERROR - ENTRADA INVÁLIDA");
                    break;
            }
        }

    }

}

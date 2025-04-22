package Lista4.Ex2Array;

import javax.swing.JOptionPane;

import Lista4.Ex2Array.Agenda.Agenda;
import Lista4.Ex2Array.Agenda.Types.Fisic;
import Lista4.Ex2Array.Agenda.Types.Legal;

public class Main {

    public static void addContact(Agenda[] agenda, int id) {
        agenda[id].add();
    }

    public static void removeContact(Agenda[] agenda, int choose) {
        switch (choose) {
            case 0:
                choose = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Insira o cpf: "));
                for (int i = 0; i < 10; i++) {
                    if (choose == ((Fisic) agenda[i]).getCpf()) {
                        ((Fisic) agenda[i]).delete();
                    }
                }
                break;
            case 1:
                choose = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Insira o cnpj: "));
                for (int i = 0; i < 10; i++) {
                    if (choose == ((Legal) agenda[i]).getCnpj()) {
                        ((Legal) agenda[i]).delete();
                    }
                }
            default:
                JOptionPane.showMessageDialog(null, "ERROR - ENTRADA INVÁLIDA");
                break;

        }
    }

    public static void showContacts(Agenda[] agenda) {
        String show = "";
        for (int i = 0; i < 10; i++) {
            if (agenda[i].getName() != null) {
                show += agenda[i].show() + "\n";
            }
        }

        JOptionPane.showMessageDialog(null, show);
    }

    public static void searchContact(Agenda[] agenda, int choose){
        String show = "Contato não encontrado";
        switch (choose) {
            case 0:
                choose = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Insira o cpf: "));
                for (int i = 0; i < 10; i++) {
                    if (choose == ((Fisic) agenda[i]).getCpf()) {
                        show = ((Fisic) agenda[i]).show();
                    }
                }
                break;
            case 1:
                choose = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Insira o cnpj: "));
                for (int i = 0; i < 10; i++) {
                    if (choose == ((Legal) agenda[i]).getCnpj()) {
                        show = ((Legal) agenda[i]).show();
                    }
                }
            default:
                JOptionPane.showMessageDialog(null, "ERROR - ENTRADA INVÁLIDA");
                break;
        }
        JOptionPane.showMessageDialog(null, show);

    }
    public static void main(String[] args) {
        int choose, idFisc = 0, idLegal = 0;
        JOptionPane.showMessageDialog(null, "Bem-vindo à sua agenda pessoal");
        Agenda agendaFisic[] = new Agenda[10];
        Agenda agendaLegal[] = new Agenda[10];
        for (int i = 0; i < 10; i++) {
            agendaFisic[i] = new Fisic();
            agendaLegal[i] = new Legal();
        }

        while (true) {
            choose = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "[1] Adicionar contato\n[2] Remover contato\n[3] Pesquisar Contato\n[4] Vizualizar contato\n[5] Sair\nDigite a opção desejada:"));
            switch (choose) {
                case 1:
                    if (idFisc == 9 && idLegal == 9) {
                        JOptionPane.showMessageDialog(null, "ERRO - Agenda cheia");
                    } else {
                        choose = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "[0] Pessoa física\n[1] Pessoa jurídica\nInsira o tipo: "));
                        switch (choose) {
                            case 0:
                                if (idFisc == 9) {
                                    JOptionPane.showMessageDialog(null, "ERRO - Agenda cheia para pessoas físicas");
                                } else {
                                    addContact(agendaFisic, idFisc);
                                    idFisc++;
                                }
                                break;
                            case 1:
                                if (idLegal == 9) {
                                    JOptionPane.showMessageDialog(null, "ERRO - Agenda cheia para pessoas jurídicas");
                                } else {
                                    addContact(agendaLegal, idLegal);
                                    idLegal++;
                                }
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "ERROR - ENTRADA INVÁLIDA");
                        }
                    }
                    break;

                case 2:
                    choose = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "[0] Pessoa física\n[1] Pessoa jurídica\nInsira o tipo: "));
                    switch (choose) {
                        case 0:
                            removeContact(agendaFisic, choose);
                            break;
                        case 1:
                            removeContact(agendaFisic, choose);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "ERROR - ENTRADA INVÁLIDA");
                            break;
                    }

                    break;

                case 3:
                choose = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "[0] Pessoa física\n[1] Pessoa jurídica\nInsira o tipo: "));
                    switch (choose) {
                        case 0:
                            searchContact(agendaFisic, choose);
                            break;
                        case 1:
                            searchContact(agendaLegal, choose);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "ERROR - ENTRADA INVÁLIDA");
                            break;
                    }
                break;
                
                case 4:
                    choose = Integer.parseInt(JOptionPane.showInputDialog("[1] Todos\n[2] Físico \n[3] Jurídico\n"));
                    switch (choose) {
                        case 1:
                            showContacts(agendaFisic);
                            showContacts(agendaLegal);
                            break;

                        case 2:
                            showContacts(agendaFisic);
                            break;

                        case 3:
                            showContacts(agendaLegal);
                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "ERROR - ENTRADA INVÁLIDA");
                            break;
                    }
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

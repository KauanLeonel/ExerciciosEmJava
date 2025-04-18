package Lista4.Ex2;

import javax.swing.JOptionPane;

import Lista4.Ex2.Agenda.Agenda;
import Lista4.Ex2.Agenda.Types.Fisic;
import Lista4.Ex2.Agenda.Types.Legal;

public class Main {

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
                        for (int i = 0; i < 10; i++){
                            if(agenda[i] instanceof Fisic){
                            //if(choose == agenda[i].getCpf())
                            }
                        }
                break;
            case 1:
                choose = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Insira o cnpj: "));
            default:
                JOptionPane.showMessageDialog(null, "ERROR - ENTRADA INVÁLIDA");
                break;

        }
    }

    public static void main(String[] args) {
        int choose, idFisc = 0, idLegal = 10;
        JOptionPane.showMessageDialog(null, "Bem-vindo à sua agenda pessoal");
        Agenda agenda[] = new Agenda[20];
        for (int i = 0; i < 10; i++) {
            agenda[i] = new Fisic();
            agenda[i + 10] = new Legal();
        }

        while (true) {
            choose = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "[1] Adicionar contato\n[2] Remover contato\n[3] Pesquisar Contato\n[4] Vizualizar contato\n[5] Sair\nDigite a opção desejada:"));
            switch (choose) {
                case 1:
                    if (idFisc == 9 && idLegal == 19) {
                        JOptionPane.showMessageDialog(null, "ERRO - Agenda cheia");
                    } else {
                        choose = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "[0] Pessoa física\n[1] Pessoa jurídica\nInsira o tipo: "));
                        switch (choose) {
                            case 0:
                                if (idFisc == 9) {
                                    JOptionPane.showMessageDialog(null, "ERRO - Agenda cheia para pessoas físicas");
                                } else {
                                    addContact(agenda, idFisc);
                                    idFisc++;
                                }
                                break;
                            case 1:
                                if (idLegal == 19) {
                                    JOptionPane.showMessageDialog(null, "ERRO - Agenda cheia para pessoas jurídicas");
                                } else {
                                    addContact(agenda, idLegal);
                                    idLegal++;
                                }
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "ERROR - ENTRADA INVÁLIDA");
                        }
                    }
                    break;

                case 2:
                    removeContact(agenda);

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

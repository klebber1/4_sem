package gui;

import model.Caixa;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaMovimento2 {
    private JPanel painelCaixa;
    private JTextField txtValor;
    private JTextField txtSaldo;
    private JButton cmdEntrada;
    private JButton cmdRetirada;
    private JButton cmdConsulta;
    private JButton cmdSair;
    private JTextArea txtMsg;

    public JPanel getPainelCaixa() {
        return painelCaixa;
    }
    private Caixa caixa;

    public TelaMovimento2(){
        caixa = new Caixa();


        cmdEntrada.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double vlr = Double.parseDouble(txtValor.getText());
                String resposta = caixa.depositar(vlr);
                txtMsg.append(resposta + "\n");
                txtValor.setText(null);
                txtValor.requestFocus(); //coloca o foco no controle

            }
        });
        cmdConsulta.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtSaldo.setText(Double.toString(caixa.getSaldo()));
                txtMsg.append("Saldo no momento: " + txtSaldo.getText());
                txtMsg.append("\n");

            }
        });
        cmdRetirada.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double vlr = Double.parseDouble(txtValor.getText());
                String resposta = caixa.sacar(vlr);
                txtMsg.append(resposta + "\n");
                txtValor.setText(null);
                txtValor.requestFocus(); //coloca o foco no controle

            }
        });


        cmdSair.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
    }
}
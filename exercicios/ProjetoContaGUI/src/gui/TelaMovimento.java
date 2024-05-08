package gui;

import model.Caixa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaMovimento extends JFrame implements ActionListener {

    private Label lblValor, lblSaldo;

    private TextField txtValor, txtSaldo;
    private Button cmdEntrada, cmdRetirada, cmdConsulta, cmdSair;
    private TextArea txtMsg;
    private Dimension dLabel, dTextField, dButon, dFrame, dTextArea;
    private Caixa caixa;


    public TelaMovimento(){
        caixa = new Caixa();

        dFrame = new Dimension(350,400);
        dLabel = new Dimension(40,20);
        dTextField = new Dimension(150,20);
        dButon = new Dimension(95,20);
        dTextArea = new Dimension(300,140);


        setSize(dFrame);
        setTitle("Controle de Caixa");
        setLocationRelativeTo(null);//centraliza janela
        setDefaultCloseOperation(EXIT_ON_CLOSE);//fecha programa clicando x
        setLayout(null);//nulo significa que indicaremos as posicoes dos componentes



        lblValor = new Label("Valor:");
        lblValor.setSize(dLabel);
        lblValor.setLocation(25,50);
        add(lblValor);


        lblSaldo = new Label("Saldo:");
        lblSaldo.setSize(dLabel);
        lblSaldo.setLocation(25,80);
        add(lblSaldo);

        txtValor= new TextField(null);
        txtValor.setSize(dTextField);
        txtValor.setLocation(75,50);
        add(txtValor);

        txtSaldo = new TextField(null);
        txtSaldo.setSize(dTextField);
        txtSaldo.setLocation(75,80);
        add(txtSaldo);


        cmdEntrada = new Button("Entrada");
        cmdEntrada.setSize(dButon);
        cmdEntrada.setLocation(25,150);
        cmdEntrada.addActionListener(this);
        add(cmdEntrada);

        cmdRetirada = new Button("Retirada");
        cmdRetirada.setSize(dButon);
        cmdRetirada.setLocation(225,150);
        cmdRetirada.addActionListener(this);
        add(cmdRetirada);

        cmdConsulta = new Button("Consulta");
        cmdConsulta.setSize(dButon);
        cmdConsulta.setLocation(25,185);
        cmdConsulta.addActionListener(this);
        add(cmdConsulta);

        cmdSair = new Button("Sair");
        cmdSair.setSize(dButon);
        cmdSair.setLocation(225,185);
        cmdSair.addActionListener(this);
        add(cmdSair);

        txtMsg = new TextArea(null);
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25,220);
        add(txtMsg);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==cmdSair){
            System.exit(0);

        }

        if (e.getSource()==cmdEntrada){

            double vlr = Double.parseDouble(txtValor.getText());
            String resposta = caixa.depositar(vlr);
            txtMsg.append(resposta + "\n");
            txtValor.setText(null);
            txtValor.requestFocus();
            return;
        }
        if (e.getSource()==cmdConsulta){
            txtSaldo.setText(Double.toString(caixa.getSaldo()));
            txtMsg.append("Saldo no momento: " + txtSaldo.getText());
            txtMsg.append("\n");
        }
        if (e.getSource()==cmdRetirada){
            double vlr = Double.parseDouble(txtValor.getText());
            String resposta = caixa.sacar(vlr);
            txtMsg.append(resposta + "\n");
            txtValor.setText(null);
            txtValor.requestFocus();
        }

    }
}

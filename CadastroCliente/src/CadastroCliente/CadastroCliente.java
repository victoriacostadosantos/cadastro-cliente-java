package CadastroCliente;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class CadastroCliente extends JFrame {
	JTextField cx1,cx2,cx3,cx4,cx7,cx8,cx9,cx10,cx11,cx12,cx17;
	
	JLabel titulo,status,text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11,
	text12,text13,text14,text15,text16,text17,text18;
	
	JFormattedTextField telcom,cnpj,cep,telres,telcel,cpf,datanas;
	
	MaskFormatter ctelcom,ccnpj,ccep,ctelres,ctelcel,ccpf,cdatanas;
	
	JRadioButton bt1,bt2;
	
	public CadastroCliente() {
		Container tela = getContentPane();
		setLayout(null);
		
		titulo = new JLabel ("Cadastro de Clientes");
		titulo.setBounds(10,30,300,20);
		titulo.setForeground(new Color(11,97,94));
		titulo.setFont(new Font("arial",Font.BOLD,16));
		
		status = new JLabel ("Status:");
		status.setBounds(130,60,80,20);
		
		bt1 = new JRadioButton ("Pessoa Fisica");
		bt1.setBounds(180,60,150,20);
		
		bt2 = new JRadioButton ("Pessoa Jurdica");
		bt2.setBounds(480,60,160,20);
		
		text1 = new JLabel ("Nome:");
		text1.setBounds(134,90,80,20);
		
		cx1 = new JTextField ();
		cx1.setBounds(190,90,260,20);
		
		text2 = new JLabel ("Bairro:");
		text2.setBounds(132,120,80,20);
		
		cx2 = new JTextField ();
		cx2.setBounds(190,120,170,20);
		
		text3 = new JLabel("Cidade:");
		text3.setBounds(128,150,80,20);
		
		cx3 = new JTextField();
		cx3.setBounds(190,150,170,20);
		
		text4 = new JLabel ("Estado:");
		text4.setBounds(128,180,80,20);
		
		cx4 = new JTextField ();
		cx4.setBounds(190,180,70,20);
		
		text5 = new JLabel ("Telefone Comercial:");
		text5.setBounds(59,210,150,20);
		
		text6 = new JLabel ("CNPJ:");
		text6.setBounds(134,240,80,20);
		
		text7 = new JLabel ("Inscrição Estadual:");
		text7.setBounds(59,270,150,20);
		
		cx7 = new JTextField ();
		cx7.setBounds(190,270,100,20);
		
		text8 = new JLabel ("Email:");
		text8.setBounds(132,300,80,20);
		
		cx8 = new JTextField ();
		cx8.setBounds(190,300,170,20);
		
		text9 = new JLabel ("Observação:");
		text9.setBounds(90,410,80,20);
		
		cx9 = new JTextField ();
		cx9.setBounds(190,330,350,180);
		
		text10 = new JLabel ("Rua:");
		text10.setBounds(670,60,80,20);
		
		cx10 = new JTextField ();
		cx10.setBounds(720,60,240,20);
		
		text11 = new JLabel ("Número:");
		text11.setBounds(650,90,80,20);
		
		cx11 = new JTextField ();
		cx11.setBounds(720,90,70,20);
		
		text12 = new JLabel ("Complemento:");
		text12.setBounds(616,120,100,20);
		
		cx12 = new JTextField ();
		cx12.setBounds(720,120,150,20);
		
		text13 = new JLabel ("Cep:");
		text13.setBounds(671,150,80,20);
		
		text14 = new JLabel ("Telefone Residencial:");
		text14.setBounds(576,180,150,20);
		
		text15 = new JLabel ("Telefone Celular:");
		text15.setBounds(602,210,150,20);
		
		text16 = new JLabel ("CPF:");
		text16.setBounds(671,240,80,20);
		
		text17 = new JLabel ("RG:");
		text17.setBounds(676,270,80,20);
		
		cx17 = new JTextField ();
		cx17.setBounds(720,270,110,20);
		
		
		text18 = new JLabel ("Data de Nascimento:");
		text18.setBounds(580,300,150,20);
		
		try {
			ctelcom = new MaskFormatter("(##)########");
			ccnpj = new MaskFormatter("##.###.###/####-##");
			ccep = new MaskFormatter("#####-###");
			ctelres = new MaskFormatter("(##)########");
			ctelcel = new MaskFormatter("(##)#########");
			ccpf = new MaskFormatter("###.###.###-##");
			cdatanas = new MaskFormatter("##/##/####");
		}
		catch(ParseException excp) {}
		
		telcom = new JFormattedTextField(ctelcom);
		telcom.setBounds(190,210,100,20);
		
		cnpj = new JFormattedTextField(ccnpj);
		cnpj.setBounds(190,240,130,20);
		
		cep = new JFormattedTextField(ccep);
		cep.setBounds(720,150,130,20);
		
		telres = new JFormattedTextField(ctelres);
		telres.setBounds(720,180,110,20);
		
		telcel = new JFormattedTextField(ctelcel);
		telcel.setBounds(720,210,110,20);
		
		cpf = new JFormattedTextField(ccpf);
		cpf.setBounds(720,240,150,20);
		
		datanas = new JFormattedTextField(cdatanas);
		datanas.setBounds(720,300,150,20);
		
		tela.add(titulo);
		tela.add(status);
		tela.add(bt1);
		tela.add(bt2);
		tela.add(text1);
		tela.add(cx1);
		tela.add(text2);
		tela.add(cx2);
		tela.add(text3);
		tela.add(cx3);
		tela.add(text4);
		tela.add(cx4);
		tela.add(telcom);
		tela.add(text5);
		tela.add(text6);
		tela.add(cnpj);
		tela.add(text7);
		tela.add(cx7);
		tela.add(text8);
		tela.add(cx8);
		tela.add(text9);
		tela.add(cx9);
		tela.add(text10);
		tela.add(cx10);
		tela.add(text11);
		tela.add(cx11);
		tela.add(text12);
		tela.add(cx12);
		tela.add(text13);
		tela.add(cep);
		tela.add(text14);
		tela.add(telres);
		tela.add(telcel);
		tela.add(text15);
		tela.add(cpf);
		tela.add(text16);
		tela.add(text17);
		tela.add(text18);
		tela.add(datanas);
		tela.add(cx17);
		
		setSize(1000, 600);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	public static void main(String args[]) {
		CadastroCliente app = new CadastroCliente();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

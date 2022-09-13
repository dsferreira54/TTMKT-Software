package apresentacao;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class VisaoConsultarProduto extends JFrame {
	// PROPRIEDADES DA CLASSE
	private static final long serialVersionUID = 1L;
	
	// DECLARAÇÃO PAINEL
	private JPanel objPainel = new JPanel();
	
	// DECLARAÇÃO CONSULTAR POR
	private JLabel lblConsultarPor = new JLabel("Consulta por:");
	private JComboBox<String> jcbConsultarPor = new JComboBox<String>();
	
	// DECLARAÇÃO DIGITE O ARGUMENTO
	private JLabel lblDigiteArgumento = new JLabel("Digite o argumento:");
	private JTextField txtDigiteArgumento = new JTextField();
	
	// TABELA DE CONSULTA
	private JTable tblConsulta = new JTable();
	
	//BOTÃO CONSULTAR
	private JButton btnConsultar = new JButton("Consultar");

	//BOTÃO LIMPAR
	private JButton btnLimpar = new JButton("Limpar");
	
	//BOTÃO SAIR
	private JButton btnSair = new JButton("Sair");
	
	// MÉTODO PRINCIPAL DE EXECUAÇÃO DA CLASSE
	public static void main(String[] args) {
		new VisaoConsultarProduto().setVisible(true);
	}
	
	// MÉTODO CONSTRUTOR VAZIO DA CLASSE
	public VisaoConsultarProduto() {
		
		// CONFIGURAÇÃO DA JANELA
		setTitle("Consulta de Produtos");
		setSize(1024, 576);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		// CONFIGURAÇÃO DO PAINEL
		setContentPane(objPainel);
		objPainel.setLayout(null);
		
		// CONFIGURAÇÃO DO CONSULTAR POR
		lblConsultarPor.setBounds(10, 10, 90, 20);
		objPainel.add(lblConsultarPor);
		
		jcbConsultarPor.setBounds(10, 40, 220, 25);
		objPainel.add(jcbConsultarPor);
		
		// CONFIGURAÇÃO DO DIGITE O ARGUMENTO
		lblDigiteArgumento.setBounds(250, 10, 150, 20);
		objPainel.add(lblDigiteArgumento);
		
		txtDigiteArgumento.setBounds(250, 40, 640, 25);
		objPainel.add(txtDigiteArgumento);
		
		// CONFIGURAÇÃO DA TABELA DE CONSULTA
		tblConsulta.setBounds(10, 85, 880, 440);
		objPainel.add(tblConsulta);
		
		// CONFIGURAÇÃO DO BOTÃO CONSULTAR
		btnConsultar.setBounds(900, 85, 100, 30);
		objPainel.add(btnConsultar);
		
		// CONFIGURAÇÃO DO BOTÃO LIMPAR
		btnLimpar.setBounds(900, 140, 100, 30);
		objPainel.add(btnLimpar);
		
		// CONFIGURAÇÃO DO BOTÃO SAIR
		btnSair.setBounds(900, 195, 100, 30);
		objPainel.add(btnSair);
		
	}
}

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
	
	// DECLARA��O PAINEL
	private JPanel objPainel = new JPanel();
	
	// DECLARA��O CONSULTAR POR
	private JLabel lblConsultarPor = new JLabel("Consulta por:");
	private JComboBox<String> jcbConsultarPor = new JComboBox<String>();
	
	// DECLARA��O DIGITE O ARGUMENTO
	private JLabel lblDigiteArgumento = new JLabel("Digite o argumento:");
	private JTextField txtDigiteArgumento = new JTextField();
	
	// TABELA DE CONSULTA
	private JTable tblConsulta = new JTable();
	
	//BOT�O CONSULTAR
	private JButton btnConsultar = new JButton("Consultar");

	//BOT�O LIMPAR
	private JButton btnLimpar = new JButton("Limpar");
	
	//BOT�O SAIR
	private JButton btnSair = new JButton("Sair");
	
	// M�TODO PRINCIPAL DE EXECUA��O DA CLASSE
	public static void main(String[] args) {
		new VisaoConsultarProduto().setVisible(true);
	}
	
	// M�TODO CONSTRUTOR VAZIO DA CLASSE
	public VisaoConsultarProduto() {
		
		// CONFIGURA��O DA JANELA
		setTitle("Consulta de Produtos");
		setSize(1024, 576);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		// CONFIGURA��O DO PAINEL
		setContentPane(objPainel);
		objPainel.setLayout(null);
		
		// CONFIGURA��O DO CONSULTAR POR
		lblConsultarPor.setBounds(10, 10, 90, 20);
		objPainel.add(lblConsultarPor);
		
		jcbConsultarPor.setBounds(10, 40, 220, 25);
		objPainel.add(jcbConsultarPor);
		
		// CONFIGURA��O DO DIGITE O ARGUMENTO
		lblDigiteArgumento.setBounds(250, 10, 150, 20);
		objPainel.add(lblDigiteArgumento);
		
		txtDigiteArgumento.setBounds(250, 40, 640, 25);
		objPainel.add(txtDigiteArgumento);
		
		// CONFIGURA��O DA TABELA DE CONSULTA
		tblConsulta.setBounds(10, 85, 880, 440);
		objPainel.add(tblConsulta);
		
		// CONFIGURA��O DO BOT�O CONSULTAR
		btnConsultar.setBounds(900, 85, 100, 30);
		objPainel.add(btnConsultar);
		
		// CONFIGURA��O DO BOT�O LIMPAR
		btnLimpar.setBounds(900, 140, 100, 30);
		objPainel.add(btnLimpar);
		
		// CONFIGURA��O DO BOT�O SAIR
		btnSair.setBounds(900, 195, 100, 30);
		objPainel.add(btnSair);
		
	}
}

package apresentacao;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import negocio.Produto;
import negocio.Marca;

public class VisaoCadastarSupermercado extends JFrame {
	//PROPRIEDADES DA CLASSE
		private static final long serialVersionUID = 1L;
		
		private JPanel objPainel = new JPanel();
		
		private JLabel lblNome = new JLabel("Nome");
		private JTextField txtNome = new JTextField();
		
		private JLabel lblTelefone = new JLabel("Telefone");
		private JTextField txtTelefone = new JTextField();
		
		private JLabel lblEmail = new JLabel("E-mail");
		private JTextField txtEmail = new JTextField();
		
		private JLabel lblEndereco = new JLabel("Endereço");
		private JTextField txtEndereco = new JTextField();
		
		private JLabel lblLogomarca = new JLabel("Logomarca");
		private JTextField txtLogomarca = new JTextField();
				
		private JButton btnGravar = new JButton("Gravar");
		private JButton btnLimpar = new JButton("Limpar");
		private JButton btnSair = new JButton("Sair");
		
		//MÉTODO PRINCIPAL DE EXECUÇÃO DA CLASSE
		public static void main(String[] args) {
			new VisaoCadastarSupermercado().setVisible(true);
		}
		
		//MÉTODO CONSTRUTOR VAZIO DA CLASSE
		public VisaoCadastarSupermercado() {
		//CONFIGURAÇÃO DA JANELA
		setTitle("Cadastro de Supermercado");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//CONFIGURAÇÃO DO PAINEL
		objPainel.setLayout(null);
		setContentPane(objPainel);
			
		// Nome
		lblNome.setBounds(20, 20, 200, 20);
		objPainel.add(lblNome);
		txtNome.setBounds(20, 40, 400, 30);
		objPainel.add(txtNome);
		
		// Telefone
		lblTelefone.setBounds(20, 80, 200, 20);
		objPainel.add(lblTelefone);
		txtTelefone.setBounds(20, 100, 400, 30);
		objPainel.add(txtTelefone);
		
		// E-mail
		lblEmail.setBounds(20, 140, 200, 20);
		objPainel.add(lblEmail);
		txtEmail.setBounds(20, 160, 400, 30);
		objPainel.add(txtEmail);
		
		// Endereço
		lblEndereco.setBounds(20, 200, 200, 20);
		objPainel.add(lblEndereco);
		txtEndereco.setBounds(20, 220, 400, 30);
		objPainel.add(txtEndereco);
		
		// Logomarca
		lblLogomarca.setBounds(20, 260, 200, 20);
		objPainel.add(lblLogomarca);
		txtLogomarca.setBounds(20, 280, 400, 30);
		objPainel.add(txtLogomarca);
		
		// Botôes 
		btnGravar.setBounds(450, 500, 100, 30);
		
		objPainel.add(btnGravar);
		
		btnLimpar.setBounds(550, 500, 100, 30);
		
		objPainel.add(btnLimpar);
		
		btnSair.setBounds(650, 500, 100, 30);
		btnSair.addActionListener(new ControladorSairCadastrarProduto());
		objPainel.add(btnSair);
		}
}

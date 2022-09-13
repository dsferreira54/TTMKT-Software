package apresentacao;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VisaoCadastroProduto extends JFrame{
	//PROPRIEDADES DA CLASSE
	private static final long serialVersionUID = 1L;
	
	private JPanel objPainel = new JPanel();
	
	private JLabel lblMarca = new JLabel("Marca");
	private JComboBox<String> cboMarca = new JComboBox<String>();
	
	private JLabel lblNomeProduto = new JLabel("Nome do Produto");
	private JTextField txtNomeProduto = new JTextField();
	
	private JLabel lblMedida = new JLabel("Medida");
	private JTextField txtMedida = new JTextField();
	
	private JLabel lblFotoProduto = new JLabel("Foto do Produto");
	private JTextField txtFotoProduto = new JTextField();
			
	private JButton btnGravar = new JButton("Gravar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnSair = new JButton("Sair");
	
	//MÉTODO PRINCIPAL DE EXECUÇÃO DA CLASSE
	public static void main(String[] args) {
		new VisaoCadastroProduto().setVisible(true);
	}
	
	//MÉTODO CONSTRUTOR VAZIO DA CLASSE
	public VisaoCadastroProduto() {
		//CONFIGURAÇÃO DA JANELA
		setTitle("Cadastro de Produto");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//CONFIGURAÇÃO DO PAINEL
		objPainel.setLayout(null);
		setContentPane(objPainel);
		
		// Marca
		lblMarca.setBounds(20, 20, 200, 20);
		objPainel.add(lblMarca);
		cboMarca.setBounds(20, 40, 400, 30);
		objPainel.add(cboMarca);
		cboMarca.addItem("");
		
		// Nome do produto
		lblNomeProduto.setBounds(20, 100, 200, 20);
		objPainel.add(lblNomeProduto);
		txtNomeProduto.setBounds(20, 120, 400, 20);
		objPainel.add(txtNomeProduto);
				
		// Medida
		lblMedida.setBounds(20, 180, 200, 20);
		objPainel.add(lblMedida);
		txtMedida.setBounds(20, 200, 400, 20);
		objPainel.add(txtMedida);
		
		// Foto do produto
		lblFotoProduto.setBounds(20, 260, 200, 20);
		objPainel.add(lblFotoProduto);
		txtFotoProduto.setBounds(20, 280, 400, 20);
		objPainel.add(txtFotoProduto);
				
		// Botôes 
		btnGravar.setBounds(450, 500, 100, 30);
		btnGravar.addActionListener(new ControladorGravarCadastroProduto(cboMarca, cboMarca, txtNomeProduto, txtMedida, txtFotoProduto));
		objPainel.add(btnGravar);
		
		btnLimpar.setBounds(550, 500, 100, 30);
		btnLimpar.addActionListener(new ControladorLimparCadastroProduto(cboMarca, cboMarca, txtNomeProduto, txtMedida, txtFotoProduto));
		objPainel.add(btnLimpar);
		
		btnSair.setBounds(650, 500, 100, 30);
		btnSair.addActionListener(new ControladorSairCadastroProduto());
		objPainel.add(btnSair);
		
			}
		}
package apresentacao;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class VisaoCadastroProduto extends JFrame {
	// Propriedades da classe
	private static final long SerialVersionUID = 1L;
	
	//PAINEL
	private JPanel objPainel = new JPanel();
	
	//MARCA
	private JLabel lblMarca = new JLabel("Marca");
	private ButtonGroup grpMarca = new ButtonGroup();
	private JRadioButton optPatagonia = new JRadioButton("Patagonia");
	private JRadioButton optDove = new JRadioButton("Dove");
	
	//NOME DO PRDOUTO
	private JLabel lblNomeProduto = new JLabel("Nome do Produto");
	private JTextField txtNomeProduto = new JTextField();
	
	//MEDIDA
	private JLabel lblMedida = new JLabel("Medida");
	private JTextField txtMedida = new JTextField();
	
	//FOTO DO PRODUTO
	private JLabel lblFotoProduto = new JLabel("Foto do Produto");
	private JTextField txtFotoProduto = new JTextField();
	
	//BOT�O GRAVAR
	private JButton btnGravar = new JButton("Gravar");
	
	// M�todos principal da execu��o da classe
	public static void main(String[] args) {
		new VisaoCadastroProduto().setVisible(true);
	}
	
	// M�todo construtor vazio da classe
	public VisaoCadastroProduto() {
		//Configura��o da minha janela
		setTitle("Cadastro de Produtos");
		setSize(1024, 576);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//CONFIGURA��ES DO PAINEL
		setContentPane(objPainel);
		objPainel.setLayout(null);
		
		//CONFIGURA��O MARCA
		lblMarca.setBounds(20, 20, 50, 20);
		objPainel.add(lblMarca);
		
		grpMarca.add(optPatagonia);
		grpMarca.add(optDove);
		
		optPatagonia.setSelected(true);
		
		optPatagonia.setBounds(20, 60, 90, 20);
		objPainel.add(optPatagonia);
		
		optDove.setBounds(120, 60, 100, 20);
		objPainel.add(optDove);
		
		//CONFIGURA��O NOME DO PRODUTO
		lblNomeProduto.setBounds(20, 80, 80, 20);
		objPainel.add(lblNomeProduto);
				
		txtNomeProduto.setBounds(20, 100, 400, 20);
		objPainel.add(txtNomeProduto);
		
		//CONFIGURA��O MEDIDA
		lblMedida.setBounds(20, 140, 90, 20);
		objPainel.add(lblMedida);
						
		txtMedida.setBounds(20, 160, 400, 20);
		objPainel.add(txtMedida);
		
		//CONFIGURA��O FOTO DO PRODUTO
		lblFotoProduto.setBounds(20, 200, 100, 20);
		objPainel.add(lblFotoProduto);
								
		txtFotoProduto.setBounds(20, 220, 400, 20);
		objPainel.add(txtFotoProduto);
		
		//BOT�O GRAVAR
		
				
		btnGravar.setBounds(470, 500, 80, 20);
		objPainel.add(btnGravar);
		
	}
}

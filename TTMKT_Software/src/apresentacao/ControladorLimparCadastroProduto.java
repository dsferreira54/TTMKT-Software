package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class ControladorLimparCadastroProduto implements ActionListener {
	// Propriedades da classe
		private JComboBox<String> lblMarca = null;
		private JComboBox<String> cboMarca = null;
		private JTextField txtNomeProduto = null;
		private JTextField txtMedida = null;
		private JTextField txtFotoProduto = null;
	// M�todo construtor cheio da classe	
		public ControladorLimparCadastroProduto(JComboBox<String> lblMarca, JComboBox<String> cboMarca, JTextField txtNomeProduto,
				JTextField txtMedida, JTextField txtFotoProduto) {
			super();
			this.lblMarca = lblMarca;
			this.cboMarca = cboMarca;
			this.txtNomeProduto = txtNomeProduto;
			this.txtMedida = txtMedida;
			this.txtFotoProduto = txtFotoProduto;
		}
	
	// M�todo sobrescrito da interface
	public void actionPerformed(ActionEvent e) {
		cboMarca.setSelectedIndex(0);
		txtNomeProduto.setText("");
		txtFotoProduto.setText("");
		txtMedida.setText("");
		txtFotoProduto.setText("");
	}	
}
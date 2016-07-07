package Vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Controlador.Interfacevalidar;
import Controlador.proveedor_controlador;
import Modelo.Proveedor;
import Modelo.BD_proveedor;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JTable;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	DefaultTableModel model;
	DefaultTableModel model1;
	private JTable table_1;
	private JTextField textField;
	ArrayList<String> f;
	
	public Principal() {
	
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 879, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNuevo.setBounds(46, 59, 110, 23);
		btnNuevo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				registro r = new registro();
				r.setVisible(true);
				
			}
		});
		panel.setLayout(null);
		panel.add(btnNuevo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 150, 816, 324);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		table_1 = new JTable();
		table_1.setBounds(10, 11, 622, 311);
		panel_1.add(table_1);
		table_1.setVisible(true);
		JScrollPane panel_1_1 = new JScrollPane( table_1 );
		panel_1_1.setBounds(10, 11, 796, 294);
		panel_1.add(panel_1_1);
		
		JButton btnNewButton = new JButton("ELIMINAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i =table_1.getSelectedRow(); 
				if(i==-1){
					JOptionPane.showMessageDialog(null, "POR FAVOR PRIMERO SELECCIONE UN REGISTRO");
				}else{
					Interfacevalidar v = new proveedor_controlador();
					JOptionPane.showMessageDialog(null,  i );
					String id = (String)table_1.getValueAt(i,0);
				    v.eliminar(id);
				    num("");
				}
			}
		});
		btnNewButton.setBounds(46, 100, 110, 23);
		panel.add(btnNewButton);
		
		JButton btnActualizar = new JButton("ACTUALIZAR");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i =table_1.getSelectedRow(); 
				if(i==-1){
					JOptionPane.showMessageDialog(null, "POR FAVOR PRIMERO SELECCIONE UN REGISTRO");
				}else{
					actualiza z = new actualiza();
					z.datos((String)table_1.getValueAt(i,0),(String)table_1.getValueAt(i,1),(String)table_1.getValueAt(i,2),(String)table_1.getValueAt(i,3),(String)table_1.getValueAt(i,4),
							(String)table_1.getValueAt(i,5),(String)table_1.getValueAt(i,6),(String)table_1.getValueAt(i,7),(String)table_1.getValueAt(i,8),
							(String)table_1.getValueAt(i,9));
					z.setVisible(true);
					num("");
				}
			}
		});
		btnActualizar.setBounds(181, 59, 126, 23);
		panel.add(btnActualizar);
		
		
		JLabel lblFiltrarBusqueda = new JLabel("FILTRAR BUSQUEDA POR EMPRESA");
		lblFiltrarBusqueda.setForeground(Color.BLUE);
		lblFiltrarBusqueda.setBounds(507, 75, 201, 14);
		panel.add(lblFiltrarBusqueda);
		
		JButton btnBusca = new JButton("busca");
		btnBusca.setBounds(634, 100, 142, 23);
		panel.add(btnBusca);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				num(textField.getText());
			}
		});
		textField.setBounds(427, 101, 176, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnContarRegistros = new JButton("SALIR");
		btnContarRegistros.setBounds(184, 100, 123, 23);
		panel.add(btnContarRegistros);
		
		JLabel lblGestinDeProveedores = new JLabel("GESTI\u00D3N DE PROVEEDORES");
		lblGestinDeProveedores.setFont(new Font("Stencil", Font.PLAIN, 28));
		lblGestinDeProveedores.setBackground(Color.GREEN);
		lblGestinDeProveedores.setBounds(237, 11, 392, 24);
		panel.add(lblGestinDeProveedores);
		//cargar("");
		num("");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {
				num("");
			}
		});
	
	}

	
	public void num(String dato){
		String [] titulo = {"id","Empresa","RUC","País","Ciudad","Dirección","Teléfono","Celular","Repre.","Fecha"};
		String [] registro = new String[10];
		
		model = new DefaultTableModel(null,titulo);
		BD_proveedor registro1 = new BD_proveedor();
		ArrayList<String> ar = registro1.datos(dato);
		Iterator it = ar.iterator(); 
		while ( it.hasNext() ) { 
			Object objeto = it.next(); 
			Proveedor producto = (Proveedor)objeto; 
			registro[0]=producto.getIds();
			registro[1]=producto.getEmpresa();
			registro[2]=producto.getRuc();
			registro[3]=producto.getPais();
			registro[4]=producto.getCiudad();
			registro[5]=producto.getDireccion();
			registro[6]=producto.getTelefono();
			registro[7]=producto.getCelular();
			registro[8]=producto.getRepresentante();
			registro[9]=producto.getFecha();
			model.addRow(registro);
		} 
		table_1.setModel(model);	
	}
}

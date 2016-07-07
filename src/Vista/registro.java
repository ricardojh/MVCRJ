package Vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Interfacevalidar;
import Controlador.proveedor_controlador;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class registro extends JFrame {

	private JPanel contentPane;
	private JTextField emp;
	private JTextField ruc;
	private JTextField pai;
	private JTextField ciu;
	private JTextField dir;
	private JTextField tel;
	private JTextField cel;
	private JTextField rep;
	private JTextField fec;
	
	public registro() {
	    
	    
	    setLocationRelativeTo(null);
		setBounds(100, 100, 607, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 571, 322);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Empresa");
		lblNewLabel.setBounds(10, 49, 46, 14);
		panel.add(lblNewLabel);
		
		emp = new JTextField();
		emp.setBounds(66, 46, 86, 20);
		panel.add(emp);
		emp.setColumns(10);
		
		JLabel lblRuc = new JLabel("RUC");
		lblRuc.setBounds(10, 86, 46, 14);
		panel.add(lblRuc);
		
		ruc = new JTextField();
		ruc.setBounds(66, 83, 86, 20);
		panel.add(ruc);
		ruc.setColumns(10);
		
		JLabel lblPas = new JLabel("Pa\u00EDs");
		lblPas.setBounds(10, 121, 46, 14);
		panel.add(lblPas);
		
		pai = new JTextField();
		pai.setBounds(66, 118, 86, 20);
		panel.add(pai);
		pai.setColumns(10);
		
		JLabel lblCiudad = new JLabel("Ciudad");
		lblCiudad.setBounds(10, 171, 46, 14);
		panel.add(lblCiudad);
		
		ciu = new JTextField();
		ciu.setBounds(66, 168, 86, 20);
		panel.add(ciu);
		ciu.setColumns(10);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n");
		lblDireccin.setBounds(10, 215, 46, 14);
		panel.add(lblDireccin);
		
		dir = new JTextField();
		dir.setBounds(66, 212, 86, 20);
		panel.add(dir);
		dir.setColumns(10);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono");
		lblTelfono.setBounds(226, 49, 46, 14);
		panel.add(lblTelfono);
		
		tel = new JTextField();
		tel.setBounds(322, 43, 86, 20);
		panel.add(tel);
		tel.setColumns(10);
		
		JLabel lblCelular = new JLabel("Celular");
		lblCelular.setBounds(226, 86, 46, 14);
		panel.add(lblCelular);
		
		cel = new JTextField();
		cel.setBounds(322, 80, 86, 20);
		panel.add(cel);
		cel.setColumns(10);
		
		JLabel lblRepresentanteLegal = new JLabel("Repre. legal");
		lblRepresentanteLegal.setBounds(228, 121, 66, 14);
		panel.add(lblRepresentanteLegal);
		
		rep = new JTextField();
		rep.setBounds(328, 121, 182, 20);
		panel.add(rep);
		rep.setColumns(10);
		
		JLabel lblFechaDeConstitucin = new JLabel("Fecha de constituci\u00F3n de la empresa");
		lblFechaDeConstitucin.setBounds(226, 171, 182, 14);
		panel.add(lblFechaDeConstitucin);
		
		fec = new JTextField();
		fec.setBounds(430, 168, 108, 20);
		panel.add(fec);
		fec.setColumns(10);

		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardar.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				try{
					Interfacevalidar v = new proveedor_controlador();
					v.empresa(emp.getText());
					v.ruc(ruc.getText());
					v.pais(pai.getText());
					v.ciudad(ciu.getText());
					v.direccion(dir.getText());
					v.telefono(tel.getText());
					v.celular(cel.getText());
					v.representante(rep.getText());
					v.fecha(fec.getText());
					v.registro();
					dispose();
					}catch(NullPointerException e){
					System.out.println("Excepció llençada");
					}

			}
		});
		btnGuardar.setBounds(242, 273, 89, 23);
		panel.add(btnGuardar);
		
		JLabel lblAdministradorDeProveedores = new JLabel("ADMINISTRADOR DE PROVEEDORES");
		lblAdministradorDeProveedores.setBounds(193, 11, 199, 14);
		panel.add(lblAdministradorDeProveedores);
	}

}

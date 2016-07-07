package Vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Interfacevalidar;
import Controlador.proveedor_controlador;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class actualiza extends JFrame {

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
    public int id;

	public actualiza() {
		
		setBounds(100, 100, 610, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(10, 27, 571, 322);
		contentPane.add(panel);
		
		JLabel label = new JLabel("Empresa");
		label.setBounds(10, 49, 46, 14);
		panel.add(label);
		
		emp = new JTextField();
		emp.setColumns(10);
		emp.setBounds(66, 46, 86, 20);
		panel.add(emp);
		
		JLabel label_1 = new JLabel("RUC");
		label_1.setBounds(10, 86, 46, 14);
		panel.add(label_1);
		
		ruc = new JTextField();
		ruc.setColumns(10);
		ruc.setBounds(66, 83, 86, 20);
		panel.add(ruc);
		
		JLabel label_2 = new JLabel("Pa\u00EDs");
		label_2.setBounds(10, 121, 46, 14);
		panel.add(label_2);
		
		pai = new JTextField();
		pai.setColumns(10);
		pai.setBounds(66, 118, 86, 20);
		panel.add(pai);
		
		JLabel label_3 = new JLabel("Ciudad");
		label_3.setBounds(10, 171, 46, 14);
		panel.add(label_3);
		
		ciu = new JTextField();
		ciu.setColumns(10);
		ciu.setBounds(66, 168, 86, 20);
		panel.add(ciu);
		
		JLabel label_4 = new JLabel("Direcci\u00F3n");
		label_4.setBounds(10, 215, 46, 14);
		panel.add(label_4);
		
		dir = new JTextField();
		dir.setColumns(10);
		dir.setBounds(66, 212, 86, 20);
		panel.add(dir);
		
		JLabel label_5 = new JLabel("Tel\u00E9fono");
		label_5.setBounds(226, 49, 46, 14);
		panel.add(label_5);
		
		tel = new JTextField();
		tel.setColumns(10);
		tel.setBounds(322, 43, 86, 20);
		panel.add(tel);
		
		JLabel label_6 = new JLabel("Celular");
		label_6.setBounds(226, 86, 46, 14);
		panel.add(label_6);
		
		cel = new JTextField();
		cel.setColumns(10);
		cel.setBounds(322, 80, 86, 20);
		panel.add(cel);
		
		JLabel label_7 = new JLabel("Repre. legal");
		label_7.setBounds(228, 121, 66, 14);
		panel.add(label_7);
		
		rep = new JTextField();
		rep.setColumns(10);
		rep.setBounds(328, 121, 182, 20);
		panel.add(rep);
		
		JLabel label_8 = new JLabel("Fecha de constituci\u00F3n de la empresa");
		label_8.setBounds(226, 171, 182, 14);
		panel.add(label_8);
		
		fec = new JTextField();
		fec.setColumns(10);
		fec.setBounds(430, 168, 108, 20);
		panel.add(fec);
		
		JButton btnActualizar = new JButton("ACTUALIZAR");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
				v.actualizar(id);
				dispose();
				
			}
		});
		btnActualizar.setBounds(244, 269, 108, 23);
		panel.add(btnActualizar);
		
		JLabel label_9 = new JLabel("ADMINISTRADOR DE PROVEEDORES");
		label_9.setBounds(193, 11, 199, 14);
		panel.add(label_9);
	}
	public void datos(String ids, String em, String ru, String pais, String ciud, String dire, String tele, String celu, String repr, String fech ){
		id= Integer.parseInt(ids);
		emp.setText(em);
		ruc.setText(ru);
		pai.setText(pais);
		ciu.setText(ciud);
		dir.setText(dire);
		tel.setText(tele);
		cel.setText(celu);
		rep.setText(repr);
		fec.setText(fech);
	}
}

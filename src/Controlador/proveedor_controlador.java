package Controlador;

import javax.swing.JOptionPane;
import Modelo.Proveedor;
import Modelo.BD_proveedor;
import Vista.registro;

public class proveedor_controlador implements Interfacevalidar{
	private BD_proveedor registro;
	private Proveedor proveedor;
	
	public proveedor_controlador(){
		registro = new BD_proveedor();
		proveedor = new Proveedor();
	}
	
	
	public void empresa(String emp){
		if(emp.length() > 1){
			proveedor.setEmpresa(emp);
		}
	}
	public void ruc(String ruc){
		if(ruc.length() > 1){
			proveedor.setRuc(ruc);
		}
	}
	public void pais(String pai){
		if(pai.length() > 1){
			proveedor.setPais(pai);
		}
	}
	public void ciudad(String ciu){
		if(ciu.length() > 1){
			proveedor.setCiudad(ciu);
		}
	}
	public void direccion(String dir){
		if(dir.length() > 1){
			proveedor.setDireccion(dir);
		}
	}
	public void telefono(String tel){
		if(tel.length() > 1){
			proveedor.setTelefono(tel);
		}
	}
	public void celular(String cel){
		if(cel.length() > 1){
			proveedor.setCelular(cel);
	}
	}
	
	public void representante(String rep){
		if(rep.length() > 1){
			proveedor.setRepresentante(rep);
		}
	}
	public void fecha(String fec){
		if(fec.length() > 1){
			proveedor.setFecha(fec);
		}
	}
	
	public void registro(){
		if(registro.getInsercion(proveedor)){
			JOptionPane.showMessageDialog(null, "exacto registrado :)");
		}else{
			JOptionPane.showMessageDialog(null, "incorrecto :(");
		}
	}
	
	public void eliminar(String ids){
		String i= ids;
		if(registro.geteliminar(proveedor, i)){
			JOptionPane.showMessageDialog(null, "ELIMINADO :)");
		}else{
			JOptionPane.showMessageDialog(null, "NO ELIMINADO :(");
		}
		
	}
	
	public void actualizar(int id){
		int ids=id;
		if(registro.getactualizar(proveedor, ids)) {
			JOptionPane.showMessageDialog(null, "REGISTRO ACTUALIZADO");
		}else{
			JOptionPane.showMessageDialog(null, "NO ACTUALIZADO ERROR :(");
		}
		
	}

}

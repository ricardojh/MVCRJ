package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class BD_proveedor {
	private Connection coneccion;
	private Statement st;
	private ResultSet rs;
	ArrayList lista=new ArrayList();
	
	public BD_proveedor(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			coneccion = DriverManager.getConnection("jdbc:mysql://localhost/proveedor", "root", "");
			System.out.println("CONECCIÓN LISTA");
		} catch (Exception error) {
			error.printStackTrace();
			// TODO: handle exception
		}
	}
	
	public boolean getInsercion(Proveedor proveedor) {
		 try {
			 st =  coneccion.createStatement();
			 st.executeUpdate("insert into proveedores (id, empresa, ruc, pais, ciudad, direccion, telefono, celular, representante,fecha)"
    		+ " values (null, '"+proveedor.getEmpresa()+"','"+proveedor.getRuc()+"','"+proveedor.getPais()+"','"+proveedor.getCiudad()+"','"+proveedor.getDireccion()+"','"+proveedor.getTelefono()+"','"+proveedor.getCelular()+"','"+proveedor.getRepresentante()+"','"+proveedor.getFecha()+"')"); 
			 return true;
		 		} catch (Exception error) {
				error.printStackTrace();
				// TODO: handle exception
		 		}
		 return false;
	}
	
	public boolean geteliminar(Proveedor proveedor, String ids){
		int i= Integer.parseInt(ids);
		try {
			st =  coneccion.createStatement();
		    st.executeUpdate("delete from proveedores where id ='"+i+"' ");
		    		return true;
	    	} catch (Exception error) {
						error.printStackTrace();
						// TODO: handle exception
					}
		return false;
	}
	
	public boolean getactualizar(Proveedor proveedor, int ids) {
		 try {
			 st =  coneccion.createStatement();
			 st.executeUpdate("update proveedores set empresa='"+proveedor.getEmpresa()+"', ruc='"+proveedor.getRuc()+"', "
			 				+ "pais='"+proveedor.getPais()+"', ciudad='"+proveedor.getCiudad()+"', direccion='"+proveedor.getDireccion()+"',"
			 				+ " telefono='"+proveedor.getTelefono()+"', celular='"+proveedor.getCelular()+"', representante='"+proveedor.getRepresentante()+"',"
			 				+ "fecha='"+proveedor.getFecha()+"' where id = '"+ids+"' ");
			 				return true;
		 		} catch (Exception error) {
				error.printStackTrace();
				// TODO: handle exception
		 		}
		 return false;
	}
	
	public ArrayList<String> datos(String dato){
		String sql = "SELECT * fROM proveedores where empresa LIKE '%"+dato+"%' ";
		try {
			
			st =  coneccion.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
				String id= rs.getString("id");
			    String emp =rs.getString("empresa");
				String ru=rs.getString("ruc");
				String pa=rs.getString("pais");
				String ciu =rs.getString("ciudad");
				String dir=rs.getString("direccion");
				String tel=rs.getString("telefono");
				String rep=rs.getString("representante");
				String cel=rs.getString("celular");
				String fec=rs.getString("fecha");
				Proveedor pr = new Proveedor(id, emp, ru, pa, ciu, dir, tel, cel, rep, fec);
				lista.add(pr);				
			}
			return lista;
			
		} catch (Exception error) {
			error.printStackTrace();
			// TODO: handle exception
			return null;
		}
		
	}
}	
package Modelo;

public class Proveedor {
	private String ids;
	private String empresa;
	private String ruc;
	private String pais;
	private String ciudad;
	private String direccion;
	private String telefono;
	private String celular;
	private String representante;
	private String fecha;
	
	public Proveedor(){
		this("","","","","","","","","","");
	}
	public Proveedor(String id, String empresa, String ruc, String pais, String ciudad, String direccion, String telefono,
			String celular, String representante, String fecha) {
		super();
		this.ids = id;
		this.empresa = empresa;
		this.ruc = ruc;
		this.pais = pais;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.telefono = telefono;
		this.celular = celular;
		this.representante = representante;
		this.fecha = fecha;
	}

	public String getIds(){
		return ids;
		
	}
	
	public void setIds(String ids){
		this.ids = ids;
	}
	
	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getRepresentante() {
		return representante;
	}

	public void setRepresentante(String representante) {
		this.representante = representante;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Proveedor [id="+ids+", empresa=" + empresa + ", ruc=" + ruc + ", pais=" + pais + ", ciudad=" + ciudad
				+ ", direccion=" + direccion + ", telefono=" + telefono + ", celular=" + celular + ", representante="
				+ representante + ", fecha=" + fecha + "]";
	}
	
	
}

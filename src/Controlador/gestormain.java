package Controlador;

import Vista.Principal;

public class gestormain {
	private proveedor_controlador Proveedor_controler;
	private Principal prin;
	
	public gestormain(){
		prin = new Principal();
	}
	public static void main(String[] args){
		new gestormain();	
	}
}

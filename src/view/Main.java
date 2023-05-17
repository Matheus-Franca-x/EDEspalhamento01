package view;

import controller.EspalhamentoControll;

public class Main {

	public static void main(String[] args) 
	{
		EspalhamentoControll c = new EspalhamentoControll();
		
		try {
			c.chamadaCsv();
			c.listar();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

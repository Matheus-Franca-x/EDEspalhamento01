package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import matheus.ListaObject.ListaObject;
import model.Num;

public class EspalhamentoControll {

	
	ListaObject[] listaInt;
	
	public EspalhamentoControll() 
	{
		listaInt = new ListaObject[300];
		iniciarInteiros();
	}
	
	public void iniciarInteiros()
	{
		int tamanho = listaInt.length;
		for (int i = 0; i < tamanho; i++)
		{
			listaInt[i] = new ListaObject();
		}
	}
	
	public void chamadaCsv() throws Exception
	{
		
		File arq = new File("C:\\TEMP", "Espalhamento.csv");
		
		FileInputStream abreFlux = new FileInputStream(arq);
		InputStreamReader lerFlux = new InputStreamReader(abreFlux);
		BufferedReader buffer = new BufferedReader(lerFlux);
		String linha = buffer.readLine();
		
		while (linha != null)
		{
			linha = linha.replaceAll("[^0-9]", "");
			
			Num numero = new Num(Integer.parseInt(linha));
			int posicao = numero.hashCode();
			
			listaInt[posicao].addFirst(numero);
			
			linha = buffer.readLine();
		}
		
		buffer.close();
		lerFlux.close();
		abreFlux.close();
		
	}
	
	public void listar() throws Exception
	{
		int tamanho = listaInt.length;
		
		for (int i = 0; i < tamanho; i++)
		{
			int tamanho1 = listaInt[i].size();
			for (int j = 0; j < tamanho1; j++)
			{
				Num n = (Num) listaInt[i].get(j);
				System.out.println(n.toString());
				
			}
			
			
		}
		
		
		
	}
	

}

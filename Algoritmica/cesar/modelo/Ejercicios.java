package modelo;

import java.util.Scanner;

import javax.sound.midi.Synthesizer;
import javax.swing.JOptionPane;

/**
 * @author Yefferson Linares - Ing. de sistemas II
 */
public class Ejercicios 
{

	private static String caracteres;
	private static Scanner sc;
    public static void main(String[] args)
   {
   	 Ejercicios pro = new Ejercicios();
   	 sc = new Scanner(System.in);
   }
	
	public void getMensaje(String mensaje)
	{
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	public String capturarDato(String mensaje)
	{
		String pro = JOptionPane.showInputDialog(null, mensaje);
		return pro;
	}
	
	//Primero
	public int signoAdmiracion(String caracteres)
	{
		boolean log = false;
		int z = 0;
		System.out.println("Ingresa caracteres");
		while(!log)
		{
			caracteres = sc.next();
			if(caracteres.equals("!")) log = true;
			else z++;
		}
		System.out.println(z);
		return z;
	}
	
	//Segundo
     public int contarCaracteres(String caracteres)
	{
    	 this.caracteres = caracteres;
		String[] pro = new String[] {"l","a","p","i","z"};
		int[] sas = new int[] {0,0,0,0,0};
		int contador = 0;
		boolean log = false;
		System.out.println("Ingresa caracteres");
		while(!log)
		{
			caracteres = sc.next();
			if(caracteres.equalsIgnoreCase(pro[0]) && sas[0]==0) sas[0]=1;
			if(caracteres.equalsIgnoreCase(pro[1]) && sas[1]==0) sas[1]=1;
			if(caracteres.equalsIgnoreCase(pro[2]) && sas[2]==0) sas[2]=1;
			if(caracteres.equalsIgnoreCase(pro[3]) && sas[3]==0) sas[3]=1;
			if(caracteres.equalsIgnoreCase(pro[4]) && sas[4]==0) sas[4]=1;
			contador++;
			if(sas[0]==1 && sas[1]==1 && sas[2]== 1 && sas[3]==1 && sas[4]==1) log = true;
		}
		System.out.println(contador);
		return contador;
	}
     
     //Tercero
     public int contarCaracteres2(String caracteres)
     {
    	 this.caracteres = caracteres;
    	 String[] pro = new String[] {"m","e","s","a"};
    	 int[] sas = new int[pro.length];
    	 int contador = 0;
    	 boolean log = false;
		 System.out.println("Ingresa caracteres");
    	 while(!log)
    	 {
    		 caracteres = sc.next();
 			if(caracteres.equalsIgnoreCase(pro[0]) && sas[0]==0) log = true;
 			if(caracteres.equalsIgnoreCase(pro[1]) && sas[1]==0) log = true;
 			if(caracteres.equalsIgnoreCase(pro[2]) && sas[2]==0) log = true;
 			if(caracteres.equalsIgnoreCase(pro[3]) && sas[3]==0) log = true;
 			contador++;
    	 }
    	 System.out.println("Los numeros contados fueron "+contador);
    	 return contador;
     }
     
     // Cuarto
     public void contarCaracteres3(String caracteres)
     {
    	 String resp = "";
    	 String palabra = "todo lo que se aprenda se debe practicar";
    	 String[] sas = new String[palabra.length()];
    	 boolean log = false;
    	 sas = palabra.split("");
    	 System.out.println("Ingresa los caracteres a evaluar");
    	 while(!log)
    	 {
    		int contador = 0;
    		 caracteres = sc.nextLine();
    		 for(int x=0;x<sas.length;x++)
    		 {
    			 if(caracteres.equalsIgnoreCase(sas[x]))
    			 {
    				 contador++;
    			 }
    			 else 
    			 {
    				 log = true;
    			 }
    		 }
    		 if(contador!=0) log = false;
    	 }
    	 System.out.println("se detuvo");
     }
     
 	//Quinto
 	public String palindrome(String palabra)
 	{
 		palabra = sc.next();
 		String sas = "";
 		String sub = "";
 		String sub2 = "";
 		String[] pro = new String[10];
 		pro = palabra.split("");
 		boolean valor = false;
 		for(int x=0;x<pro.length && valor == false;x++)
 		{
 			sub = pro[x];
 			if(x==9 || pro[x].equals(".")) valor = true;
 		}
 		for(int z=pro.length-1;z>=0;z--)
 		{
 			sub2 = pro[z];
 		}
 		if(sub.equals(sub2))
 		{
 			sas = "Es palindrome";
 		}
 		else
 		{
 			sas = "No es palindrome";
 		}
 		System.out.println(sas);
 		return sas;
 	} 

 	//Sexto
 	public String determinarAño(long año, String mes)
 	{
 		año = sc.nextLong();
 		mes = sc.next();
 		String[] pro = new String[] {"Ene","Feb","Mar","Abr","May","Jun","Jul","Ago","Sep","Oct","Nov","Dic"};
 		String[] sas = new String[] {"31","28","31","30","31","30","31","31","30","31","30","31"};
 		String fla = "";
 		for(int x=0;x<pro.length;x++)
 		{
 			if(año%4==0 && año%100!=0 || año%400==0)
 			{
 				if(mes.equalsIgnoreCase(pro[1]))
 				{
 					fla = "29";
 				}
 				else if(mes.equalsIgnoreCase(pro[x]))
 				{
 					fla = sas[x];
 				}
 			}
 			else
 			{
 				if(mes.equalsIgnoreCase(pro[x]))
 				{
 					fla = sas[x];
 				}
 			}
 		}
 		System.out.println(fla);
 		return fla;
 	}
}
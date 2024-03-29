package org.microjava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;

import java_cup.runtime.Symbol;

import org.microjava.syntax.*;

import rs.etf.pp1.mj.runtime.Code;
import rs.etf.pp1.symboltable.Tab;

public class MicroJavaBuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		if(args.length < 1)
		{
			System.err.println("Nema dovoljno argumenata");
			return;
		}
		FileReader inputFile = null;
		try {
			inputFile = new FileReader(new File(args[0]));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Lexer l = new Lexer(inputFile);
//		try {
//			Symbol s = l.next_token();
//			System.out.print(s.sym + " ");
//			while(s.sym != sym.EOF)
//			{
//				s = l.next_token();
//				System.out.print(s.sym + " ");
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Tab.init();
		parser p = new parser(l);
		try {
			Symbol s = p.parse();
			if(s.sym == sym.INVALID){
				System.out.println("JBG");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Na kraju je pronadjeno " + p.innerClassDeclarations + " unutrasnjih klasa ");
		System.out.println("Na kraju je pronadjeno " + p.innerClassMethods + " metoda unutrasnih klasa ");
		System.out.println("Na kraju je pronadjeno " + p.mainClassMethods + " metoda glavne klase ");
		System.out.println("Na kraju je pronadjeno " + p.constDeclaration + " globalnih konstanti ");
		System.out.println("Na kraju je pronadjeno " + p.arrayDeclaration + " globalnih nizova ");
		System.out.println("Na kraju je pronadjeno " + p.varDeclaration + " globalnih promenljivih prostog tipa ");
		System.out.println("Na kraju je pronadjeno " + p.numOfFunctions + " poziva funkcija u okviru main ");
		System.out.println("Na kraju je pronadjeno " + p.numOfStatements + " iskaza u okviru main ");
		
		if(p.errorDetected)
		{
			System.out.println("Bilo je " + p.numOfErrors +" gresaka pri parsiranju");
		}
		else
		{
			System.out.println("Nije bilo gresaka pri parsiranju");
		}
		
		System.out.print("\n\n\n");
		Tab.dump();
		
		try {
 		   if ( !p.errorDetected && !Code.greska) 
 		      Code.write(new FileOutputStream("jflex_cup/output.omj"));
 		} catch(Exception e) {
 		    System.err.println("Greska pri kreiranju objektnog fajla");
 		}
	}

}

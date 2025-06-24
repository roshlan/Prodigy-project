package projects;

import java.util.Scanner;

public class Passwordcheck {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Welcome to Password Checker!");
		System.out.println("Create the Username");
		String Username=s.nextLine();
		System.out.println("Create the password:");
		String password=s.nextLine();
		
		boolean hasletter=false;
		boolean hasnumber=false;
		boolean hascharacter=false;
		
		for(int i=0;i<password.length();i++)	
		{
			char ch=password.charAt(i);
			if(Character.isLetter(ch))
			{
				hasletter=true;
			}
			else if(Character.isDigit(ch))
			{
				hasnumber=true;
			}
			else
			{
				hascharacter=true;
			}
		}
		
		if(hasletter&&hasnumber&&hascharacter)
		{
			System.out.println("Strong Password...!");
		}
		else
		{
			System.out.println(" Weak Password!");
		}
		
	}

}

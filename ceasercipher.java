package projects;

import java.util.Scanner;

public class CeaserCipher {

	public static void main(String[] args) {
		
		String encrypt = "";
		String decrypt="";
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the message:");
		String msg=s.nextLine();
		System.out.println("Enter the shift:");
		int shift=s.nextInt();
		for (int i = 0; i < msg.length(); i++)
		{
		    char letter = msg.charAt(i);
		    if(Character.isLetter(letter))
		    {
		    	char ul=Character.isUpperCase(letter)?'A':'a';
		   char en=(char) ((letter-ul+shift)%26+ul);
             encrypt+=en;
             
		    }
		    else
		    {
		     encrypt += letter;
		    }
	}
		
		for (int i = 0; i < encrypt.length(); i++)
		{
		    char letter = encrypt.charAt(i);
		    if(Character.isLetter(letter))
		    {
		    	char ll=Character.isUpperCase(letter)?'A':'a';
		  
            char de =(char) ((letter-ll-shift+26)%26+ll);
           decrypt+=de;
		    }
		    else
		    {
		   decrypt+=letter;
		    }
	}
		System.out.println("Encrypted message : "+encrypt);
	    System.out.println("decrypted message : "+decrypt);

	}
}

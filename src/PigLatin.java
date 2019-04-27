//Kuruvilla Bose(Finny)


import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String prompt="Y";
		while(prompt.equalsIgnoreCase("Y"))
		{
		System.out.println("Welcome to the Pig Latin Translator");
		System.out.println("");
		System.out.println("Enter a word to be tranlated");
		
		while(scan.hasNextInt()==true) {
		scan.next();
			System.out.println("Enter a valid Text");
		}
		String word=scan.next();
		String newword=translator(word);
		System.out.println(newword);
		System.out.println("Translate another line(y/n)");
		prompt=scan.next();
		}
		System.out.println("Good Bye!!");
		scan.close();
		
	}
	//Method Definition
	public static String translator(String word) {
		word=word.toLowerCase();
		
		char vowels=word.charAt(0);
		if (vowels == 'a' || vowels == 'e' || vowels == 'i' || vowels == 'o' || vowels == 'u') {
            word = word + "way";
         }
		else {
			String firstPart,secondPart;
		    int i;
		    int l = word.length();
		    for(i = 0; i <l; i++) {
		        char c =word.charAt(i);
		        if(c == 'a' || c =='e' || c =='i' || c == 'o' || c == 'u') {
		            break;
		        }
		    }
		    firstPart=word.substring(0,i);
		    secondPart=word.substring(i);
		    word=secondPart+firstPart+"ay";
		    }
		return word;
		} 
	}
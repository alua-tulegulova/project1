package project1;
import java.util.Scanner;
public class projectGame {
public static void printa(char[] a){
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i]);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char input=' ';
		String[]words= {"apple","car","bicycle","pizza","trunk"};
		int random=(int)(Math.random()*(words.length));
		String secretWord=words[random];

		char[] hiddenWord=new char[secretWord.length()];
		for(int i=0;i<hiddenWord.length;i++) {
			hiddenWord[i]='*';
		}
		int lim=2*secretWord.length();
		boolean rightAnswer=false;
		int ind = 0;
		while(lim!=0&&!rightAnswer) {	
			System.out.println("You have "+lim+" attempts");
			System.out.print("The word is: " );
			printa(hiddenWord);
			System.out.print("Write a letter:");
			input=sc.next().charAt(0);
			if(secretWord.charAt(ind) == input){
				System.out.println("You found the letter");
				hiddenWord[ind] = secretWord.charAt(ind);
				if(ind==secretWord.length()-1) {
					System.out.println("You win! The word was "+secretWord);
					rightAnswer=true;
				}
				ind++;

			}else{
				System.out.println("You are wrong");
			}
			lim--;
			if(lim==0) {
				System.out.println("You lose! The word was "+secretWord);
			}
		}

	}

}


	

}

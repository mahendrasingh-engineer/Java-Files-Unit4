package characters;

public class Characters {
	void isChar(char c) {
		short v=(short)c;
		System.out.print(c);System.out.print(": ");
		if((v>=97&&v<=122)||(v>=65&&v<=90)){
			
			if(c=='a'||c=='e'||c=='u'||c=='o'||c=='i'||c=='A'||c=='E'||c=='U'||c=='I'||c=='O') {
				System.out.print("vowel");
			}else {
				System.out.print("consonant");
			}
			
		}else {
			System.out.print("error: invalid character");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Characters character1=new Characters();
		character1.isChar('o');//97-122
		character1.isChar('a');
		character1.isChar('I');
		character1.isChar('B');
		character1.isChar('4');
	}

}

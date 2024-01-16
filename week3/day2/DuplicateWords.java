package week3.day2;

public class DuplicateWords {

	public static void main(String[] args) {

		String duplicate= "We learn Java basics as part of java sessions in java week1";
		String[] s = duplicate.split(" ");
		String ans =  " ";
		for(int i=0; i<s.length; i++) {
			for(int j=i+1; j<s.length; j++) {
			if(s[i].equalsIgnoreCase(s[j])){
					s[j] = "remove";
			}
		}
	}
		
		for(String word: s) {
			if(word != "remove") {
				ans = ans + word + " ";
			}
		}
		
		System.out.println("Sentence after removing duplicate words: " + ans);
}
}
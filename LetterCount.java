
/**
 *	Counts the frequency of letters in a file and produces a histogram.
 *
 *	@author	Nishka Yadav
 *	@since	9/14/2023
 */
public class LetterCount {
	
	// Fields go here, all must be private
	private <int> letters;
	private <String> alphabet;
	
	/* Constructor */	
	public LetterCount(){
		this.letters;
		this.alphabet = {a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z};
	}
							
	public LetterCount() {
		FileUtils file = new FileUtils();
		Scanner readFile = file.openToRead();
		while (readFile.hasNext()){
			char str = readFile.nextChar();
			for (int i = 0; i < alphabet.size(); i++){
				if (i.equalsIgnoreStr(str))
					letters.add(letter.get(i) +1);
			}
		}
		for (int j = 0; j < alphabet.size(); j++){
			System.out.printf(alphabet.get(j) + ":%10d" + letter.get(j) + " ");
			for (int k = 0; k < 60/letters.get(j); k++){
				System.out.println("+");
			}
		}
		
		
	}
	
	/* Main routine */
	public static void main(String[] args) {
		LetterCount lc = new LetterCount();
		if (args.length != 1)
			System.out.println("Usage: java LetterCount <inputFile>");
		else
			lc.run(args);
	}
	
	/**	The core program of the class, it
	 *	- opens the input file
	 *	- reads the file and counts the letters
	 *	- closes the input file
	 *	- prints the histogram of the letter count
	 */
	public void run(String[] args) {
		String fileName = args[0];
	}
	
}

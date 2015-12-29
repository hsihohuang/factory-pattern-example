public class PaperMachine {

	public static void main(String[] args) {
		AbstractPaperFactory thesisFactory = new ThesisFactory(); 
		AbstractPaperFactory dissertationFactory = new DissertationFactory();
		Paper paper = thesisFactory.createPaper("Computer Science", "HsiHo", "Web Technologies", 65); 
		paper.printPaperDetails();
		paper = thesisFactory.createPaper("Biology", "Jay","Randomness in biology",52);
		paper.printPaperDetails();
		paper = dissertationFactory.createPaper("Computer Science", "Sandy", "Personalized Recommendation", 70);  
		paper.printPaperDetails();
	}

}

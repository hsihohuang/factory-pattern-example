public class ThesisFactory implements AbstractPaperFactory {
	public Paper createPaper(String Field, String Author, String Title, int Pagination) {
		Paper paper = null;
		   if(Field.equals("Computer Science")){
		      paper = new CSThesis(Field, Author, Title, Pagination);
		   }
		   else if(Field.equals("Biology")){
		      paper = new BioThesis(Field, Author, Title, Pagination);
		   }
     return paper;
	}
}

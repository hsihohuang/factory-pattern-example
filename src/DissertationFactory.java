public class DissertationFactory implements AbstractPaperFactory {

	@Override
	public Paper createPaper(String Field, String Author, String Title, int Pagination){
		   Paper paper = null;
		   if(Field.equals("Computer Science")){
		      paper = new CSDissertation(Field, Author, Title, Pagination);
		   }
		   else if(Field.equals("Biology")){
		      paper = new BioDissertation(Field, Author, Title, Pagination);
		   }
     return paper;
	}

}

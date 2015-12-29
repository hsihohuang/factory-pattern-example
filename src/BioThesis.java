public class BioThesis extends Paper{
	public BioThesis(String Field, String Author, String Title, int Pagination){
		super(Field, Author, Title, Pagination);
	}
	
	public void printPaperDetails(){
		System.out.println("\nThis is a Biology Thesis!");
		super.printPaperInfo();
	}
}

public class CSThesis extends Paper{
	public CSThesis(String Field, String Author, String Title, int Pagination){
		super(Field, Author, Title, Pagination);
	}
	
	public void printPaperDetails(){
		System.out.println("\nThis is a CS Thesis!");
		super.printPaperInfo();
	}
}

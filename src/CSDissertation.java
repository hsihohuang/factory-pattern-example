public class CSDissertation extends Paper{
	public CSDissertation(String Field, String Author, String Title, int Pagination){
		super(Field, Author, Title, Pagination);		
	}
	
	public void printPaperDetails(){
		System.out.println("\nThis is a CS Dissertation!");
		super.printPaperInfo();
	}
}

public class BioDissertation extends Paper{
	public BioDissertation(String Field, String Author, String Title, int Pagination){
		super(Field, Author, Title, Pagination);		
	}
	
	public void printPaperDetails(){
		System.out.println("\nThis is a Biology Dissertation!");
		super.printPaperInfo();
	}
}

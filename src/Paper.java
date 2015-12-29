public abstract class Paper {
	private String Author = ""; 
	private String Title = "";
	private String Field = "";
	private int Pagination = 0;
	public Paper(String Field, String Author, String Title,
			int Pagination){
		this.Field = Field;
		this.Author = Author;
		this.Title = Title;
		this.Pagination = Pagination;
	}
	public void printPaperInfo(){
		System.out.println("Title: "+this.Title);
		System.out.println("Author: "+this.Author);
		System.out.println("Pagination: "+this.Pagination);
	}
	
	public abstract void printPaperDetails();
	
}

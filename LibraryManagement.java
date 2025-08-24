class Book
{
	private int bookId;
	private String Title;
	private String Author;
	private Boolean Issued;
	
	public Book(int bookId, String Title, 
	String Author, Boolean Issued)
	{
		this.bookId=bookId;
		this.Title=Title;
		this.Author=Author;
		this.Issued=Issued;
	}
	public int getbookId()
	{
		return bookId;
	}
	public String getTitle()
	{
		return Title;
	}
	public String getAuthor()
	{
		return Author;
	}
	public Boolean getIssued()
	{
		return Issued;
	}
	
	// DISPLYAING ALL BOOKS 
	
	public void DisplayBooks()
	{
		System.out.println("bookId is: "+bookId+"Title is: "+Title, 
	 "Author is: "+Author+ "Issued: "+Issued);
	}
	
	//ADDING NEW BOOK
	
	public 
	
	
	
}
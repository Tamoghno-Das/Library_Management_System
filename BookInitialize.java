import java.util.Scanner;
class BookInitialize
{
	public static void main(String[] args)
	{
		int choice;
		BookManager bk = new BookManager();
		Scanner sc1 = new Scanner(System.in);
		
		while(true)
		{
		System.out.println("------Library Management System-------");
		System.out.println("1. Add Books");
		System.out.println("2. Display all Books");
		System.out.println("3. Search book by ID");
		System.out.println("4. check book issued");
		System.out.println("5. Return a Book");
		System.out.println("6. Exit");
		System.out.println("Enter your choice: ");
		choice = sc1.nextInt();
		
		if(choice==6)
		
		break;
			
			switch(choice)
			{
				case 1:
				bk.addBooks();
				break;
				
				case 2: 
				bk.displayBooks();
				break;
				
				case 3: 
				bk.searchBook();
				break;
				
				case 4: 
				bk.issueBook();
				break;
				
				case 5: 
				bk.returnBook();
				break;
				
				
				
				default: 
				System.out.println("Wrong Choice :-) ");
			}
		}
	}	
}
					
package com.beat_software.corejava.library;

import acm.program.ConsoleProgram;

public class LibraryMain extends ConsoleProgram{
	
	private Library myLib;
	
	public void run(){
		println("This is a Book Library Program.");
		println("To set up library" + ":\tkey in 0 and press enter");
		println("To add book" + ":\tkey in 1 and press enter");
		println("To search book" + "\tkey in 2 and press enter");
		println("To list book" + "\tkey in 3 and press enter");
		
				
		

		while(true){
			int userChoice = readInt("Enter 0 to 3: ");		
			if(userChoice == SETUP){
				if(myLib != null){
					println();
					boolean discardOld = askYesOrNo("You've done setup before."
														+ "\nNew one will be created.The old library will be gone."
														+ "\nDo you want to continue? Enter Yes/No: ");
					if(discardOld){
						setUp();
						continue;
					}else{
						continue;
					}
				}else{
					setUp();
					continue;
				}				
			}
			
			if(userChoice == ADD){
				addBook();
			}
			
			if(userChoice == SEARCH){
				
			}
			
			if(userChoice == LIST){
				
			}
		}				
	}

	public static void main(String[] args) {
		
		new LibraryMain().start();
		
	}
	
	private void setUp(){
		int row = readInt("\t>How many rows in a bookshelf? ");
		int col = readInt("\t>How many columns in a bookshelf? ");
		this.myLib = new Library(row, col);
		println("\t>Library with empty bookshelves successfully created!");
	}
	
	private void addBook(){
		while(true){
			String title = readLine("\t>Enter book title: ");
			boolean confirmAdding = askYesOrNo("\t>The book will be added to your library. "
												+ "Enter Yes to confirm, or No to discard: ");
			if(!confirmAdding){
				continue;
			}else{
				println("\t>Adding books...");
			}
			if(!askYesOrNo("Do you want to add more books? Yes/No: ")){
				break;
			}
		}
		
	}
	
	private boolean askYesOrNo(String prompt){
		boolean b;
		String yesOrNo = readLine(prompt);
		while(true){
			if("Yes".equals(yesOrNo)){
				b = true;
				break;
			}else if("No".equals(yesOrNo)){
				b = false;
				break;
			}else{
				yesOrNo = readLine(prompt);
			}
		}
		
		return b;
		
	}
	public static final int SETUP = 0;
	public static final int ADD = 1;
	public static final int SEARCH = 2;
	public static final int LIST = 3;
	public static final int SKIP = -1;

}

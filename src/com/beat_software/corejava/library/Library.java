package com.beat_software.corejava.library;

public class Library {
	
	private BookShelf science;
	private BookShelf technology;
	private BookShelf fiction;
	private BookShelf comic;
	
	public Library(){
		science = new BookShelf(SHELF_ROW_DEFAULT, SHELF_COL_DEFAULT);
		technology = new BookShelf(SHELF_ROW_DEFAULT, SHELF_COL_DEFAULT);
		fiction = new BookShelf(SHELF_ROW_DEFAULT, SHELF_COL_DEFAULT);
		comic = new BookShelf(SHELF_ROW_DEFAULT, SHELF_COL_DEFAULT);		
	}
	
	public Library(int row, int col){
		science = new BookShelf(row, col);
		technology = new BookShelf(row, col);
		fiction = new BookShelf(row, col);
		comic = new BookShelf(row, col);		
	}
	
	public static final int SHELF_ROW_DEFAULT = 10;
	public static final int SHELF_COL_DEFAULT = 10;

}

package dependencyInjection.deepBeans;

public class Book_DInByJavaConfig {
	
private String bookName;
private int bookPrice;
private BookHelperClass bookHelperClass;
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public int getBookPrice() {
	return bookPrice;
}
public void setBookPrice(int bookPrice) {
	this.bookPrice = bookPrice;
}
public BookHelperClass getBookHelperClass() {
	return bookHelperClass;
}
public void setBookHelperClass(BookHelperClass bookHelperClass) {
	this.bookHelperClass = bookHelperClass;
}

public void display() {
	System.out.println("bookName:"+bookName);
	System.out.println("bookPrice:"+bookPrice);
	System.out.println("bookHelperClass:"+bookHelperClass);
}
}

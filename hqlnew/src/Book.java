
public class Book {
private int bookid;
private String book;
private String author;
private double price;
public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}
public String getBook() {
	return book;
}
public void setBook(String book) {
	this.book = book;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Book [BOOKID: " + bookid+" AUTHOR:" + author + ", NAME:" + book + 
			",  PRICE:" + price + "]";
}

}

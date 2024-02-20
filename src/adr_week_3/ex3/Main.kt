import adr_week_3.ex3.controller.BookCollection
import adr_week_3.ex3.model.Book
fun main() {
    val collection = BookCollection()

    val book1 = Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565")
    val book2 = Book("To Kill a Mockingbird", "Harper Lee", "9780061120084")
    val book3 = Book("1984", "George Orwell", "9780451524935")

    collection.addBook(book1)
    collection.addBook(book2)
    collection.addBook(book3)

    collection.displayBooks()

    collection.removeBook("9780061120084")

    collection.displayBooks()
}

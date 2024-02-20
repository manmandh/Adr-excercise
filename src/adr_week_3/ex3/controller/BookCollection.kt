package adr_week_3.ex3.controller
import adr_week_3.ex3.model.Book
class BookCollection {
    private val books = mutableListOf<Book>()


    fun addBook(book: Book) {
        books.add(book)
        println("${book.title} added to the collection.")
    }

    fun removeBook(isbn: String) {
        val removedBook = books.firstOrNull { it.isbn == isbn }
        if (removedBook != null) {
            books.remove(removedBook)
            println("$removedBook removed from the collection.")
        } else {
            println("Book with ISBN $isbn not found in the collection.")
        }
    }

    fun displayBooks() {
        if (books.isEmpty()) {
            println("The collection is empty.")
        } else {
            println("Books in the collection:")
            books.forEach { println(it) }
        }
    }
}
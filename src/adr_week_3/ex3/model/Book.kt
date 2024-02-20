package adr_week_3.ex3.model
class Book(val title: String, val author: String, val isbn: String) {
    override fun toString(): String {
        return "$title by $author (ISBN: $isbn)"
    }
}

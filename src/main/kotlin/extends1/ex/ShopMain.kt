package extends1.ex

fun main() {
    val book = Book("JAVA", 10000, "han", "12345")
    val album = Album("앨범1", 15000, "seo")
    val movie = Movie("영화1", 18000, "감독1", "배우1")

    book.print()
    album.print()
    movie.print()

    val sum = book.price + album.price + movie.price
    println("상품 가격의 합 = $sum")
}
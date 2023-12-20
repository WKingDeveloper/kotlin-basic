package class1.ex

fun main() {
    val inception = MovieReview(
        "인셉션",
        "인생은 무한루프"
    )

    val aboutTime = MovieReview(
        "어바웃타임",
        "인생 시간 영화"
    )

    val movieReviews = arrayOf(inception, aboutTime)

    for (movieReview in movieReviews) {
        println("영화 제목 : ${movieReview.title}, 리뷰 : ${movieReview.review}")
    }

}
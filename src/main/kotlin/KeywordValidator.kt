class KeywordValidator(private val minLengthRequired: Int) {
    fun isValid(keyword: String): Boolean {
        return keyword == "*" || keyword.length >= minLengthRequired
    }
}
class Searcher(
    private val keywordValidator: KeywordValidator,
    private val cityDataSource: CityDataSource
) {

    fun search(keyword: String): List<String> {
        if (keywordValidator.isValid(keyword)) {
            return cityDataSource.containKeyword(keyword)
        }
        return emptyList()
    }
}
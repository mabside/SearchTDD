class CityDataSource {
    private val cities = listOf(
        "Paris",
        "Budapest",
        "Skopje",
        "Rotterdam",
        "Valencia",
        "Vancouver",
        "Amsterdam",
        "Vienna",
        "Sydney",
        "New York City",
        "London",
        "Bangkok",
        "Hong Kong",
        "Dubai",
        "Rome",
        "Istanbul"
    )

    fun containKeyword(keyword: String): List<String> {
        return if (keyword == "*") {
            cities
        } else {
            cities.filter { it.contains(keyword, true) }
        }
    }
}
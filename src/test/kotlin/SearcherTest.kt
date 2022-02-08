import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SearcherTest {

    @Test
    fun noCityFound() {
        val searcher = Searcher(
            keywordValidator = KeywordValidator(2),
            cityDataSource = CityDataSource()
        )
        val result = searcher.search("gw")
        assertEquals(emptyList<String>(), result)
    }

    @Test
    fun cityFound() {
        val searcher = Searcher(
            keywordValidator = KeywordValidator(2),
            cityDataSource = CityDataSource()
        )
        val result = searcher.search("sk")
        assertEquals(listOf("Skopje"), result)
    }

    @Test
    fun anotherCityFound() {
        val searcher = Searcher(
            keywordValidator = KeywordValidator(2),
            cityDataSource = CityDataSource()
        )
        val result = searcher.search("ai")
        assertEquals(listOf("Dubai"), result)
    }

    @Test
    fun multipleCitiesFound() {
        val searcher = Searcher(
            keywordValidator = KeywordValidator(2),
            cityDataSource = CityDataSource()
        )
        val result = searcher.search("dam")
        assertEquals(listOf("Rotterdam", "Amsterdam"), result)
    }

    @Test
    fun shortQuery() {
        val searcher = Searcher(
            keywordValidator = KeywordValidator(2),
            cityDataSource = CityDataSource()
        )
        val result = searcher.search("i")
        assertEquals(emptyList<String>(), result)
    }

    @Test
    fun genericQuery() {
        val cities = listOf(
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
        val searcher = Searcher(
            keywordValidator = KeywordValidator(2),
            cityDataSource = CityDataSource()
        )
        val result = searcher.search("*")
        assertEquals(cities, result)
    }
}
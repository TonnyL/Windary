import org.junit.Test

class GroupAnagramsTest {

    @Test
    fun testGroupAnagrams() {
        val ga = GroupAnagrams()

        assert(ga.groupAnagrams(arrayOf()).isEmpty())

        val list0 = ga.groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat"))
        assert(list0.size == 3)
        assert(list0.containsAll(listOf(listOf("tan", "nat"), listOf("eat", "tea", "ate"), listOf("bat"))))
    }

}
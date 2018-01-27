import org.junit.Test

class LetterCombinationsOfAPhoneNumberTest {

    @Test
    fun test() {
        val l = LetterCombinationsOfAPhoneNumber()

        assert(l.letterCombinations("").isEmpty())

        assert(l.letterCombinations("1").isEmpty())

        val list0 = l.letterCombinations("2")
        assert(list0.size == 3)
        assert(list0.containsAll(listOf("a", "b", "c")))

        val list1 = l.letterCombinations("23")
        assert(list1.size == 9)
        assert(list1.containsAll(listOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")))

        val list2 = l.letterCombinations("234")
        assert(list2.size == 27)
        assert(list2.containsAll(listOf("adg", "adh", "adi", "aeg", "aeh", "aei", "afg", "afh", "afi", "bdg", "bdh", "bdi", "beg", "beh", "bei", "bfg", "bfh", "bfi", "cdg", "cdh", "cdi", "ceg", "ceh", "cei", "cfg", "cfh", "cfi")))
    }

}
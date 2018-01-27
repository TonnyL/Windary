import org.junit.Test

class RemoveElementTest {

    @Test
    fun testRemoveElement() {
        val re = RemoveElement()

        assert(re.removeElement(intArrayOf(3, 2, 2, 3), 3) == 2)

        assert(re.removeElement(intArrayOf(3, 3), 3) == 0)

        assert(re.removeElement(intArrayOf(), 0) == 0)

        assert(re.removeElement(intArrayOf(2, 3, 4, 5, 888, 2), 2) == 4)

        assert(re.removeElement(intArrayOf(3, 3), 0) == 2)
    }

}
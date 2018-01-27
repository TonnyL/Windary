import org.junit.Test

class ThreeSumClosestTest {

    @Test
    fun testThreeSumClosest() {
        val t = ThreeSumClosest()

        assert(t.threeSumClosest(intArrayOf(-1, 2, 1, 4), 1) == 2)

        assert(t.threeSumClosest(intArrayOf(1, 1, 1, 0), 100) == 3)

        assert(t.threeSumClosest(intArrayOf(1, 1, 1, 0), -100) == 2)

        assert(t.threeSumClosest(intArrayOf(-1, 2, 1, -4), 1) == 2)
    }

}
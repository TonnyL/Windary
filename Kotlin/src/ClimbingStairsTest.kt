import org.junit.Test

class ClimbingStairsTest {

    @Test
    fun testClimbStairs() {

        val cs = ClimbingStairs()

        assert(cs.climbStairs(1) == 1)

        assert(cs.climbStairs(3) == 3)

        assert(cs.climbStairs(5) == 8)
    }

}
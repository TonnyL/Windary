import org.junit.Test

class ContainerWithMostWaterTest {

    @Test
    fun testMaxArea() {
        val cwmw = ContainerWithMostWater()

        assert(cwmw.maxArea(intArrayOf(1, 1)) == 1)

        assert(cwmw.maxArea(intArrayOf(1, 4, 9)) == 4)

        assert(cwmw.maxArea(intArrayOf(1, 4, 9, 4)) == 8)
    }

}
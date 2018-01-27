import org.junit.Test
import kotlin.test.assertFalse

class JumpGameTest {

    @Test
    fun testCanJump() {
        val jg = JumpGame()

        assertFalse(jg.canJump(intArrayOf()))

        assert(jg.canJump(intArrayOf(1)))

        assert(jg.canJump(intArrayOf(0)))

        assert(jg.canJump(intArrayOf(2, 3, 1, 1, 4)))

        assertFalse(jg.canJump(intArrayOf(3, 2, 1, 0, 4)))

        assert(jg.canJump(intArrayOf(4, 0, 0, 0)))
    }

}
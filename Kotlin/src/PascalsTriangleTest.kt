import org.junit.Assert
import org.junit.Test

class PascalsTriangleTest {

    @Test
    fun testGenerate() {
        val pt = PascalsTriangle()

        val lists = ArrayList<List<Int>>()
        Assert.assertEquals(pt.generate(0), lists)

        lists.add(listOf(1))
        Assert.assertEquals(pt.generate(1), lists)

        lists.add(listOf(1, 1))
        Assert.assertEquals(pt.generate(2), lists)

        lists.add(listOf(1, 2, 1))
        Assert.assertEquals(pt.generate(3), lists)

        lists.add(listOf(1, 3, 3, 1))
        Assert.assertEquals(pt.generate(4), lists)

        lists.add(listOf(1, 4, 6, 4, 1))
        Assert.assertEquals(pt.generate(5), lists)
    }

}
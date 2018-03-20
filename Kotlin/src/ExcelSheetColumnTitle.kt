/**
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 *
 * For example:
 *
 * 1 -> A
 * 2 -> B
 * 3 -> C
 * ...
 * 26 -> Z
 * 27 -> AA
 * 28 -> AB
 *
 * Accepted.
 */
class ExcelSheetColumnTitle {

    fun convertToTitle(n: Int): String {
        var newN = n
        val sb = StringBuilder()

        while (newN != 0) {
            newN -= if (newN % 26 == 0) {
                sb.append('Z')
                26
            } else {
                sb.append((newN % 26 - 1 + 'A'.toInt()).toChar().toString())
                newN % 26
            }
            newN /= 26
        }

        return sb.reverse().toString()
    }

}

from unittest import TestCase

from ExcelSheetColumnTitle import ExcelSheetColumnTitle


class TestExcelSheetColumnTitle(TestCase):
    def test_convertToTitle(self):
        e = ExcelSheetColumnTitle()
        
        self.assertEqual(e.convertToTitle(1), "A")

        self.assertEqual(e.convertToTitle(2), "B")

        self.assertEqual(e.convertToTitle(26), "Z")

        self.assertEqual(e.convertToTitle(27), "AA")

        self.assertEqual(e.convertToTitle(28), "AB")

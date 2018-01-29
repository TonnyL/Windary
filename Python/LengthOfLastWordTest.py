from unittest import TestCase

from LengthOfLastWord import LengthOfLastWord


class TestLengthOfLastWord(TestCase):
    def test_lengthOfLastWord(self):
        llw = LengthOfLastWord()
        
        self.assertTrue(llw.lengthOfLastWord("Hello World") == 5)
        
        self.assertTrue(llw.lengthOfLastWord(" ") == 0)
        
        self.assertTrue(llw.lengthOfLastWord("a") == 1)
        
        self.assertTrue(llw.lengthOfLastWord("a ") == 1)

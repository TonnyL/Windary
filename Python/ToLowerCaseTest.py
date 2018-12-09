from unittest import TestCase

from ToLowerCase import ToLowerCase


class ToLowerCaseTest(TestCase):
    def test_toLowerCase(self):
        tlc = ToLowerCase()

        self.assertEqual(tlc.toLowerCase("Hello"), "hello")
        self.assertEqual(tlc.toLowerCase("here"), "here")
        self.assertEqual(tlc.toLowerCase("LOVELY"), "lovely")

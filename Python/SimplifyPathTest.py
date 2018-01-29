from unittest import TestCase

from SimplifyPath import SimplifyPath


class TestSimplifyPath(TestCase):
    def test_simplifyPath(self):
        sp = SimplifyPath()

        self.assertEqual(sp.simplifyPath("/home/"), "/home")

        self.assertEqual(sp.simplifyPath("/a/./b/../../c/"), "/c")

        self.assertEqual(sp.simplifyPath("/../"), "/")

        self.assertEqual(sp.simplifyPath("/home/foo/"), "/home/foo")

        self.assertEqual(sp.simplifyPath("/a/b/c"), "/a/b/c")

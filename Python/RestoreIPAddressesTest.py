from unittest import TestCase

from RestoreIPAddresses import RestoreIPAddresses


class TestRestoreIPAddresses(TestCase):
    def test_restoreIpAddresses(self):
        r = RestoreIPAddresses()

        self.assertTrue(len(r.restoreIpAddresses("1")) == 0)

        self.assertTrue(len(r.restoreIpAddresses("111")) == 0)

        self.assertTrue(len(r.restoreIpAddresses("1111111111111")) == 0)

        self.assertEqual(r.restoreIpAddresses("1111"), ["1.1.1.1"])

        self.assertEqual(set(tuple(r.restoreIpAddresses("25525511135"))),
                         set(tuple(["255.255.11.135", "255.255.111.35"])))

# -*- coding: UTF-8 -*-
#
# Given an absolute path for a file (Unix-style), simplify it.
#
# For example,
# path = "/home/", => "/home"
# path = "/a/./b/../../c/", => "/c"
#
# Corner Cases:
# Did you consider the case where path = "/../"?
# In this case, you should return "/".
# Another corner case is the path might contain multiple slashes '/' together, such as "/home//foo/".
# In this case, you should ignore redundant slashes and return "/home/foo".
#
# Python, Python all accepted.


class SimplifyPath:
    def simplifyPath(self, path):
        """
        :type path: str
        :rtype: str
        """
        if len(path) == 0:
            return path

        strings = path.split("/")
        stack = Stack()
        for i in range(len(strings)):
            if strings[i] == '..':
                if not stack.isEmpty():
                    stack.pop()
            elif strings[i] != '.' and strings[i] != '':
                stack.push(strings[i])

        string = ""
        stack.items.reverse()
        for i in range(len(stack.items)):
            string += "/"
            string += stack.items[i]

        if len(string) == 0:
            return "/"

        return str(string)


class Stack:
    def __init__(self):
        self.items = []

    def isEmpty(self):
        return self.items == []

    def push(self, item):
        self.items.insert(0, item)

    def pop(self):
        return self.items.pop(0)

    def peek(self):
        return self.items[0]

    def size(self):
        return len(self.items)

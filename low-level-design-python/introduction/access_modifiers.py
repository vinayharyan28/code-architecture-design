"""
Python does not have traditional access modifiers like public, protected, and private as some other object-oriented
programming languages do (e.g., Java or C++). Instead, Python uses a different approach to control the visibility and accessibility of class members:

Public: In Python, all members (attributes and methods) of a class are considered public by default.
They can be accessed from outside the class without any restrictions.

Protected: Python uses a naming convention to indicate "protected" members.
By convention, members with a name starting with a single underscore (e.g., _variable or _method()) are intended to be
treated as protected. However, this is just a convention, and it doesn't actually restrict access in any way. It's up
to the programmer to respect this convention.

Private: Python uses a naming convention to indicate "private" members.
Members with a name starting with double underscores (e.g., __variable or __method()) are intended to be treated as
private. Again, this is just a convention, and it doesn't provide true access control. In fact, Python performs name
mangling, changing the name of private members in a way that makes it difficult to access them from outside the class.

It's important to note that the access control in Python relies heavily on programmer discipline and conventions rather
than strict language-enforced access modifiers. Python follows the principle of "we are all consenting adults here,"
which means it trusts the programmer to follow conventions and guidelines for accessing and modifying class members.

Here's an example demonstrating access control conventions in Python:
"""


class MyClass:
    def __init__(self):
        self.public_var = 42
        self._protected_var = "I'm protected"
        self.__private_var = "I'm private"

    @staticmethod
    def public_method():
        print("This is a public method")

    @staticmethod
    def _protected_method():
        print("This is a protected method")

    @staticmethod
    def __private_method(self):
        print("This is a private method")


# Accessing members from outside the class
obj = MyClass()

print(obj.public_var)  # Accessing a public variable
print(obj._protected_var)  # Accessing a "protected" variable (convention only)
# Attempting to access a private variable directly raises an AttributeError
# print(obj.__private_var)

obj.public_method()  # Calling a public method
obj._protected_method()  # Calling a "protected" method (convention only)
# Attempting to call a private method directly raises an AttributeError
# obj.__private_method()
# print(obj._MyClass__private_var)  # access private
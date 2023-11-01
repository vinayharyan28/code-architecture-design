"""Python supports multiple inheritance, which means a class in Python can inherit attributes and methods from more
than one base class. This is in contrast to some languages like Java, which support single inheritance (i.e.,
a class can inherit from only one superclass). There are a few reasons why Python supports multiple inheritance:

1. Flexibility: Multiple inheritance provides greater flexibility in designing class hierarchies. It allows you to
combine features from multiple sources and create classes that inherit behavior and attributes from different
classes. This can be very useful when designing complex systems.

2. Code Reuse: Multiple inheritance promotes code reuse. You can create classes that inherit common functionality
from various base classes, reducing the need for redundant code. This can lead to more efficient and maintainable code.

3. Mixing Behaviors: Multiple inheritance allows you to mix behaviors and characteristics from different classes to
create new classes with unique combinations of features. This can be particularly valuable in certain domains,
such as GUI frameworks, where you might want to inherit behavior from different types of widgets.

4. Interface and Abstract Classes: Python's support for multiple inheritance is often used for implementing
interface-like behavior. By inheriting from multiple classes with abstract methods, you can create classes that
provide specific implementations for those methods.

5. Dynamic Typing: Python is dynamically typed, which means you can change the type and behavior of objects during
runtime. Multiple inheritance aligns well with this dynamic nature, allowing objects to adapt to new roles and
behaviors more easily.

However, multiple inheritance can also lead to some challenges and complexities, such as the diamond problem (which
Python mitigates through a method resolution order algorithm known as C3 Linearization ) and the need for careful
design to avoid ambiguity and conflicts in the class hierarchy. Python's use of Method Resolution Order (MRO) helps
determine the order in which base classes are considered when resolving method and attribute names, which helps
address these issues.

In summary, Python supports multiple inheritance to provide flexibility, code reuse, and the ability to mix behaviors
from multiple sources. It is a powerful feature, but it also comes with the responsibility of careful class design to
avoid potential conflicts and ensure that the class hierarchy remains manageable and understandable."""


class Parent1:
    @staticmethod
    def method1():
        print("Method from parent1")


class Parent2:
    @staticmethod
    def method1():
        print("Method from parent2")


class Child(Parent1, Parent2):
    def method2(self):
        super().method1()
        print("Method from child")


if __name__ == '__main__':
    child = Child()
    child.method2()

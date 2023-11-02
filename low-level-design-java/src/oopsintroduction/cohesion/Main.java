package oopsintroduction.cohesion;
/**cohesion refers to the degree to which the responsibilities of a module or a class are related and
 focused on a single task or purpose. High cohesion is generally considered a good design principle in
 software development because it leads to more maintainable and understandable code.
 It means that a class or module should have a well-defined and narrow purpose, and its methods and fields
 should be closely related to that purpose.

 There are different types or levels of cohesion, which can help us understand how well a class or
 module adheres to the principle of high cohesion:

 1. Functional Cohesion: A module exhibits functional cohesion when all of its elements (methods or functions)
 are related to performing a single, well-defined task. This is the highest level of cohesion, and it is the most desirable.

 2. Sequential Cohesion: Sequential cohesion occurs when the elements of a module are related to each other because they are executed in a specific order,
 but their purposes may not be tightly related. This is less desirable than functional cohesion.

 3. Communication Cohesion: Communication cohesion involves elements that work on the same set of data,
 but they may perform different, unrelated operations on that data.
 This is better than sequential cohesion but not as good as functional cohesion.

 4. Procedural Cohesion: Procedural cohesion implies that elements of a module are grouped together because
 they are called at the same time, but their purposes are not closely related.
 This is weaker cohesion and should be avoided in most cases.

 5. Temporal Cohesion: Temporal cohesion occurs when elements of a module are related because they are
 executed at the same time, such as during the same method call, but their purposes are not related.
 This is the weakest form of cohesion and should be avoided whenever possible.

 When designing Java classes, it's essential to aim for high functional cohesion,
 where the class methods and fields are all closely related to a specific purpose or functionality.
 This helps make the code more maintainable, easier to understand, and less prone to bugs, as well as facilitating code reuse.

 Conversely, low cohesion can lead to classes that are difficult to maintain and understand,
 as they tend to have a mix of unrelated responsibilities,
 making the codebase more error-prone and less extensible.
 Therefore, it's a good practice to continually review and refactor code to improve cohesion
 and ensure that classes and modules have a clear and focused purpose.*/

public class Main {
}

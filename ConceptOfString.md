String is one of Data types, in java like other dataTypes string do not stores value in Stack memory, it takes address location of Heap Memory.
Generally, String is a sequence of characters. But in Java, string is an object that represents a sequence of characters. The java.lang.String class is used to create a string object.

Each time you define a string variable, the JVM checks the "string constant pool" or a heap memory first. If the string already exists in the pool or memory, address memory location is returned. If the string doesn't exist in the pool, a new string memory loaction or instance is created and placed in the pool. For example1:

string s1 = "Hello";
string s2 = "Hello";

In the above example, only one object will be created. Firstly, JVM will not find any string object with the value "Hello" in string constant pool that is why it will create a new object. After that it will find the string with the value "Hello" in the pool, it will not create a new object but will return the same memory location of heap memory or instance.

but if:
Example2:
string s1 = new string("Hello");
string s2 = new string("Hello");

for example 2 , two instance will be created in constant pool, because we are creating two object in heap memory to store s1 and s2 string variable.
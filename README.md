# Arrays and Array Lists in Java

Arrays and array lists in Java both store a collection of elements of the same data type. Array lists offer more flexibility when compared to a normal array. They are usually the better option unless you know the size of your array won't be changing, or you are concerned with efficiency. Arrays and array lists differ in many aspects, the largest difference between the two is that arrays have a fixed size that you are unable to change. This differs from array lists that can grow and shrink in size. This difference is helpful when you don't know what the size of your array will be or when you know you'll be adding and removing elements. 

Array lists also provide many methods for performing common tasks. These methods include being able to add an element to the array, remove an element from the array, create a sublist from the array, and checking if the array contains a given element. Another big difference between arrays and array lists is the syntax used to create the array, get the length of the array, and access elements in the array. To access an element in an array, you use brackets like `array[1]`, however, with an array list you access elements using the `get()` method like this `arrayList.get(1)`. With an array you can use an initializer list to create the array as follows `int[] array = {1, 2, 3}`. With an array list you must instantiate a new array list, and you are unable to use primitive data types, you must use the primitive data types wrapper class as shown in the below example. Since you are unable to use an initializer list you use the `add()` method as well.
```Java
ArrayList<Integer> arrayList = new ArrayList<>();
arrayList.add(1);
arrayList.add(2);
arrayList.add(3);
```
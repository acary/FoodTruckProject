# Food Truck Project

### Description

Users will input and rate a list of food trucks, then view the average rating and the highest-rated truck.

Maximum input is 5 food trucks, along with their food type and the rating. If the user inputs "quit" for the food truck name (or inputs 5 total), the program advances to the secondary menu.

The secondary menu consists of:
```
1: Display all food trucks
2: Display average rating
3: Display winning food truck
Q: Quit
```

### Lessons Learned

- When using IDE features to create new methods, it defaults to `public static` methods. I reverted to include logic code within the `switch` cases rather than using method calls to fulfill the requirement of only one `static` method (`main`).
- Using an infinite loop `for(;;)` helped me loop through the user input section of the `do-while` loop.
- Consuming an extra new line character with `sc.nextLine()` after catching invalid input from `sc.nextDouble()` prevented the next scanner call from advancing without appropriate user input.
- Getters and setters provide access to class instance variables while keeping them private.
- As a security precaution, the `getTrucks()` method provides a copy of the `FoodTruck[]` array versus sending the static member, in order to display the food trucks.

### Technologies Used

- JavaSE-1.8
- Eclipse IDE

### Author

- Andy Cary (@acary)

# Bus

In [bus.txt](bus.txt) file there are information about buses. The format is: ```<name>;<number of seats> <number of standing places>```

Create the following function:
* read_file: Reads the file and stores the buses in an array of bus struct.

The bus struct should store:
* the name of the bus
* the number of seats
* the number of standing places
* and the current number of passengers

You need to implement the following function:
* get_on: Get on a bus. The bus and the number of new passengers should be passed as a parameter.

The rule of getting on the bus:

First the passengers fill up all the seats, and then the standing places when they get on the bus.
Each time the function is called, it should print out the current number of remaining sitting/standing places and the number of passengers on the bus.

EXAMPLE:
 An Ikarus 280 has 147 standing places and 36 seats this means it can carry 183 person.
 - We start with an empty bus. First there are 50 new passengers. So after the get on
   function called it should inform us:
   We have 50 passengers. There is 0 empty seats and 133 standing places left.
 - Then we call the get off function with 20 passengers. This time it should print out something like this:
   We have 30 passengers. There is 0 seats left and 153 standing places.
 - If too much passengers wants to get in, our function simply should inform us, that this is too much for this
   bus and pass without any further action.

Write this function for extra point:
   
* add_bus: gets the new bus as parameter. Adds the bus to the end of the bus array. This bus can be created in main it does not have to be read from file.
 
   
***Call these functions in main to test your solution. Don't forget to deallocate memory that we don't need anymore.***



# trappingwater
git clone

https://github.com/sathyawill/trappingwater.git

#To clean install and run test cases
mvn clean install

#Following was done as part of the logic

Here is my understanding of the problem, for each element i need to find how much unit of water it can trap after rain.
For that i need to find if current element has a left which is smaller that right or vice versa.
If any of the condition is met, then i have to deduct the value of current element from the minimum of maximum and then deduct it from the maximum.

Eg. 1,0,2

Minimum of maximum of bars of element at 1(value zero) = 1
Deduct the current element from the left and right side values = 2 -1-0 -> 1, this need to be done for every element and sum the values


# MakeChangeProject

# Description 
This java based project performs calculations to determine the amount of change to return a customer after they make a purchase using currencies of twenty dollars and lower. The program begins by reading two user inputs utilizing a scanner. These inputs are the price of the item and the amount of money provided by the customer. Next, it checks two conditions using if/if else statements. The first condition is checked to ensure that the amount provided by the customer is sufficient to cover the cost of the item. The second is to determine if change is required in the event the customer paid the exact cost of the item. These conditional statements are housed within the method lessandEqual(). 

If these conditions are not met the program moves on to determine the change that needs to be provided. This begins with an overarching if statement containing the relational expression of item price less than customer tendered amount. Once this expression is determined to be true, the item price is subtracted from the amount tendered by the customer determining the amount of change to be provided in decimal number format as a double-type variable. This variable, change, is then cast to become an integer type variable, dollars, so the amount can be truncated into a whole number. Then, this dollars variable is divided by 20 to determine the amount of twenty dollar bills to be returned to the customer and is stored in the variable twenties. Using an if/if else statement, if the divided amount equates to less than or equal to zero the program prints nothing to the console. If the divided number equates to one, the program prints 1, being the amount initilized to the variable, plus the String "twenty dollar bill.” Finally, if any other instance occurs that amount is initialized to the twenties variable and printed with the String twenty dollar bills. These if/ if else statements are housed in the method twentiesOptions. To determine the amount of ten dollar bills to be returned to the customer the variable dollars is modulated by twenty and then divided by ten and stored in the variable tens. Which is run through the same if/ if else statements as previously done with the twenties variable. This process is also done with the variables fives and ones to determine the number of fives and ones to be returned to the customer. 

Next, the variable dollars is subtracted from the variable change and stored in the variable cents. This is done to remove the amount of full dollar bills from the change amount leaving only the cents remaining. To determine the number of quarters to return to the customer, the variable cents is divided by .25 and stored in the variable dot25. Then the variable dot 25 is cast to become an integer so the variable can be truncated into a whole number of quarters to return to the customer. Using the same sequence of if / if else statements from the dollar bills section, the amount is determined and printed to the console with the appropriate String. These if/ if else statements are stored in respective methods. To determine the number of dimes to return, the variable cents is modulated by .25 and then divided by .10 and is stored in the variable dot10. Again, the variable is cast into an integer, and using the same if/ if else statements, is printed to the console. The same process is followed for nickels and pennies except for the pennies double variable dot1 needs to have .005 added to it for rounding purposes. 

The entire main method is enclosed in a for loop for the ease of the user so that they do not need to re-run the program every time they want to use it. 

# Technologies Used

Java, Eclipse

# Lessons Learned

One lesson I learned was how to use arithmetic expressions like the modulator and division to my advantage to achieve the outcome desired for a program. 

Another lesson I learned was the situations in which casting is necessary, and truncation can be used to help you. 

A third lesson I learned was how to nest if / else if statements something I was previously confused about. 

Finally, I learned how to create and use methods properly. Something that will be very useful throughout my time as a programmer to achieve better readability and spacing throughout my code. 

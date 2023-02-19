# Birthdays

Program flow:
The program starts by asking the user for the current date (month and day). It then calculates the current day of the year using the dayCount method. After that, the program prompts the user for the birthdates of two persons, and calculates the day of the year for each birthdate using the dayCount method. It also calculates the number of days until the next birthday for each person using the daysTill method.

Finally, the program compares the two birthdays to determine which is sooner using the birthdayEval method. It then displays the results to the user.

Methods:
The program has three methods:

dayCount(int currMonth, int currDay)
This method takes in the current month and day as input and returns the absolute day of the year. It does this by adding the appropriate number of days for each month up to the current month.

daysTill(int today, int bDay)
This method takes in the absolute day of the year for the current date and the birthday as input and calculates the number of days until the next birthday.

birthdayEval(int b1, int b2)
This method takes in the absolute day of the year for each birthday as input and returns a string that indicates which birthday is sooner or if both birthdays are on the same day.

Fun fact:
The program also displays a fun fact about the creator of this repository. 

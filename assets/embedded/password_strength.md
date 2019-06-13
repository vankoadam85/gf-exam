# Password strength

Create a password strength checker application
 
There are 3 type of strength: WEAK, MODERATE, STRONG, ERROR

The conditions of a STRONG password:
* at least 10 characters long
* at least 4 digits
* at least 2 punctuation marks
   
The conditions of a MODERATE password:
* at least 6 characters
* at least 1 digit

The conditions of a WEAK password:
* at least 4 characters

**If the password is less than 4 characters or longer than 30 characters than it's cosidered an ERROR password**

Implement the following function:
- strength get_pwd_strength(char *password)


The program should read a text from console, call the get_pwd_strength function 
and print "Weak", "Moderate", "Strong", or "Error" depending on the return type



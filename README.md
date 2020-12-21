# Number Guesser
A number guessing game played by trying to guess the number between 1 and another value (default 100).

# Arguments
```
$ numberguesser %d
```
A custom upper limit can be set by providing a number as an argument.

```
$ numberguesser 21 
```
For example would set the range to 1 - 21.

# Usage
```
Enter a number between 1 and %d (inclusive)
: 
```
The user will be prompted to enter a number between 1 and another value (100 by default).
```
You need to guess higher
```
If the user guesses too low they'll be told to guess higher.
```
You need to guess lower
```
If the user guesses too high they'll be told to guess lower.
```
Correct the answer is: %d, you took %d attempt(s)
```
When the user guesses the correct answer they will be given a confirmation message and told the amount of guesses they made.

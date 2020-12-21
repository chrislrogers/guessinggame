#!/usr/bin/env python
import random
import sys

number=1
userInput=0
score=0

if (len(sys.argv)-1) == 0:
  number = 100
else: 
  number = int(sys.argv[1])

target = random.randint(1, number)

while userInput != target:
  print("Enter a number between 1 and %d (inclusive)" % (number))

  userInput = int(input(': '))

  score = score + 1

  if userInput < target:
    print('You need to guess higher')

  if userInput > target:
    print('You need to guess lower')

  if userInput == target:
    break

print("Correct the answer is: %d, you took %d attempt(s)" % (target,score))

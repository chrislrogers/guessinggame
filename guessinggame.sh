#!/bin/bash
# This is a game where you guess try to guess the number between 1 and another value (default 100).
# The user can change the higher number using the parameter $1 e.g. "./guessinggame.sh 20" will set the range to 1 through 20.

number=1
input=0
score=0

if [ "$1" ];
  then
    number=$1
  else
    number=100
fi

target=$(( $RANDOM % $number +1))

while (( input != target )); do
  echo "Enter a number between 1 and" $number "(inclusive)"
  ((score++))
  read -p ": " input
  if (( input < target )); then
    echo "You need to guess higher"
  elif (( input > target )); then
    echo "You need to guess lower"
  fi
done

echo "Correct the answer is:" $target", you took" $score "attempt(s)"

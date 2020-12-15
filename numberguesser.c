#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(int argc, char *argv[])
{
    int number=1;
    int input=0;
    int score=0;

    if(argc==1) 
    {
        number=100;
    }
    if(argc==2) 
    {
        number=atoi(argv[1]);
    }
    if(argc>=3) 
    {
        exit(1);
    }

    srand(time(0));
    int target = ((rand() % number ) + 1);

        do 
        {
            printf("Enter a number between 1 and %d (inclusive)\n: ", number);
            scanf("%d", &input);  
            score++;
            if (input < target)
            {
                printf("You need to guess higher\n");
            }
            else if (input > target)
            {
                printf("You need to guess lower\n");
            }
        } while (input != target);

    printf("Correct the answer is: %d, you took %d attempt(s)\n", target, score);

    return 0;
}

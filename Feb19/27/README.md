#### Problem

> Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
>
> For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
>
> Bonus: Can you do this in one pass?

Answered in ```java
            ```

#### Answer Summary

First I would sort the list [3, 7, 10, 15] and work from the outside in.

-> [3, 7, 10, 15] <- First we ask for 3 and 15 which equals 18 so now I know that 15 is not a viable answer

-> [3, 7, 10] <- Second we see that 3 and 10 does not equal 17 and since the list is sorted 3 can no longer be a viable answer

-> [7, 10] <- Now left with the numbers 7 and 10 we arrive at our answer (7, 10)

Test with a large data set

[1, 3, 4, 5, 9, 12, 13, 14, 20]

-> [1, 3, 4, 5, 9, 12, 13, 14, 20] <- 20 and 1 is too high therefore 20 is eliminated
-> [1, 3, 4, 5, 9, 12, 13, 14] <- 1 and 14 is too low therefore 1 is eliminated
-> [3, 4, 5, 9, 12, 13, 14] <- 3 and 14 is a match! (3, 4) is our answer!

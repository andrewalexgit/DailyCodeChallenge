## This problem is very dependent on the question!

#### Question

> This problem was asked by Facebook.
> Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.
> For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.
> You can assume that the messages are decodable. For example, '001' is not allowed.

#### Tip
> Trying to not look too hard into a problem is sometimes very useful, I spent the better part of an hour trying to figure out
> how to tackle this challenge with a HashMap data structure. The question however was asking for just the number of possible
> messages, NOT the messages themselves.

#### Answered in java
                 
Really simple stuff, first of all the problem automatically always have at least 1 answer because we assume the input is valid.
Second the most maximum value for a letter mapping is 26 therefore larger-than single digit numbers in the input must be n < 27.
Last, if we use rules of probability we can say that by adding all of the individual cases of pairs plus 1 for the assumed answer
in the beginning we will always reach our answer.

I'm fairly proud of this code because it is solved O(n)

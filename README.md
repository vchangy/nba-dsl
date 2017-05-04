# nba-dsl
An external scala dsl for NBA statistic queries, player comparisons, hypotheticals, and more

## Introduction
This DSL allows you to ask plain English questions about player statistics for a given amount of time, compare two player based on a statistic, or do an overall comparison of two players.

## Install
This project uses sbt to resolve dependencies on StandardTokenParser and Apache POI. To run a program, write your program into a text file, then run:
> ```sbt compile```

> ```sbt```

> ```run <your_prog_name.nba>```

## Example programs
In ```nba-dsl/src/test/resources/test_queries.nba``` you can see example queries you can run.
The query format is:
 1. who is better at \<statistic\>, \<player1\> or \<player2\>?
 2. how many \<statistic\> does \<player\> average per \<Integer\> <minutes/games/seasons>?
 3. who should win mvp, \<player1\> or \<player2\>?
 4. if \<statistic\> matter <more/less>, who should win mvp, \<player1\> or \<player2\>?

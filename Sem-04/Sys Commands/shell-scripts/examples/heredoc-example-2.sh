#!/bin/bash
a=2.5
b=3.2
c=4
d=$(
	bc -l <<- BLAH
		scale=5
		($a+$b)^$c
	BLAH
)
echo $d

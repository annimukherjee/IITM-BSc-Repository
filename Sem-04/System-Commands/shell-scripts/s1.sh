#!/bin/bash

#s1.sh is my first script
echo I am invoked as
echo $0
echo Number of Args Passed to the Script
echo $#

echo First arg passed
echo $1

echo Second arg passed
echo $2

if test $1 = $2;
then
	echo The two args are the same
fi

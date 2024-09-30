#!/bin/bash
cmd="date"
fmt="+%d-%B-%Y"
combined=`$cmd $fmt`
echo $combined
eval $cmd $fmt

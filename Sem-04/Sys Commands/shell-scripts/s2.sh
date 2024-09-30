# #!/bin/bash
# echo "use of for loop"
# for i in file_{1..9}
# do
# 	echo $i
# done

# #!/bin/bash
# echo "use of for loop"
# for i in file_{A..D}{1..9}
# do
# 	echo $i
# done


# #!/bin/bash
# echo "use of for loop"
# for i in $(ls /bin)
# do
# 	echo $i
# done

# #!/bin/bash
# echo "use of for loop"
# for i in $(ls /bin/z*)
# do
# 	echo $i
# done


#!/bin/bash
echo "use of for loop"
for i in $`ls /bin`
do
	echo $i
done

# Write a Python program to print the ISBN numbers of books which are published in a given year. Here, the year is obtained as the value of function L(x) (given after the sample output) at x. You have to read the value of x from the input file "number.txt", and use it to find the value of L(x). Your program must assume that the file number.txt resides in the same folder as your Python program

import psycopg2, sys, os

database = 'lis'	# name of the database is obtained from the command line argument
user = 'postgres'
password = 'psqldb'
host = '127.0.0.1'
port = '5433'

f = open('number.txt')
file=f.readlines()

# print(file)
conn=None

try:
    #connect to the postgresql database
    conn=psycopg2.connect(database=database,user=user,password=password,host=host,port=port)
    cur=conn.cursor() #create a new cursor
    years=[]

    for i in file:
        years.append(2000 + 5*(int(i)))

    for y in years:
        cur.execute(f'select ISBN_no from book_catalogue where year={y}')
        res = cur.fetchall()
        print(res[0])
        
        print("Record is updated")
    
    cur.close()#close the cursor
except(Exception,psycopg2.DatabaseError) as error:
    print(error)
finally:
    if conn is not None:
        conn.close()





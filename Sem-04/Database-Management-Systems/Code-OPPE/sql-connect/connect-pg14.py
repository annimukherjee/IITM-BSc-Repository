import psycopg2

conn = None
try:
    conn = psycopg2.connect(
        database="test-123",
        user="aniruddhamukherjee",
        password="",
        host="127.0.0.1",
        port="5433",
    )
    print("Database connected successfully")
    print(conn)
except (Exception, psycopg2.DatabaseError) as error:
    print(error)
finally:
    if conn is not None:
        conn.close()

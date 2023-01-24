import mysql.connector

my_con = mysql.connector.connect(
    host="192.168.1.166",
    user="root",
    passwd="Lux!fearzz47",
    database="TestDB"
)
print('connected!')
cursor = my_con.cursor()

# 1.3
print("\n\tprint table")
cursor.execute("SELECT * FROM characters INNER JOIN anime ON characters.animeFK=anime.id")
for i in cursor:
    print(i[0], i[1:], sep=", ")

my_con.commit()
cursor.close()
my_con.close()
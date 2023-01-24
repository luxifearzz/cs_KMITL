import mysql.connector

my_con = mysql.connector.connect(
    host="remotemysql.com",
    user="bPHiiRCWTe",
    passwd="Ftl2nnrmAp",
    database="bPHiiRCWTe"
)
print('connected!')
cursor = my_con.cursor()

# 1.3
print("\n\t1.3 find karakai-jouzu-no-takagi-san")
cursor.execute("SELECT * FROM characters INNER JOIN anime ON characters.animeFK=anime.id WHERE anime.title LIKE 'kara%'")
for i in cursor:
    print(i[0], i[1:], sep=", ")

# 1.4
print("\n\t1.4 insert characters and anime")
# cursor.execute("INSERT INTO anime VALUES ('17', 'Kimi-no-Na-wa', '12')")
# cursor.execute("INSERT INTO characters VALUES ('507740', 'Wachirawit', 'Lz', '1234', '17')")
# cursor.execute("INSERT INTO characters VALUES ('507741', 'Mitsuha', 'Miyamizu', '50', '17')")
# cursor.execute("INSERT INTO characters VALUES ('507742', 'Taki', 'Tachibana', '20', '17')")

# 1.5
print("\n\t1.5 select my anime")
cursor.execute("SELECT * FROM characters INNER JOIN anime ON characters.animeFK=anime.id and characters.id LIKE '50887_'")
for i in cursor:
    print(i[0], i[1], i[2], i[3], i[5], i[6], sep=", ")

my_con.commit()
cursor.close()
my_con.close()
import MySQLdb

def Connect():
db = MySQLdb.connect(host="localhost",    
                     user="root",         
                     passwd="",  
                     db="MelodyMakerDB")        �����������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������import MySQLdb

a=db.cursor()

sql='SELECT * from `tblcsv`;'
a.execute(sql)

countrow=a.execute(sql)
print("Number of rows: ",countrow)
data=a.fetchall()
print(data)

sql='SELECT * from `tblgenre`;'
a.execute(sql)

countrow=a.execute(sql)
print("Number of rows: ",countrow)
data=a.fetchall()
print(data)

sql='SELECT * from `tblmood`;'
a.execute(sql)

countrow=a.execute(sql)
print("Number of rows: ",countrow)
data=a.fetchall()
print(data)

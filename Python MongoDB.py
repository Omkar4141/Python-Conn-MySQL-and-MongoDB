# importing module
from pymongo import MongoClient

# creation of MongoClient
client=MongoClient()

# Connect with the portnumber and host
client = MongoClient("mongodb://localhost:27017/")

# Access database
mydatabase = client["ok1"]

# Access collection of the database
mycollection=mydatabase["ok1_co1"]

# dictionary to be added in the database
rec={
"title": 'MongoDB and Python',
"description": 'MongoDB is no SQL database'
}

# inserting the data in the database
rec = mydatabase.ok1_co1.insert_one(rec)

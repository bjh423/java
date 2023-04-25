db.getCollection("memo").find({})

////////////////////////
use shop2

db.createUser({
    user: "winner",
    pwd:  "1234",
    roles : ["readWrite", "dbAdmin"]})

// db create: use dbname
// collection create: use dbname
//    --> db.createCollection(collectionname)
//    --> or!! db.collectionname.insert({})
use shop3
db.createCollection('member')
db.getCollection("member").stats()
db.bbs.insert({'title' : 'win', 'content' : 'fun'})
db.getCollection("bbs").stats()

show databases

use shop3

db.member.insert({'id' : 'hong', 'pw' : '1234', 
                'name' : 'hong', 'tel' : '011'})
db.member.find()

db.member.insert({'id' : 'apple', 'pw' : '1234', 
                'name' : 'apple', 'tel' : '011'})
db.member.find()

//json array

db.member.insertMany([
    {'id':'apple', 'pw':'1234','name':'apple', 'tel':'011'},
    {'id':'apple2', 'pw':'1234','name':'apple2', 'tel':'011'}                  
    ])
    
db.member.find() 

/////////////////////////
use shop

db.dropDatabase()

show databases

use shop3

db.bbs.drop() //collection drop

show collections

/////////////////////////
for(i = 0; i < 10; i++){
    db.member.insert({'test' : i})}

db.member.find()
/////////////////////////



/////////////////////////
use shop3
cursor = db.member.find()
cursor
cursor.next()
cursor.next()

for(i = 0; i<cursor.count(); i++){
    cursor.next()}

//////////////////////////////
db.member.find({id : 'hong'})

db.member.find({name : 'hong', pw : '2222'}, {name : 1, pw : 1})
db.member.find({$and: [{name : 'hong'}, {pw : '2222'}]}, {name : 1, pw : 1})

db.member.find({pw : '2222'}) //condition, all column

db.member.find({})

db.member.find({$or: [{name : 'hong'}, {pw : '2222'}]})

db.member.find({}, {test:1}) //no condition, test column
db.member.find({}) //no condition, all column

db.member.find({test : {$gt : 3}})

db.member.find({$and : [{test : {$gt : 3}}, {test : {$lt : 8}}]})

db.member.find({}, {name:1})

//db.member.createIndex({name : 'text33', id: 'text33'})
//db.member.find({$text33 : {$search : 'hong'}})
//db.member.find({}, {'name': 1})

db.member.updateOne({tel : '011'}, {$set : {tel : '000'}})
db.member.find({}, {tel : 1})

db.member.updateMany({tel : '011'}, {$set : {tel : '000'}})
db.member.find({}, {tel : 1})



     








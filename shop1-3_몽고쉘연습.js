db.getCollection("member").find({})

use shop3

db.createCollection('member')

db.member.stats()

db.createCollection('bbs')

show collections

db.bbs.insert(
                {'title' : 'win','content' : 'fun'}
              )
db.bbs.insert(
                {'title' : 'win','content' : 'fun'}
              )
db.bbs.find()

db.bbs.drop()

show collections

db.dropDatabase()

show dbs

use shop

show collections

//document insert(json으로 만들어서 넣어주세요!)
db.member.insert(
                {'id' : "hong",'pw' : '1234','name' :  'hong','tel' : '011'})

db.member.find({})

//documents insertMany([json, json]으로 만들어서 넣어주세요!)
db.member.insertMany([
                {'id' : "apple",'pw' : '1234','name' :  'apple','tel' : '019'},
                {'id' : "park",'pw' : '1234','name' :  'park','tel' : '018'}
])

db.member.deleteOne({'content':'hahaha'})

db.member.find({'content':'hahaha'})

db.member.find().sort({'_id' : -1})

db.member.deleteMany({'name':'park'})

db.member.updateOne({'tel' : '011'}, {$set : {'tel' : '999'}})

db.member.find().sort({'_id' : -1})

//no가 117인 경우, content를 ara로 변경해보세요.!
//                 ({조건}, {$set : {변경한 값}})
db.member.updateOne({'no':'117'}, {$set : {'content':'ara'}})
db.member.updateMany({'pw' :'1234'}, {$set : {'tel' : '888'}})















var events = require('events');
var util = require('util');
var Person = function(name){
    this.name = name;
}
util.inherits(Person, events.EventEmitter);

var suraj = new Person('suraj');
var sangamesh = new Person('sangamesh');
var yash = new Person('yash');
var people = [suraj, sangamesh, yash];

people.forEach(function(person){
    person.on('speak', function(msg){
        console.log(person.name + ' said: ' + msg);
    });
});

suraj.emit('speak', 'hey dudes');
sangamesh.emit('speak', 'i want food');



// var stuff = require('./stuff');
// console.log(stuff.counter(['suraj', 'sangamesh', 'yash']));
// console.log(stuff.adder(98,-99));
// console.log(stuff.adder(stuff.pi, 5));



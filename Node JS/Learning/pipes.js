var http = require('http');
var fs = require('fs');

////normal pipe

// var myReadStream = fs.createReadStream(__dirname + '/junk-readMe.txt', 'utf8');
// var myWriteStream = fs.createWriteStream(__dirname + '/junk-writeMe.txt');
// myReadStream.pipe(myWriteStream);

var server = http.createServer(function(req, res){
    res.writeHead(200, {'Content-Type': 'text/plain'});
    var myReadStream = fs.createReadStream(__dirname + '/junk-readMe.txt', 'utf8');
    myReadStream.pipe(res);
});
server.listen(3000, '127.0.0.1');
console.log('Listening to port 3000');



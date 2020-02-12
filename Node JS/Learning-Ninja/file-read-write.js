var fs = require('fs');

// async method
fs.readFile('readMe.txt', 'utf8', function(err, data){
    fs.writeFile('writeMe.txt', data, (err)=>{});
});

// //sync method
// var readMe = fs.readFileSync('readMe.txt', 'utf8');
// console.log(readMe);
// fs.writeFileSync('writeMe.txt', readMe);


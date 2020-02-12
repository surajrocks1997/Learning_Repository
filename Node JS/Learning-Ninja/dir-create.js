var fs = require('fs');

//async method
fs.mkdir('stuff', function(){
    fs.readFile('readMe.txt', function(err, data){
        fs.writeFile('./stuff/writeMe.txt', data, function(err){
            if (err) {
                throw err;
            }
            else{
                console.log('file written inside stuff folder');
            }
        });
    });
});

// //sync method
// fs.mkdirSync('stuff');
// fs.rmdir('stuff', function(err){
//     if (err) {
//         throw err;
//     }
//     else{
//         console.log('dir deleted');
//     }
// });


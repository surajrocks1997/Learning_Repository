var fs = require('fs');

//async
fs.unlink('./stuff/writeMe.txt', function(err){
    if (err) {
        throw err;
    }
    else{
        fs.rmdir('stuff', function(err){
            if (err) {
                throw err;
            }
        });
    }
})



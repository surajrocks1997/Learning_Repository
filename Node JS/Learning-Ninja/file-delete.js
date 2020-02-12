var fs = require('fs');

//to delete a file
fs.unlink('writeMe.txt', function(err){
    if (err) {
        throw err;
    }
    else{
        console.log("File deleted");
    }
});


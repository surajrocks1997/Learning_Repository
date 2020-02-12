var express = require('express');
var bodyParser = require('body-parser');
var urlencodedParser = bodyParser.urlencoded({ extended: false });
var app = express();

app.set('view engine', 'ejs');
app.use('/assets', express.static('assets'));
app.listen(3000);

app.get('/', function(req, res){
    res.render('index');
})
app.get('/contact', function(req, res){
    res.render('contact', {qs: req.query});
})
app.post('/contact', urlencodedParser, function(req, res){
    console.log(req.body);
    res.render('contact-success', {data: req.body});
})

app.get('/profile/:id', function(req, res){
    var data = {
        age: '22', job: 'ninja', hobbies: ['singing','coding','guitar']
    };
    res.render('profile', {person: req.params.id, data: data});
})

 





const logger = require('./logger');
const authenticator = require('./authenticator');

const express = require('express');
const {check, validationResult} = require('express-validator');
const app = express();

app.use(express.json());
app.use(express.urlencoded({extended: true}));
app.use(express.static('public'));

// app.use(logger);
// app.use(authenticator);

const courses = [
    { id: 1, name: 'course1'},
    { id: 2, name: 'course2'},
    { id: 3, name: 'course3'},
    { id: 4, name: 'course4'}
]

app.get('/', (req, res) => {
    res.send('Hello world!!');
});

app.get('/api/courses', (req, res) => {
    res.send(courses);
});

app.get('/api/courses/:id', (req, res) => {
    const course = courses.find(c => c.id === parseInt(req.params.id));
    if(!course){
        return res.status(404).send('Course with given id not found');
    }
    res.send(course);
});

app.post('/api/courses', [check('name').isLength({min: 3}).not().isEmpty()], (req, res) => {
    const errors = validationResult(req);
    if(!errors.isEmpty()) return res.status(422).jsonp(errors.array());
    
    const course = {
        id: courses.length + 1, 
        name: req.body.name
    };
    courses.push(course);
    res.send(course);
    
});

app.put('/api/courses/:id', [check('name').isLength({min: 3}).not().isEmpty()], (req, res) => {
    const course = courses.find(c => c.id === parseInt(req.params.id));
    
    if(!course){
        return res.status(404).send('Course with given id not found');
    }

    const errors = validationResult(req);
    if(!errors.isEmpty()) return res.status(422).jsonp(errors.array());
    
    course.name = req.body.name;
    res.send(course);

});

app.delete('/api/courses/:id', (req, res) => {
    const course = courses.find(c => c.id === parseInt(req.params.id));
    
    if(!course){
        return res.status(404).send('Course with given id not found');
    };
    const index = courses.indexOf(course);
    courses.splice(index, 1);

    res.send(course);

});

const port = process.env.PORT || 3000;
app.listen(port, () => console.log(`Listening to port ${port}`));


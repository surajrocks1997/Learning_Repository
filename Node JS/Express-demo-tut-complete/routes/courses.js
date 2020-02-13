const express = require('express');
const {check, validationResult} = require('express-validator');

const router = express.Router();

const courses = [
    { id: 1, name: 'course1'},
    { id: 2, name: 'course2'},
    { id: 3, name: 'course3'},
    { id: 4, name: 'course4'}
];

router.get('/', (req, res) => {
    res.send(courses);
});

router.get('/:id', (req, res) => {
    const course = courses.find(c => c.id === parseInt(req.params.id));
    if(!course){
        return res.status(404).send('Course with given id not found');
    }
    res.send(course);
});

router.post('/', [check('name').isLength({min: 3}).not().isEmpty()], (req, res) => {
    const errors = validationResult(req);
    if(!errors.isEmpty()) return res.status(422).jsonp(errors.array());
    
    const course = {
        id: courses.length + 1, 
        name: req.body.name
    };
    courses.push(course);
    res.send(course);
    
});

router.put('/:id', [check('name').isLength({min: 3}).not().isEmpty()], (req, res) => {
    const course = courses.find(c => c.id === parseInt(req.params.id));
    
    if(!course){
        return res.status(404).send('Course with given id not found');
    }

    const errors = validationResult(req);
    if(!errors.isEmpty()) return res.status(422).jsonp(errors.array());
    
    course.name = req.body.name;
    res.send(course);

});

router.delete('/:id', (req, res) => {
    const course = courses.find(c => c.id === parseInt(req.params.id));
    
    if(!course){
        return res.status(404).send('Course with given id not found');
    };
    const index = courses.indexOf(course);
    courses.splice(index, 1);

    res.send(course);

});

module.exports = router;
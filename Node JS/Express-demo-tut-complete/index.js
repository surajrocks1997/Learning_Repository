const config = require('config');
const express = require('express');
const {check, validationResult} = require('express-validator');

const home = require('./routes/home');
const courses = require('./routes/courses');
const logger = require('./middleware/logger');
const authenticator = require('./middleware/authenticator');


const app = express();

app.set('view engine', 'pug');
app.set('views', './views');

app.use(express.json()); 
app.use(express.urlencoded({extended: true}));
app.use(express.static('public'));
app.use('/', home);
app.use('/api/courses', courses);

app.use(logger);
app.use(authenticator);

const port = process.env.PORT || 3000;
app.listen(port, () => console.log(`Listening to port ${port}`));


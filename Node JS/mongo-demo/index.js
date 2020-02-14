const mongoose = require('mongoose');

mongoose.connect('mongodb://localhost/playground', 
{ 
    useNewUrlParser: true, 
    useUnifiedTopology: true    
})
.then(() => console.log('Connected to MongoDB'))
.catch(err => console.log('Could not connect', err));  

const courseSchema = new mongoose.Schema({
    name: {
        type: String, 
        required: true,
        minlength: 5,
        maxlength: 255,
    },
    category: {
        type: String,
        required: true,
        enum: ['web', 'mobile', 'network'],
        lowercase: true,
        // uppercase: true,
        trim: true
    },
    author: String,
    tags: {
        type: Array,
        validate: {
            isAsync: true,
            validator: function(v, callback)
            {
                setTimeout(() => {
                    const result = v && v.length > 0;
                    callback(result);
                }, 2000);
            },
            message: 'A Course should have atleast one tag'
        }
    },
    date: {type: Date, default: Date.now},
    isPublished: Boolean,
    price: {
        type: Number,
        min: 5,
        max: 200,
        required: function() {return this.isPublished;},
        get: v => Math.round(v),
        set: v => Math.round(v)
    }
});

const Course = mongoose.model('Course', courseSchema);

async function createCourse(){
    const course = new Course({
        name: 'Universal course',
        // category: 'web',
        author: 'Suraj',
        tags: ['universe', 'galaxy'],
        isPublished: true,
        price: 22
    });
    
    try{
        const result = await course.save();
        console.log(result);
    }
    catch(ex) {
        for(err in ex.errors){
            console.log(ex.errors[err].message);
        }
    }
};

createCourse();

async function getCourses() {
    const course = await Course.find();
    console.log(course);
};

// getCourses();

//query first method
async function updateCourse(id){
    const course = await Course.findById(id);
    if(!course) return;
    course.set({
        isPublished: true,
        author: 'another author',
        price: 15
    });
    const result = await course.save();
    console.log(result);
};

// updateCourse('5e4639f93508df24747c172a');

//update first method
async function updateCourse1(id){
    const result =  await Course.update({_id: id}, {
        $set: {
            author: 'Suraj',
            isPublished: false
        }
    });
    console.log(result);
};
// updateCourse1('5e455b2e3e15c348ac839073');

async function removeCourse(id) {
    const result = await Course.deleteOne({_id: id})
    console.log(result);
}
// removeCourse('5e455b2e3e15c348ac839073');


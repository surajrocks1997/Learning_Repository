fetch('todos/a.json').then((response) => {
    console.log('response: ', response);
    return response.json();
}).then(data => {
    console.log(data);
}).catch((err) => {
    console.log('rejected', err);
});



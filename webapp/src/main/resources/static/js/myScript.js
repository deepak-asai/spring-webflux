var evtSource = new EventSource("http://localhost:8080/student/streamData", {
    headers: {
        'Access-Control-Allow-Origin': 'localhost:8081'
    }
});

/*var evtSource = new EventSource("http://localhost:8080/student/1/events", {
    headers: {
        'Access-Control-Allow-Origin': 'localhost:8081'
    }
});*/

evtSource.onmessage = function (event) {
    var data = JSON.parse(event.data);
    console.log(data);
    
}
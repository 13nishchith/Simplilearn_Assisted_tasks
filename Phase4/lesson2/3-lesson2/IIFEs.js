// IIFEs and closures
const empid = (function() {
    let count = 0;
    return function() {
        ++count;
        return 'emp${count}';
    };
})();

console.log("new employee IDs are listed here");
console.log("alex: " + empid());
console.log("Dexter: " + empid());
console.log("Annie: " + empid());

// call back
console.log("\n");

function fullname(firstname, lastname, callback) {
    console.log("My name is" + firstname + " " + lastname);
    callback(firstname);
    callback(lastname);

}
var greeting = function(ln) {
    console.log('welcome ' + ln);
};

fullname("Alex", "wilson", greeting);
console.log("\n")
fullname("dexter", "johnson", greeting);

console.log("\n")
fullname("Annnie", "Butler", greeting);
// functions
var x = (2 * 3) + 5;
console.log(x)
var y = 3 * 5;
console.log(y);

var result = myFunction(2, 3);
console.log(result);

function myFunction(num1, num2) {
    var a = num1 * num2;
    var b = num1 * num2;
    return (a + b);

}

console.log(myFunction(3, 4));

function toCelcius(f) {
    return (5 / 9) * (f - 32);

}
console.log("TThe temperature is" + toCelcius(10));

function add(a, b) {
    return (a + b);
};
console.log("Addition is: " + add(2, 3));

function sub(a, b, c) {
    return (a + b + c);
};

console.log('sub:' + sub('a', 'b', 'c'));
// function constructor
function Employee(name, designation, yearofbirth) {
    this.name = name;
    this.designation = designation;
    this.yearofbirth;
}

Employee.prototype.calculateAge = function() {
    console.log('the current age is:' + (2019 - this.yearofbirth));
}
console.log(Employee.prototype);

// function constructors
function Person(firstname, lastname) {
    // console.log(this);
    this.firstname = firstname;
    this.lastname = lastname;

}

var john = new Person('john', 'deo');
// console.log(john);

Person.prototype.getFullName = function() {
    return this.firstname + ' ' + this.lastname;
};

console.log(john.getFullName());

// creating objects
var person = {
    firstname: 'default',
    lastname: 'default',
    greet: function() {
        return 'hello ' + this.firstname + this.lastname;
    },
};

var john = Object.create(person);
console.log(john.greet());
john.firstname = 'jerry';
john.lastname = " cherry";
console.log(john.greet());
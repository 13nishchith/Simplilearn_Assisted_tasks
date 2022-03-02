// maps and classes
var map1 = new Map();
map1.set("firstname", "Roob");
map1.set("lastname", "stark");
map1.set("friend1", "Bran").set("friend2", "Arya");
console.log(map1);
console.log("map1 has friens 3?" + map1.has("friend3"));
console.log("get value for key=friend3-" + map1.get("friend3"));

console.log("get value for key=friend3-" + map1.get("friend2"));

console.log("delete element with key =frend3-" + map1.delete("friend3"));
console.log("delete element with key =frend2-" + map1.delete("friend2"));

map1.clear();
console.log(map1);
map1.set("friend1", "Bran").set("friend2", "Arya");

console.log(map1);

class employee {
    constructor(id, name) {
        this.id = id;
        this.name = name;
    }
    detail() {
        document.writeln(this.id + " " + this.name + "<br>")
    }
}
// passing object to a variable
var e1 = new employee(101, "moana");
var e2 = new employee(102, "babu");
e2.detail();
e1.detail();
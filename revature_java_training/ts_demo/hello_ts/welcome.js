"use strict";
exports.__esModule = true;
exports.name = "Typescript";
console.log("Hello " + exports.name);
var Car = /** @class */ (function () {
    function Car(id, name) {
        this.id = id;
        this.name = name;
    }
    Car.prototype.printCar = function () {
        console.log("id " + this.id);
        console.log("name " + this.name);
    };
    return Car;
}());
var car = new Car(101, "benz");
car.printCar();

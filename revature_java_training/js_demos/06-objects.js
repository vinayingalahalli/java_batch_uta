// @author Blake Kruppa
let personLiteral = {
  name: 'James',
  hairColor: 'purple',
  numberFingers: 3.5
}
console.log(personLiteral);
console.log(`
to access objects you can use . or bracket notation
you should use . notation unless you have a good reason not to
name = ${personLiteral.name}
name = ${personLiteral['name']}`);

personLiteral.numberToes = 84;
console.log(personLiteral);

function Person(name, hairColor, numberFingers) {
  this.name = name;
  this.hairColor = hairColor;
  this.numberFingers = numberFingers;
  this.sayHello = function() {
    console.log(`hello from ${this.name}`);
  }
}

let adrian = new Person('Adrian', 'Blonde', 10);
console.log(adrian);
adrian.sayHello();

// classes were introduced in es6
class PersonClass {
  constructor(name, hairColor) {
    this.name = name;
    this.hairColor = hairColor;
  }

  sayHello() {
    console.log(`Hello from ${this.name}`);
  }
}

let anayan = new PersonClass('Anayan', 'Orange');
console.log(anayan);

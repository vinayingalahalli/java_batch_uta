// @author Blake Kruppa
let obj1 = { a: 5, b: 10, c:'hello'};
let obj2 = { a: 2, d: 'sure'};
obj2.__proto__ = obj1;
console.log(obj2.a);
console.log(obj2.d);
console.log(obj2);
console.log(obj2.c);
let obj3 = {}; // empty object
obj3.__proto__.wat = 'wat'; // wat is assigned to the object object
console.log(obj2.wat);
let a = 5;
a.test = 'test'; // this doesn't seem to work
console.log(a);
console.log(a.test);
console.log(a.wat);

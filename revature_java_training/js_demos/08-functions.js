// @author Blake Kruppa
function add (a = 0, b = 0) { // can give params default values
  return a + b;
}

console.log(add(10, 20));
console.log(add(5)); // can call any function with any number of paramaters
console.log(add(20,30,1,5,8));

let otherAdd = (one, two) => {
  return one + two;
}

console.log(otherAdd(1,2));

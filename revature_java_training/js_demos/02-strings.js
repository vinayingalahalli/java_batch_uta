// @author Blake Kruppa
let a = 'hello';
let b = "world";

// introduced in 2015 with the ES 6 standard
let templateLiteral = `you can use bactick
to create mulitline strings
and also allow for string interpolation
a = ${a}
b = ${b}
5 + 5 = ${5 + 5}`;
console.log(templateLiteral);

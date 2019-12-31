// @author Blake Kruppa
let a = {
  f1: 5,
  f2: 2,
  f3: 'test',
  f4: true,
  f5: [
    1, 3, 10, 2, 1
  ]
}

let b = {
  ... a,
  f2: 1000,
  f5: [...a.f5, 6]
}

console.log(b);

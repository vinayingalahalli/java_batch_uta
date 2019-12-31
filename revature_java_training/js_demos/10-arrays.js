// @author Blake Kruppa
let arr = [5,100,2,89,3,55, 4,3, 22];
let filtered = arr.filter((each) => {
  if (each != 3) {
    return false;
  } else {
    return true;
  }
});
console.log(arr);
console.log(filtered);

arr.forEach((ele) => {
  console.log(ele);
});

console.log(arr.some(ele => ele === 3));

console.log(arr.map(ele => {
  return {value: ele};
}))

console.log(arr.reduce((acc, cur) => {
  return acc * cur;
}, 100))

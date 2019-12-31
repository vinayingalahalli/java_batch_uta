// @author Blake Kruppa
// You can use any value in a boolean context and it will be assigned a
// truthy or falsy value
function checkTruthy(input) {
  console.log(`
input = ${input}, and is typeof: ${typeof(input)}
and input is ${!!input}`)
}
checkTruthy(true);
checkTruthy(1);
checkTruthy(-1);
checkTruthy(0);
checkTruthy(NaN);
checkTruthy(null);
checkTruthy(undefined);
checkTruthy({});
checkTruthy([]);
checkTruthy('')
checkTruthy('hello');
checkTruthy('false');
checkTruthy(Infinity);
checkTruthy(checkTruthy);
let a = checkTruthy;
a(3);

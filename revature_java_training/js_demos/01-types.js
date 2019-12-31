// @author Blake Kruppa
// JavaScript does have types but the variables are loosely typed
function logType (input) {
  console.log('input is: ' + input + ' \n\tand is type of: ' + typeof(input));
};

let a = "hello"; // can use ' or " for strings
logType(a);
logType(5);
logType(5.5);
logType(true);
logType([1,2,3,]);
logType({});
logType(logType);
logType(null); // null is something we have to assign meaning no value
logType(undefined); // undefined means the variable has literally never been assigned a value
let f; // will be undefined
logType(f);

logType(5/'a');
logType(5/0);

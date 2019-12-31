// @author Blake Kruppa
function caller (callback) {
  console.log(`caller called with param:
  ${callback}`)
  callback(5,6);
}

function callback(one, two) {
  console.log(`invoked with params: ${one} and ${two}`);
}
caller(callback);
caller((one, two) => {
  console.log(`one + two = ${one+two}`);
})

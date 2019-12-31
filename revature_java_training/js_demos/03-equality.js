// @author Blake Kruppa
// == vs ===,
// == tries its best to ignore type and just compare value
//   this is known as type coercion
// === will compare both type and value, or really more are they the same
//   in memory

function compare(one, two) {
  console.log(`
one = ${one}, and is type: ${typeof(one)}
two = ${two}, and is type: ${typeof(two)}
  one == two evaluates to: ${one == two}
  one === two evaluates to: ${one === two}`)
}
compare(5, '5');
compare(97, 'a');
compare(null, undefined);
compare([], []);
compare([], null);
compare(true, false);
compare(NaN, NaN);
compare(Infinity, Infinity);

// @author Blake Kruppa
'use strict';
funScope();

function funScope() {
  console.log(a); // var will get its declaration hoisted to the top of its scope
  if (true) {
    var a = 5;
  }
  console.log(a);
}

function blockScope() {
  if (true) {
    // console.log(b);
    let b = 10;
  }
}

blockScope();

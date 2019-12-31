// @author Blake Kruppa
const EventEmitter = require('events');

class MyEmitter extends EventEmitter {

}

const myEmitter = new MyEmitter();

myEmitter.on('click', () => {
  console.log('click');
})

myEmitter.on('scroll', () => {
  console.log('scrolled');
})

myEmitter.on('scroll', () => {
  console.log('scrolled 2');
})

console.log('about to emit scroll');
myEmitter.emit('scroll');
console.log('about to emit click');
myEmitter.emit('click');
console.log('done');

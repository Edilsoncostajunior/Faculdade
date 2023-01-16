//sintaxe CommonJS
const a = require('./exportExemple');
const foo = a.foo;
const baz = a.baz;

console.log(foo, baz)
//ES6

import * as A from './exportExemple.js';


const foo2 = A.foo;
const baz2 = A.baz;

console.log(foo2, baz2);

// OU

import {foo,baz} from './exportExemple.js';



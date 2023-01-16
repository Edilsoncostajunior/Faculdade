//sintaxe CommonJS
module.exports ={
    foo: function () {
        return 'Bar';
    },
    baz: 123
}

//sintaxe ES6

export function foo() {
    return 'Bar.';
}
export const baz = 123;

// OU

function foo() {
    return 'Bar.';
}
const baz = 123;

export default {foo, baz};
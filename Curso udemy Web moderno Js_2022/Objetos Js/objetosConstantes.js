// pessoa -> 123 -> {...}
const pessoa = {nome:"jão"};
pessoa.nome = "Pedro";
console.log(pessoa);

// pessoa => 456 -> {...}
//pessoa = {nome : "Ana"}

Object.freeze(pessoa);
pessoa.nome = "Maria";
pessoa.end = " Rua 123"
delete pessoa.nome;

console.log(pessoa);

const pessoaConstante = Object.freeze({nome : "Jâo"});
pessoaConstante.nome = "Maria";
console.log(pessoaConstante);
//Object.preventExtensions

const produto = Object.preventExtensions({
    nome: "qualquer",
    preco: 1.99,
    tag: "promoção"
});

console.log("extensível:", Object.isExtensible(produto));

produto.nome = "Borracha";
produto.descrocao = "Borracha escolar Branca";
delete produto.tag;
console.log(produto);

// Object.seal

const pessoa = {nome: "juliana", idade: 45};
Object.seal(pessoa)
console.log("selado", Object.isSealed(pessoa));

pessoa.sobrenome = "Silva";
delete pessoa.nome;
pessoa.idade = 29;
console.log(pessoa);

//Object.freeze = selado + valores constantes
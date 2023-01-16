let valor; // não inicializado
console.log(valor);

valor = null; // ausência de valor
console.log(valor);

const produto = {};
console.log(produto.preco);
console.log(produto);

produto.preco = 3.50;
console.log(produto);

produto.preco = undefined; // Sempre evitar atribuir undefined
console.log(produto.preco);
console.log(!!produto.preco);

produto.preco = null; // sem valor
console.log(!!produto.preco);
console.log(produto);

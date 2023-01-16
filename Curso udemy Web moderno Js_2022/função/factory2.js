// Factory simples
function criarProduto(nome = "Pipoca", preco = 3) {
    return{
        nome, 
        preco,
        desconto: 0.1
    }
}

console.log(criarProduto())
console.log(criarProduto("Notebook", 2199.99))
console.log(criarProduto("Ferrari", 180000000000))
Array.prototype.map2 = function (callback) {
    const newArray = [];
    for (let index = 0; index < this.length; index++) {
    newArray.push(callback(this[index], index, this))        
    }
    return newArray;
}

const carrinho = [
    '{"nome" : "Borracha", "preco": 3.45}',
    '{"nome" : "Caderno", "preco": 13.90}',   
    '{"nome" : "Kit de Lapis", "preco": 41.22}',   
    '{"nome" : "Caneta", "preco": 7.50}'
]

const paraObjeto = json => JSON.parse(json);
const apenasPreco = produto => produto.preco;

const resultado = carrinho.map2(paraObjeto).map2(apenasPreco)
console.log(resultado);

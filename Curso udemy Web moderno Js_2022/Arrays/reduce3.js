Array.prototype.reduce2 = function (callback, valorIni) {
    const indiceInicial = valorIni ? 0 : 1
    let acumulador = valorIni || this[0];

    for (let index = indiceInicial; index < this.length; index++) {
            acumulador = callback(acumulador, this[index], index, this);        
    }
    return acumulador;
}

const soma = (total, valor) => total + valor;
const nums = [1,2,3,4,5,6];
console.log(nums.reduce2(soma,21));
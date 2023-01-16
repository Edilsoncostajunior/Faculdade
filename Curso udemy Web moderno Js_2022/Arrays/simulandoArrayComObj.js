const quaseArray = {0: 'Rafael' , 1: 'Ana' , 2: 'Bia'}
console.log(quaseArray);
Object.defineProperty(quaseArray, 'toString', {
    value: function () {
        return Object.values(this)
    },
    enumerable: false
})
console.log(quaseArray[0]);

const meuArray =['Rafael' ,'Ana' , 'Bia']
console.log(quaseArray.toString(), meuArray);


// For each
Array.prototype.forEach2 = function (callback) {
    for (let index = 0; index < this.length; index++) {
        callback(this[index], index, this)
    }
}

const aprovados = ['Agatha', 'Aldo', 'DAniel', 'Raquel']

aprovados.forEach2(function (nome, indice) {
    console.log(`${indice + 1}) ${nome}`)
})

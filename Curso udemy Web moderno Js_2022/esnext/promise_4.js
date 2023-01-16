function gerarNumerosEntre(min, max) {
    if (min > max) {
        [max, min] = [min, max]
    }

    return new Promise(resolve =>{

        const fator = max - min + 1
        const aleatorio = parseInt(Math.random() * fator) + min
        resolve(aleatorio)

    })
}

function gerarVariosNumeros() {
    return Promise.all([
        gerarNumerosEntre(1,6000),
        gerarNumerosEntre(1,60,1000), 
        gerarNumerosEntre(1,60,500), 
        gerarNumerosEntre(1,60,3000), 
        gerarNumerosEntre(1,60,200), 
        gerarNumerosEntre(1,60,400) 
      ])
}

console.time('promise')
gerarVariosNumeros()
    .then(numeros =>console.log(numeros))
    .then(()=>{
        console.timeEnd('promise')
    })

function gerarNumerosEntre(min, max, numProibidos) {
    if (min > max) {
        [max, min] = [min, max]
    }

    return new Promise((resolve, reject) =>{
        const fator = max - min + 1
        const aleatorio = parseInt(Math.random() * fator) + min
        if (numProibidos.includes(aleatorio)) {
            reject("numero repetido")
        }else{
            resolve(aleatorio)

        }
    })
}

async function gerarMegaSena(qtdNum) {
    const numeros = []
    try {
        for( let _ of Array(qtdNum).forEach()){
            numeros.push(await gerarNumerosEntre(1,60,numeros))

        }
        return numeros
    } catch (error) {
        throw "Que chato!!"
    }
}

gerarMegaSena(15)
    .then(console.log)
    .catch(console.log)
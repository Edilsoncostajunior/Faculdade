function funcionarOuNao(valor, chanceErro) {
    return new Promise((resolve, reject)=>{
        try {
            if (Math.random() < chanceErro) {
                reject('Ocorreu um erro!')
            }else{
                resolve(valor)
            }
        } catch (error) {
            reject(error)
        }
       
    })
}


funcionarOuNao('Testando...', 0.5)
    .then(v => console.log(`Valor ${v}`))
    .then(
        v => console.log(v),
        err => console.log(`Erro esp.: ${err}`)
    )
    .catch(err => console.log(`erro: ${err}`))
    .then(() => console.log(`FIM!!`))
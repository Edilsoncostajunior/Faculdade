/*
setTimeout(() => {
    console.log('executanto callback...')

    setTimeout(() => {
        console.log('executanto callback...')

        setTimeout(() => {
            console.log('executanto callback...')

        }, 2000);
    }, 2000);
}, 2000);*/

function esperarPor(tempo = 2000) {
    return new Promise(function(resolve){
        setTimeout(() => {
            console.log('executanto promise...')
        }, tempo);
    })
}

esperarPor(3000).then(texto =>console.log(texto))
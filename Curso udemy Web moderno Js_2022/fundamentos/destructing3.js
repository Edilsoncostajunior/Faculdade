function rand({min = 0, max = 1000}){
    const valor = Math.random() * (max - min) + min
    return Math.floor(valor)
}


const objt = {max: 50, min: 40}
console.log(rand(objt));
console.log(rand({min: 955}));
console.log(rand({}));
//console.log(rand()); não da pra fazer isso.
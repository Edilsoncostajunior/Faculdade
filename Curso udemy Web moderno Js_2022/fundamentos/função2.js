//Armazenando uma função em uma varivael
const imprimmirSoma = function (a,b) {
    console.log(a + b);
    
};
imprimmirSoma(2,3);

//Armazenando uma função arrow em variavel

const soma = (a, b) =>{
    return console.log('Soma é igual a = ', a + b);
}
soma(2,3);

const subtracao = (a,b) => console.log('Subtração é igual a = ',a - b);

subtracao(2,3);
//função sem retorno
function imprimirsoma(x,y) {
    console.log(x+y)
    
};

imprimirsoma(2,3);
imprimirsoma(2);
imprimirsoma(2, 10, 4, 5, 6, 7, 8);
imprimirsoma();

//função com retorno
console.log('Função com retorno...\n');
function soma(a , b = 1) {

    return console.log(a + b); 
    
};

soma(2,3);
soma(2);
soma();
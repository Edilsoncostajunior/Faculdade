// Closure é o escopo criado quando uma gunção é declarada
// Esse escopo permite a função acessar e manipular variáveis externas à função

const x = "Global";

function fora(){
    const x = "local";
    function dentro() {
        return x;
    }
    return dentro;
}

const minhaFuncao = fora();

console.log(minhaFuncao());
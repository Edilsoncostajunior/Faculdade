class Pessoa {
    constructor(nome){
        this.nome = nome;
    }

    falar(){
        console.log(`Meu nome é ${this.nome}`);
    } 
}

const p1 = new Pessoa("Jão");
p1.falar();

const p2 = new Pessoa("Edilson");
p2.falar();

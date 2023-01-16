const escola = [{
    nome: "turma A1",
    alunos: [{
        nome: "Gustav",
        nota: 8.1
    }, {
        nome: "ana",
        nota: 9.3
    }]
}, {
    nome: "Turma B1",
    alunos: [{
        nome: "Beca",
        nota: 8.9
    }, {
        nome: "Berto",
        nota: 7.3
    }

    ]
},{
    nome: "Turma C1",
    alunos: [{
        nome: "Joy",
        nota: 10.0
    }, {
        nome: "Ivan",
        nota: 7.7
    }

    ]
}
]

const getNotaDoAluno = aluno => aluno.nota;
const getNotaDaTurma = turma => turma.alunos.map(getNotaDoAluno);

const notas1 = escola.map(getNotaDaTurma);
console.log(notas1);

/*
Array.prototype.flatMap2 = function (callback) {
    return Array.prototype.concat.apply([], this.map(callback))
}
*/
const notas2 = escola.flatMap(getNotaDaTurma)
console.log(notas2);
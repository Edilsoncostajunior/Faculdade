const pilotos = ['Vettel', 'Alonso', 'Raikkonen', 'Massa'];
pilotos.pop();
console.log(pilotos);

pilotos.push("Verstappen");
console.log(pilotos);

pilotos.shift()// Remove o primeiro
console.log(pilotos);

pilotos.unshift("Hamilton");
console.log(pilotos);

// Splice pode adicionar e remover elementos

pilotos.splice(2,0 , 'Bottas', "Massa");
console.log(pilotos);


const algunsPilotos = pilotos.slice(2);// novo array
console.log(algunsPilotos);

const algunsPilotos2 = pilotos.slice(1, 4);
console.log(algunsPilotos2);

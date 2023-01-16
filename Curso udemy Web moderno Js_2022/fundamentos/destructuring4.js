function rand([min = 0, max = 1000]) {
    if(min > max) [min, max] = [max, min];
    const valor = Math.random() * (max - min) + min;
    Math.floor(valor);
    return console.log(Math.floor(valor));
}

rand([50, 40]);
rand([922]);
rand([,10])
rand([])
//rand(), o mesmo problema do programa anterior.
function peesoa(){
    this.idade = 0;

    setInterval(function name() {
        this.idade++
        console.log(this.idade)
    }.bind(this),1000)
}

new peesoa
const port = 3030;

const express = require('express');
const app = express();
const bodyParser = require('body-parser')
const bancodeDados = require('./bancodeDados');

app.use(bodyParser.urlencoded({extended: true}))

app.get('/produtos', (req, resp, next) =>{
    resp.send(bancodeDados.getProdutos())
})

app.get('/produtos/:id', (req, resp, next)=>{
    resp.send(bancodeDados.getProduto(req.params.id))
})

app.post('/produtos', (req, resp, next)=>{
    const produto = bancodeDados.salvarProduto({
        nome: req.body.nome,
        preco: req.body.preco
    })
    resp.send(produto)
})

app.put('/produtos/:id', (req, resp, next)=>{
    const produto = bancodeDados.salvarProduto({
        id: req.params.id,
        nome: req.body.nome,
        preco: req.body.preco
    })
    resp.send(produto)
})

app.delete('/produtos/:id', (req, resp, next)=>{
    const produto = bancodeDados.excluirProduto(req.params.id)
    resp.send(produto)
})

app.listen(port, ()=>{
    console.log(`Servidos executando na porta ${port}.`)
})


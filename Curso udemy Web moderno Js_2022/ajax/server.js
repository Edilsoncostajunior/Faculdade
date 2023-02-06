const bodyParser = require('body-parser')
const express = require('express')
const app = express()

app.use(express.static('.'))
app.use(bodyParser.urlencoded({ extended: true}))
app.use(bodyParser.json())

const multer = require('multer')

const storage = multer.diskStorage({
    destination: function(req, file, callback){
        callback(null, './uploud')
    },
    filename: function (req, file, callback) {
        callback(null, `${Date.now()}_${file.originalname}`)
    }
})

const uploud = multer({storage}).single('arquivo')

app.post('/uploud', (req, resp)=>{
    uploud(req, resp, err =>{
        if(err){
            return resp.end("Ocorreu um erro.")
        }
        resp.end("Concluido com sucesso.")
    })
}
)

app.post('/formulario', (req, res)=>{
    res.send({
        ...req.body,
        id: 1
    })
})


app.get('/parOuImpar', (req, res) =>{
    //req.body
    //req.query
    //req.params
    const par = parseInt(req.query.numero) % 2 === 0
    res.send({
        resultado: par? 'par': 'impar'
    })

})

app.listen(8080, () => console.log("Executando..."))

import Client from "@/core/Client";
import { useState } from "react";
import Botao from "./Botao";
import Input from "./Input";

interface FormProps{
    client: Client
    clienteMudou?: (client: Client) => void
    cancelado?: () => void
}

export default function Form(params: FormProps){
    const id = params.client?.id
    const [nome, setNome] = useState(params.client?.nome ?? '')
    const [idade, setIdade] = useState(params.client?.idade ?? 0)
    return(
        <div>
            {id?<Input className="mb-4" readonly text="Código" value={id}/>: false }
            <Input className="mb-4" text="Nome" value={nome} onChange={setNome}/>
            <Input text="Idade" value={idade} type="number" onChange={setIdade}/>

            <div className="flex justify-end mt-7">
                <Botao className="mr-2" onClick={()=>params.clienteMudou?.(new Client(nome, +idade, id))}>{id? "Alterar": "Salvar"}</Botao>
                <Botao cor="gray" onClick={params.cancelado}> Cancelar</Botao>
            </div>
        </div>
    )
}
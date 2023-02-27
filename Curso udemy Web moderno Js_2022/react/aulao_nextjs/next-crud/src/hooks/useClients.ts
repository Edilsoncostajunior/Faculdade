import ClientCollection from "@/backend/db/ClientCollection"
import Client from "@/core/Client"
import ClientRespository from "@/core/ClientRepository"
import { useState, useEffect } from "react"
import useTableOrForm from "./useTableOrForm"

export default function useClients() {

    const repo: ClientRespository = new ClientCollection

    const [clients, setClients] = useState([])

    const [client, setClient] = useState<Client>(Client.vazio())

    const {tabelaVisivel, formularioVisivel, exibirFormulario, exibirTabela} = useTableOrForm()

    useEffect(getAll, [])

    function getAll() {
        repo.obterTodos().then(clients => {
            setClients(clients)
            exibirTabela()
        })

    }

    function selectClient(client: Client) {
        setClient(client)
        exibirFormulario()
    }

    async function deleteClient(client: Client) {
        await repo.delete(client)
        getAll()
    }

    async function saveClient(client: Client) {
        await repo.salvar(client)
        getAll()
    }
    function newClient() {
        setClient(Client.vazio())
        exibirFormulario()
    }

    return{
        saveClient,
        newClient,
        deleteClient,
        selectClient,
        getAll,
        client,
        clients,
        tabelaVisivel,
        exibirTabela

    }
}
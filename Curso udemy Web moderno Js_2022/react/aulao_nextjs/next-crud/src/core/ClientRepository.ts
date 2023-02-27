import Client from "./Client";

export default interface ClientRespository{
    salvar(client: Client): Promise<Client>
    delete(client: Client): Promise<void>
    obterTodos(): Promise<Client[]>
}
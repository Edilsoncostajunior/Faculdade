import Head from 'next/head'
import Image from 'next/image'
import styles from '@/styles/Home.module.css'
import Layout from '@/components/Layout'
import Tabela from '@/components/Tabela'
import Client from '@/core/Client'
import Botao from '@/components/Botao'
import Form from '@/components/Fom'
import { useEffect, useState } from 'react'
import ClientRespository from '@/core/ClientRepository'
import ClientCollection from '@/backend/db/ClientCollection'
import useClients from '@/hooks/useClients'



export default function Home() {

  const {saveClient, selectClient, deleteClient, newClient, getAll, client, clients, tabelaVisivel, exibirTabela} = useClients()
  

  return (
    <div className={`flex justify-center items-center h-screen bg-gradient-to-r from-blue-500 to-purple-500 text-white`}>

      <Layout titulo="Cadastro Simples">
        {tabelaVisivel ? (
          <>
            <div className=' flex justify-end'>
              <Botao cor="green" className='mb-4' onClick={newClient}>Novo Cliente</Botao>
            </div>
            <Tabela clientes={clients} clienteExcluido={deleteClient} clienteSelecionado={selectClient}></Tabela>
          </>
        ):(
          <>
            <Form client={client} cancelado={exibirTabela } clienteMudou={saveClient}></Form>
          </>
        )}


      </Layout>

    </div>
  )
}
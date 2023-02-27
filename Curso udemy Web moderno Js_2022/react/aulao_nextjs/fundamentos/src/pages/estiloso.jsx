import Styles from '../styles/Estiloso.module.css'
import Link from "next/link"
import Layout from '../components/Layout'

export default function Estiloso(){
    return(
        <Layout titulo="Exemplo de CSS modularizado">
            <div className={Styles.roxo}>
                <h1>Estilo usando CSS Módulos</h1>
            </div>
            <div className={Styles.roxo}>
                <h1>Filho 2</h1>
            </div>
        </Layout>
        
    )
}
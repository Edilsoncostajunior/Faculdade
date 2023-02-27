import Link from "next/link";
import Styles from '../styles/Layout.module.css'

export default function Layout(params) {
    return(
        <div className={Styles.layout}>
            <div className={Styles.cabecalho}>
                {params.titulo ?? "Mais um Exemplo"}
            <Link href="/">Voltar</Link>
            </div>
            <div className={Styles.conteudo}>
            {params.children}
            </div>
        </div>
    )
}
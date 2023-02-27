import Link from "next/link"
import Style from '../styles/Navegador.module.css'

export default function Navegador(params) {
    return (
        <Link href={params.destino} passHref >
            <div className={Style.navegador} style={{
                backgroundColor: params.cor ?? 'dodgerblue'
            }}>
                {`${params.titulo}`}
            </div>
        </Link>
    )
}
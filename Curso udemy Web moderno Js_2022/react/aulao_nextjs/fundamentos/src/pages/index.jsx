import Link from "next/link"
import Navegador from '../components/Navegador'

export default function Home(){
    return (
        
        <div style={{
            display: 'flex',
            justifyContent: 'center',
            alignItems: 'center',
            height: '100vh',
            flexWrap: 'wrap'
        }}>
            <Navegador destino="/estiloso" titulo="Arquivo Estiloso"/>
            <Navegador destino="/app" titulo="Arquivo Exemplo" cor="purple"/>
            <Navegador destino="/jsx" titulo="Arquivo Jsx" cor="crimson"/>
            <Navegador destino="/navegacao/" titulo="Navegação" cor="green"/>
            <Navegador destino="/cliente/sp-2/321 " titulo="Navegação 02" cor="blue"/>
            <Navegador destino="/estado " titulo="Componente com Estado" cor="pink"/>
            <Navegador destino="/integracao " titulo="Integração com API " cor="gray"/>
            <Navegador destino="/estatico " titulo="Conteudo Estatico " cor="fa054a"/>
        </div>
    )
}
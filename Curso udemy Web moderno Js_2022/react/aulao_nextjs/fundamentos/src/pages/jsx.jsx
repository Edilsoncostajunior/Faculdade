import Layout from "../components/Layout"

export default function Jsx() {

    const titulo = <h1>JSX é um conceito Central</h1>

    function subtitle() {
        return <h2>{"muito legal".toUpperCase()}</h2>

    }

    return(

        <Layout titulo="Entendendo JSX">
            {titulo}
            {subtitle()}
            <p>
                {JSON.stringify({nome: 'Jão', idade: 30})}
            </p>
        </Layout >
    )
}
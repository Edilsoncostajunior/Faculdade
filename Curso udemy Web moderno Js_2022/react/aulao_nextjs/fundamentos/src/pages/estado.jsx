import { useState } from "react";
import Layout from "../components/Layout";

export default function Estado(params) {

    const [numero, alterarNumero] = useState(0)

    function Incrementar() {
        alterarNumero(numero+1)
    }
    return(
        <Layout titulo="Componente com Estado">
            <div>{numero}</div>
            <button onClick={Incrementar}>Incrementar</button>
        </Layout>
    )
}
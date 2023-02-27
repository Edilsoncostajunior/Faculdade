import Layout from "../../../components/Layout";
import {useRouter} from 'next/router'

export default function ClenteProCodigo(params) {
    const router = useRouter();

    return(
        <Layout titulo="Navegação dinânima">
            <div>Código = {router.query.codigo}</div>
            <div>FIlial = {router.query.filial}</div>
        </Layout>
    )
}
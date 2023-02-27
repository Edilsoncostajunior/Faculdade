interface InputProps{
    type?: 'text' | 'number'
    text: string
    value: any
    readonly?: boolean
    className?: string
    onChange?: (valor: any) => void
}

export default function Input(params: InputProps){
    return(
        <div className={`flex flex-col ${params.className}`}>
            <label className="mb-2" htmlFor="">{params.text}</label>
            <input onChange={e => params.onChange?.(e.target.value)} 
            className={`
            border border-purple-500 rounded-lg focus:outline-none bg-gray-50 px-4 py-2
            ${params.readonly? '' :  'focus:bg-white'}`} 
            type={params.type?? 'text'} 
            value={params.value} 
            readOnly={params.readonly}/>
        </div>
    )
}
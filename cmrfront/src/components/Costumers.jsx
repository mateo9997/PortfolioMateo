import { useNavigate } from "react-router-dom"
import { useState, useEffect } from "react"
import clientAxios from "../config/ClientAxios"


export const Costumers = () => {

    const [costumers, setCostumers] = useState('')


    useEffect(() => {
        const obtainCostumer = async() => {
            try {
                const { data } = await clientAxios('/costumers')
                console.log(data)
                setCostumers(data);
            } catch (error) {
                console.log(error)
            }
        }

        obtainCostumer()
    }, [])

    if(!costumers) {
        return <h1>Loading...</h1>
    }

    return (
        
        <ul>
            {costumers.map((u) => (
                <li
                    key={u.getCosOppId}
                >{u.name} </li>
            ))}
        </ul>
    )
}

export default Costumers
import React from 'react'
import { useState, useEffect } from "react"
import clientAxios from "../config/ClientAxios"

function Opportunities() {
    const [opportunities, setOpportunities] = useState('')


    useEffect(() => {
        const obtainOpportunity = async() => {
            try {
                const { data } = await clientAxios('/opportunities')
                console.log(data)
                setOpportunities(data);
            } catch (error) {
                console.log(error)
            }
        }

        obtainOpportunity()
    }, [])

    if(!opportunities) {
        return <h1>Loading...</h1>
    }

    return (
        <ul>
            {opportunities.map((u) => (
                <li
                    key={u.getCosOppId}
                >{u.name} </li>
            ))}
        </ul>
    )
}

export default Opportunities
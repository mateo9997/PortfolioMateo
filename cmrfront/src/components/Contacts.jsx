import React from 'react'
import { useState, useEffect } from "react"
import clientAxios from "../config/ClientAxios"

function Contacts() {
    const [CosOpp, setCosOpp] = useState('')


    useEffect(() => {
        const obtainContacts = async() => {
            try {
                const { data } = await clientAxios('/opportunities')
                console.log(data)
                setCosOpp(data);
            } catch (error) {
                console.log(error)
            }
        }

        obtainContacts()
    }, [])

    if(!CosOpp) {
        return <h1>Loading...</h1>
    }

    return (
        <div>
            <ul>
                {CosOpp.map((u) => (
                    <li key={u.cosOppId}>
                        {u.name} 
                        <ul>
                            {u.contactsList.map((c) =>{
                                return (
                                    <li key={c.contactId}>
                                        {c.description}
                                    </li>
                                )
                            })}
                        </ul>
                    </li>
                ))}
            </ul>
        </div>
    )
}

export default Contacts
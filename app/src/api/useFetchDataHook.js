import {useEffect, useState} from "react";
import axios from "axios";

export const useFetchDataHook=(baseUrl)=>{
    const[data, setData]= useState({});
    const[isLoaded, setIsLoaded] = useState(false)
    useEffect(()=>{
        const fetchData = async ()=>{
            try {
                const {data:response}= await axios.get(baseUrl)
                setData(response)
                setIsLoaded(true)
            } catch (error){
                console.error(error)
            }
        }
        fetchData();
    },[baseUrl])
    return {data,isLoaded}
}
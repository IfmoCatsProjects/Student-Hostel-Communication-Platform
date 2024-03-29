import axios from 'axios'

axios.defaults.baseURL = 'http://localhost:8080'
axios.defaults.headers.post["Content-Type"] = 'application/json'

export function fetchData(method: string, url : string, data : any) {
    return axios({
        method : method,
        url : url,
        data : data || {}
    })
}
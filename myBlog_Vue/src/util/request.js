import axios from 'axios'

const instace = axios.create({
    baseURL: '/api',
    timeout: 5000
})

//封装请求的api
const callapi = (method = "GET", url, data = {}) => {
    return instace({
      method,
      url,
      params: method === "GET" ? data : {},
      data: method === "POST" ? data : {},
    });
  };
  //封装GET请求函数
  export const getapi = (url, data) => callapi("GET", url, data);
  export const postapi = (url, data) => callapi("POST", url, data);
  

export default instace


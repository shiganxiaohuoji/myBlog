import {getapi,postapi} from '@/util/request'
import request from '@/util/request'

// export function getTagList(){
//     return request({
//         URL: "/bloglist/getList",   
//         method: 'GET',
//     })
// }


export const getcategoryList = () => getapi('bloglist/getList')
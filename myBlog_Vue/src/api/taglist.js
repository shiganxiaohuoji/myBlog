import { getapi,postapi } from "../util/request";


export const gettagList = () => getapi('Tag/taglist')
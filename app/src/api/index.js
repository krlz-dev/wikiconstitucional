import {useFetchDataHook} from "./useFetchDataHook";

export const useGetArticle = () => {
   const {data, isLoaded} = useFetchDataHook('https://mocki.io/v1/e62fc0ce-a39c-448d-86ab-ed004f98885c');
   return {data, isLoaded};
}

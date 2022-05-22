import {useFetchDataHook} from "./useFetchDataHook";

export const useGetArticle = (articleId) => {
   const {data, isLoaded} = useFetchDataHook(`https://econstitucional-service.herokuapp.com/article/${articleId}`);
   return {data, isLoaded};
}

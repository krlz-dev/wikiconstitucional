import React from "react";
import HeaderComponent from "../../components/header";
import Article from "../../components/article";
import {useGetArticle} from "../../api";
import {useParams} from "react-router-dom";

function ArticleScreen() {
    const {articleId} = useParams()
    const {data, isLoaded} = useGetArticle(articleId);
    return (
        <>
            <HeaderComponent/>
            <Article articleData={data} isLoaded={isLoaded}/>
        </>
    )
}

export default ArticleScreen;
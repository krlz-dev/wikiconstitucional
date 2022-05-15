import React from "react";
import Header from "../../components/header";
import Article from "../../components/article";
import {useParams} from 'react-router-dom';
import {useGetArticle} from "../../api";

function ArticleScreen() {
    const {articleId} = useParams()
    console.log(articleId)
    const {data, isLoaded} = useGetArticle();
    return (
        <>
            <Header/>
            <Article articleData={data} isLoaded={isLoaded} />
        </>
    )
}

export default ArticleScreen;
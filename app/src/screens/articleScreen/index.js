import React from "react";
import HeaderComponent from "../../components/header";
import Article from "../../components/article";
import {useParams} from 'react-router-dom';
import {useGetArticle} from "../../api";

function ArticleScreen() {
    const {articleId} = useParams()
    console.log(articleId)
    const {data, isLoaded} = useGetArticle();
    return (
        <>
            <HeaderComponent/>
            <Article articleData={data} isLoaded={isLoaded} />
        </>
    )
}

export default ArticleScreen;
import React from "react";
import Header from "../../components/header";
import Article from "../../components/article";
import {useParams} from 'react-router-dom';

function ArticleScreen() {
    const {articleId} = useParams()
    console.log(articleId)
    return (
        <>
            <Header/>
            <Article/>
        </>
    )
}

export default ArticleScreen;
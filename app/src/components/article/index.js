import React from 'react';
import Articles from "./articles";
import Navigationsection from "./navigationsection";
import styles from "./style.module.css";

function Article({articleData, isLoaded}) {
    return (
        <div className={styles.articleContainer}>
            <div className={styles.titleArticleContainer}>
                <h1 className={styles.articleTitle}>{articleData.title}</h1>
                <hr className={styles.titleHr}/>
                <p className={styles.articleShortDescription}>{articleData.content}</p>
            </div>
            <div className={styles.articlesNavContainer}>
                <Articles sections={articleData.sections} isLoaded={isLoaded}/>
                <hr className={styles.separation}/>
                <Navigationsection/>
            </div>
        </div>
    )
}

export default Article;
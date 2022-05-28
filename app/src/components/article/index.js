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
                <p className={styles.articleContent} dangerouslySetInnerHTML={{__html: articleData.content}}/>
            </div>
            <div className={styles.articleShortDescriptionContainer}>
                <p className={styles.articleShortDescription}
                   dangerouslySetInnerHTML={{__html: articleData.presentation}}/>
            </div>
            <div className={styles.articlesNavContainer}>
                <div>
                    <div className={styles.articleDescriptionContainer}>
                        <p className={styles.articleDescription}
                           dangerouslySetInnerHTML={{__html: articleData.description}}/>
                    </div>
                    <Articles sections={articleData.sections} isLoaded={isLoaded}/>
                </div>
                <hr className={styles.separation}/>
                <div>
                    <Navigationsection/>
                </div>

            </div>
        </div>
    )
}

export default Article;
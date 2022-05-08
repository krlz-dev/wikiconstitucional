import React from 'react';
import styles from './style.module.css';
import Section from "./section";

function Articles({articles}) {

    return (
        <article className={styles.articleParagraphs}>
            {
                articles.map(article => {
                    return (<Section title={article.title} paragraph={article.paragraph}/>)
                })
            }
        </article>
    );
}

export default Articles;
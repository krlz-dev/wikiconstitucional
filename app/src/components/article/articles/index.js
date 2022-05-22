import React from 'react';
import styles from './style.module.css';
import Section from "./section";


function Articles({sections, isLoaded}) {
    return (
        <article className={styles.articleParagraphs}>
            {isLoaded ?
                    sections.map((section, index) => {
                        return (<Section key={index} title={section.title} paragraph={section.content}/>)
                    })
                :
                <></>
            }
        </article>
    );
}

export default Articles;
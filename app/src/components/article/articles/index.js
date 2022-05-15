import React from 'react';
import styles from './style.module.css';
import Section from "./section";


function Articles({sections, isLoaded}) {
    console.log(sections)
    return (
        <article className={styles.articleParagraphs}>
            {isLoaded ?
                    sections.map(section => {
                        return (<Section title={section.title} paragraph={section.content}/>)
                    })
                :
                <></>
            }
        </article>
    );
}

export default Articles;
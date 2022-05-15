import React from 'react';
import styles from './style.module.css';

function Section ({title, paragraph}) {
    return(
        <section className={styles.section}>
            <h2 className={styles.paragraphTitle}>{title}</h2>
            <p className={styles.paragraph} dangerouslySetInnerHTML={{ __html: paragraph }} ></p>
        </section>
    )
}

export default Section;
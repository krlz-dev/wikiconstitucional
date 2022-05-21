import React from 'react';
import styles from './style.module.css';

function HeaderComponent() {
    return (
        <header className={styles.headerContainer}>
            <span>Hello</span>
            <input className={styles.searchInput} type="text" placeholder="Search"/>
        </header>
    );
}

export default HeaderComponent;
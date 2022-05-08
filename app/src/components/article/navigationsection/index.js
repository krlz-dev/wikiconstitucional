import React from 'react';
import styles from "./style.module.css";

function Navigationsection() {
    return (
        <div className={styles.navigationContainer}>
            <ul className={styles.navigationList}>
                <li className={styles.navigationListItem}>hello there</li>
                <li className={styles.navigationListItem}>miau aqui</li>
                <li className={styles.navigationListItem}>list list list</li>
                <li className={styles.navigationListItem}> Etiam ante lorem, elementum id leo non</li>
            </ul>
        </div>
    )
}

export default Navigationsection;
import React from 'react';
import styles from './style.module.css';
import AppBar from '@mui/material/AppBar';
import Typography from '@mui/material/Typography';

function Header() {
    return (
        <AppBar position="static" color="inherit">
            <div className={styles.headerContainer}>
                <Typography>Hello</Typography>
                <input className={styles.searchInput} type="text" placeholder="Search"/>
            </div>
        </AppBar>
    );
}

export default Header;
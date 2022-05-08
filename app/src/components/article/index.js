import React from 'react';
import Articles from "./articles";
import Navigationsection from "./navigationsection";
import styles from "./style.module.css";

function Article() {
    const mockdata = [{
        title: "I am the title",
        paragraph: "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis nunc tortor, suscipit sed nisl vitae, dapibus scelerisque risus. Praesent euismod vitae nibh in iaculis. Praesent vestibulum, eros at dictum porta, ligula lorem rutrum risus, sit amet lobortis dui ligula a ex. Morbi et massa porttitor, blandit sapien ac, malesuada velit. Aliquam erat volutpat. Nam dignissim elit et dignissim lacinia. Curabitur mattis efficitur erat, eget luctus ex sagittis nec."
    }, {
        title: "I am the title",
        paragraph: "Aliquam at est porttitor, cursus orci eu, venenatis magna. Quisque porta nibh quis libero varius lacinia. Quisque eget molestie magna. Morbi quis mollis dui. Duis finibus lacus tortor, id sodales quam consequat vel. Nullam ultrices vitae mi egestas blandit. Pellentesque maximus dolor id lacus eleifend, non molestie lacus volutpat."
    }];
    return (
        <div className={styles.articleContainer}>
            <div className={styles.titleArticleContainer}>
                <h1 className={styles.articleTitle}>Article 1</h1>
                <hr className={styles.titleHr}/>
                <p className={styles.articleShortDescription}>Donec eget magna accumsan, eleifend nunc vel, aliquet
                    elit. Etiam
                    eu porta libero. Maecenas
                    vulputate.</p>
            </div>
            <div className={styles.articlesNavContainer}>
                <Articles articles={mockdata}/>
                <hr className={styles.separation}/>
                <Navigationsection/>
            </div>
        </div>
    )
}

export default Article;
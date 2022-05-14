import React from "react";
import {
    BrowserRouter,
    Routes,
    Route,
} from "react-router-dom";
import NavigationScreen from "./screens/navigationScreen";
import ArticleScreen from "./screens/articleScreen";

function Routing() {
    return (
        <BrowserRouter>
            <Routes>
                <Route exact path="/article/:articleId" element={<ArticleScreen/>}/>
                <Route exact path="/" element={<NavigationScreen/>}/>
            </Routes>
        </BrowserRouter>
    )
}

export default Routing;
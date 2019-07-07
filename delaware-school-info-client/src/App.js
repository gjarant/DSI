import React, { Component } from 'react';
import './App.css';
import { BrowserRouter as Router, Route } from "react-router-dom";
import NavBar from './components/NavBar/NavBar';
import SchoolCompare from './components/SchoolCompare/SchoolCompare';

class App extends Component {
  render() {
    return (
      <Router>
      <div>
        <NavBar />
        <Route exact path="/" component={SchoolCompare} />
      </div>
    </Router>
    );
  }
}

export default App;

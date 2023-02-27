import './App.css'
import React from 'react'
import 'bootstrap/dist/css/bootstrap.min.css'
import 'font-awesome/css/font-awesome.min.css'

import {BrowserRouter} from 'react-router-dom'

import Routes from './Routes'
import Home from '../components/home/Home'
import Footer from '../components/template/Footer'
import Nav from '../components/template/Nav'
import Logo from '../components/template/Logo'

export default props =>
    <BrowserRouter>
        <div className="app">
            <Logo/>
            <Nav/>
            <Routes/>
            <Footer/>
        </div>
    </BrowserRouter>
    
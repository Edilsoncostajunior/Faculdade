import './Nav.css'
import React from 'react'
import NavItem from './NavItem'
import { Link } from 'react-router-dom'

export default props =>
    <aside className="menu-area">
        <aside className="menu-area">
            <nav className="menu">
                {/* Refatorar */}
                {/* <Link to="/" id="">
                    <i className="fa fa-home"></i> Início
                </Link>
                <Link to="/users">
                    <i className="fa fa-users"></i> Usuários
                </Link> */}
                <NavItem href="/" icon="home" text="Início"></NavItem>
                <NavItem href="/users" icon="users" text="Usuários"></NavItem>
            </nav>
        </aside>

    </aside>
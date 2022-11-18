import logo from '../../assets/img/header-logo.svg';

import './styles.css';

function Header() {
  return(
    <header>
      <div className="dsmeta-logo-container">
        <img src={logo} alt="DSMeta" />
        <h1>DSMeta</h1>
        <p>
          Desenvolvido por
          <a href="https://github.com/M4rks0"> @M4rks0 </a>
        </p>
      </div>
    </header>
  )
}

export default Header;

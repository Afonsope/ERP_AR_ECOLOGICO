/**
 * nav.js – AR Ecológico ERP
 * Injeta o menu lateral e a topbar em todas as páginas,
 * gerencia navegação entre páginas e estado ativo do menu.
 */

// ── Definição dos itens de menu ──────────────────────────────────────────
const menuItems = [
  { id: 'dashboard',    icon: 'fa-house',          label: 'Dashboard',      href: '../index.html' },
  {
    id: 'os', icon: 'fa-clipboard-list', label: 'Ordem de Serviço', submenu: [
      { icon: 'fa-plus',  label: 'Nova OS',    href: 'os-nova.html' },
      { icon: 'fa-list',  label: 'Listar OS',  href: 'os-lista.html' },
    ]
  },
  {
    id: 'clientes', icon: 'fa-users', label: 'Clientes', submenu: [
      { icon: 'fa-user-plus', label: 'Cadastrar', href: 'clientes-cadastro.html' },
      { icon: 'fa-list',      label: 'Listar',    href: 'clientes-lista.html' },
    ]
  },
  { id: 'servicos',    icon: 'fa-hammer',          label: 'Serviços',       href: 'servicos.html' },
  { id: 'estoque',     icon: 'fa-boxes-stacked',   label: 'Estoque',        href: 'estoque.html' },
  { id: 'contratos',   icon: 'fa-file-signature',  label: 'Contratos',      href: 'contratos.html' },
  {
    id: 'financeiro', icon: 'fa-money-bill-wave', label: 'Financeiro', submenu: [
      { icon: 'fa-arrow-down',  label: 'Contas a Receber', href: 'financeiro-receber.html' },
      { icon: 'fa-arrow-up',    label: 'Contas a Pagar',   href: 'financeiro-pagar.html' },
      { icon: 'fa-chart-line',  label: 'Fluxo de Caixa',  href: 'financeiro-fluxo.html' },
      { icon: 'fa-receipt',     label: 'DRE',              href: 'financeiro-dre.html' },
    ]
  },
  { id: 'relatorios',  icon: 'fa-chart-column',    label: 'Relatórios',     href: 'relatorios.html' },
  {
    id: 'rh', icon: 'fa-users-gear', label: 'Funcionários', submenu: [
      { icon: 'fa-user-tie', label: 'Cadastrar',        href: 'rh-cadastro.html' },
      { icon: 'fa-clock',    label: 'Controle de Ponto',href: 'rh-ponto.html' },
      { icon: 'fa-star',     label: 'Desempenho',       href: 'rh-desempenho.html' },
    ]
  },
  { id: 'fiscal',      icon: 'fa-file-invoice',    label: 'Fiscal / NFS-e', href: 'fiscal.html' },
  { id: 'config',      icon: 'fa-gear',            label: 'Configurações',  href: 'configuracoes.html' },
  {
    id: 'ajuda', icon: 'fa-circle-question', label: 'Ajuda', submenu: [
      { icon: 'fa-book',    label: 'Documentação', href: '#' },
      { icon: 'fa-headset', label: 'Suporte',      href: '#' },
    ]
  },
];

// ── Detecta a página atual ────────────────────────────────────────────────
function getActivePage() {
  const path = window.location.pathname.split('/').pop() || 'index.html';
  return path;
}

// ── Gera o HTML do sidebar ───────────────────────────────────────────────
function buildSidebar(activePageId) {
  const isRoot = !window.location.pathname.includes('/pages/');
  const prefix = isRoot ? 'pages/' : '';

  let html = `
    <nav class="nav-side-menu">
      <div class="brand">
        <div class="brand-text">
          <i class="fa fa-leaf brand-icon"></i>
          <span>AR Ecológico</span>
        </div>
      </div>
      <i class="fa fa-bars fa-2x toggle-btn" data-toggle="collapse" data-target="#menu-content"></i>
      <div class="menu-list">
        <ul id="menu-content" class="menu-content collapse out">
  `;

  menuItems.forEach(item => {
    const isActive = item.id === activePageId ? 'active' : '';

    if (item.submenu) {
      // item com submenu
      const isOpen = item.submenu.some(s => s.href && getActivePage() === s.href.replace('pages/', ''));
      html += `
        <li class="menu-item ${isOpen ? 'active' : ''}" data-toggle="collapse" data-target="#${item.id}">
          <a href="#">
            <i class="fa ${item.icon} sidebar-icon"></i>
            <span>${item.label}</span>
            <i class="fa fa-angle-down arrow-icon"></i>
          </a>
        </li>
        <ul class="sub-menu collapse ${isOpen ? 'show' : ''}" id="${item.id}">
      `;
      item.submenu.forEach(sub => {
        const subHref = sub.href === '#' ? '#' : prefix + sub.href;
        html += `<li><a href="${subHref}"><i class="fa ${sub.icon} fa-fw"></i> ${sub.label}</a></li>`;
      });
      html += `</ul>`;
    } else {
      const href = item.href === '../index.html' ? (isRoot ? 'index.html' : '../index.html') : prefix + item.href;
      html += `
        <li class="menu-item ${isActive}" data-id="${item.id}">
          <a href="${href}">
            <i class="fa ${item.icon} sidebar-icon"></i>
            <span>${item.label}</span>
          </a>
        </li>
      `;
    }
  });

  html += `</ul></div></nav>`;
  return html;
}

// ── Gera o HTML da topbar ────────────────────────────────────────────────
function buildTopbar(pageTitle, pageIcon) {
  return `
    <header class="topbar">
      <div class="topbar-left">
        <h1 class="page-title"><i class="fa ${pageIcon}"></i> ${pageTitle}</h1>
      </div>
      <div class="topbar-right">
        <div class="competencia-wrapper">
          <label for="competencia"><i class="fa fa-calendar-days"></i> Competência:</label>
          <select id="competencia" class="competencia-select">
            <option value="">— Selecione o mês —</option>
            <option value="2025-01">Janeiro / 2025</option>
            <option value="2025-02">Fevereiro / 2025</option>
            <option value="2025-03">Março / 2025</option>
            <option value="2025-04">Abril / 2025</option>
            <option value="2025-05">Maio / 2025</option>
            <option value="2025-06">Junho / 2025</option>
          </select>
        </div>
        <div class="user-badge">
          <i class="fa fa-circle-user"></i>
          <span>Administrador</span>
        </div>
      </div>
    </header>
  `;
}

// ── Inicializa o layout ───────────────────────────────────────────────────
function initLayout(activePageId, pageTitle, pageIcon) {
  const sidebar = buildSidebar(activePageId);
  const topbar  = buildTopbar(pageTitle, pageIcon);

  document.body.insertAdjacentHTML('afterbegin', sidebar);

  const main = document.getElementById('pagina');
  if (main) {
    main.insertAdjacentHTML('afterbegin', topbar);
  }

  // Destaque do item ativo via clique
  $(document).ready(function () {
    $('.menu-item > a').on('click', function () {
      $('.menu-item').removeClass('active');
      $(this).closest('.menu-item').addClass('active');
    });
  });
}

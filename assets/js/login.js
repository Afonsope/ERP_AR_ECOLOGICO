/**
 * ============================================================
 *  AR ECOLÓGICO — LOGIN & CADASTRO
 *  Arquivo: js/login.js
 *  Modo: Frontend only (sem backend)
 * ============================================================
 */

// ── Utilitários de UI ─────────────────────────────────────────
function setLoading(btn, loading, label = 'Aguarde...') {
    btn.disabled = loading;
    btn.textContent = loading ? label : btn.dataset.originalText;
}

function showError(formId, msg) {
    const form = document.getElementById(formId);
    let el = form.querySelector('.api-error');
    if (!el) {
        el = document.createElement('p');
        el.className = 'api-error';
        el.style.cssText = 'color:#c0392b;background:#fdecea;padding:10px 14px;border-radius:6px;margin-bottom:12px;font-size:.9rem;';
        form.prepend(el);
    }
    el.textContent = msg;
    el.style.display = 'block';
}

function hideError(formId) {
    const el = document.getElementById(formId)?.querySelector('.api-error');
    if (el) el.style.display = 'none';
}

// ── Lógica principal ──────────────────────────────────────────
document.addEventListener('DOMContentLoaded', () => {

    document.querySelectorAll('button[type="submit"]').forEach(btn => {
        btn.dataset.originalText = btn.textContent;
    });

    // ── Alternar Login / Cadastro ──────────────────────────────
    document.getElementById('showRegister').addEventListener('click', e => {
        e.preventDefault();
        document.getElementById('loginBox').style.display = 'none';
        document.getElementById('registerBox').style.display = 'block';
    });

    document.getElementById('showLogin').addEventListener('click', e => {
        e.preventDefault();
        document.getElementById('registerBox').style.display = 'none';
        document.getElementById('loginBox').style.display = 'block';
    });

    // ── LOGIN ──────────────────────────────────────────────────
    document.getElementById('loginForm').addEventListener('submit', async (e) => {
        e.preventDefault();
        hideError('loginForm');

        const email = document.getElementById('login_user').value.trim();
        const senha = document.getElementById('login_pass').value;

        if (!email) { showError('loginForm', 'Informe seu e-mail.'); return; }
        if (!senha)  { showError('loginForm', 'Informe sua senha.'); return; }

        const btn = e.target.querySelector('button[type="submit"]');
        setLoading(btn, true, 'Entrando...');

        await new Promise(r => setTimeout(r, 800));

        sessionStorage.setItem('ae_usuario', JSON.stringify({ nome: email, papel: 'admin' }));

        window.location.href = '../index.html';
    });

    // ── CADASTRO ───────────────────────────────────────────────
    document.getElementById('registerForm').addEventListener('submit', async (e) => {
        e.preventDefault();
        hideError('registerForm');

        const nome     = document.getElementById('reg_nome').value.trim();
        const email    = document.getElementById('reg_email').value.trim();
        const telefone = document.getElementById('reg_telefone').value.trim();
        const senha    = document.getElementById('reg_pass').value;
        const confirma = document.getElementById('reg_pass_confirm').value;

        if (!nome)           { showError('registerForm', 'Informe seu nome completo.'); return; }
        if (!email)          { showError('registerForm', 'Informe seu e-mail.'); return; }
        if (!telefone)       { showError('registerForm', 'Informe seu telefone.'); return; }
        if (senha.length < 6){ showError('registerForm', 'A senha deve ter no mínimo 6 caracteres.'); return; }
        if (senha !== confirma){ showError('registerForm', 'As senhas não coincidem.'); return; }

        const btn = e.target.querySelector('button[type="submit"]');
        setLoading(btn, true, 'Cadastrando...');

        await new Promise(r => setTimeout(r, 800));

        setLoading(btn, false);
        alert('Cadastro realizado com sucesso! Faça seu login.');
        document.getElementById('showLogin').click();
    });
});
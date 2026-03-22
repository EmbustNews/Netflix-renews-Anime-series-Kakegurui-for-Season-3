const btn = document.querySelector('.share');
const menu = document.getElementById('share-menu');

// Abrir / cerrar menú
btn.addEventListener('click', () => {
  const expanded = btn.getAttribute('aria-expanded') === 'true';

  btn.setAttribute('aria-expanded', !expanded);
  menu.hidden = expanded;
});

// Cerrar si haces clic fuera
document.addEventListener('click', (e) => {
  if (!btn.contains(e.target) && !menu.contains(e.target)) {
    btn.setAttribute('aria-expanded', false);
    menu.hidden = true;
  }
});
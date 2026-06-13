const openBtn = document.getElementById('openForm');
const closeBtn = document.getElementById('closeForm');
const form = document.getElementById('formBlock');

// показать форму
openBtn.addEventListener('click', function (e) {
    e.preventDefault();
    form.classList.remove('form-hidden');
    form.classList.add('form-visible');
});

// скрыть форму
closeBtn.addEventListener('click', function (e) {
    e.preventDefault();
    form.classList.remove('form-visible');
    form.classList.add('form-hidden');
});

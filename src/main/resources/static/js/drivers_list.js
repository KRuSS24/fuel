

const openBtn = document.getElementById('openForm');
const openEditBtn= document.getElementById('openEditForm');
const form = document.getElementById('formBlock');
const editForm = document.getElementById("editForm")

// показать форму
openBtn.addEventListener('click', function (e) {
    e.preventDefault();
    if(form.classList.contains('form-hidden')){
        form.classList.remove('form-hidden');
        form.classList.add('form-visible');
    } else {
        form.classList.remove('form-visible');
        form.classList.add('form-hidden');
    }

});

// скрыть
form.addEventListener('submit', function () {
    // e.preventDefault();
    form.classList.remove('form-visible');
    form.classList.add('form-hidden');
});

//показать Edit форму
openEditBtn.addEventListener('click', function(){
    editForm.classList.remove('form-hidden');
    editForm.classList.add('form-visible');
});

// Скрыть Edit форму
editForm.addEventListener('submit', function (){
    editForm.classList.remove('form-visible');
    editForm.classList.add('form-hidden')
})